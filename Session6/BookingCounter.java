package Session6;

import java.util.Random;

public class BookingCounter {
    private String counterName;
    private TicketPool poolA, poolB;
    private int soldCount = 0;

    public BookingCounter(String name, TicketPool a, TicketPool b) {
        this.counterName = name;
        this.poolA = a;
        this.poolB = b;
    }


    public void run() {
        Random rand = new Random();
        while (poolA.getRemainingCount() > 0 || poolB.getRemainingCount() > 0) {
            TicketPool target = rand.nextBoolean() ? poolA : poolB;
            Ticket t = target.sellTicket();

            if (t == null) {
                target = (target == poolA) ? poolB : poolA;
                t = target.sellTicket();
            }

            if (t != null) {
                soldCount++;
                System.out.println(counterName + " đã bán vé " + t.ticketId);
                try { Thread.sleep(500); } catch (InterruptedException e) {}
            }
        }
    }
    public int getSoldCount() { return soldCount; }
}
