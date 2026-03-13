package Session6;

public class TheatreAdvanced {
    public static void main(String[] args) {
        TicketAdvanced poolA = new TicketAdvanced("A", 5);
        TicketAdvanced poolB = new TicketAdvanced("B", 5);

        Runnable comboTask = () -> {
            String name = Thread.currentThread().getName();
            try {
                synchronized (poolA) {
                    System.out.println(name + " đã khóa phòng A");
                    Thread.sleep(100);
                    synchronized (poolB) {
                        System.out.println(name + " đã khóa phòng B");
                        if (poolA.hasTicket() && poolB.hasTicket()) {
                            System.out.println(name + " BÁN COMBO THÀNH CÔNG: " + poolA.getTicket() + " & " + poolB.getTicket());
                        }
                    }
                }
            } catch (InterruptedException e) {}
        };

        new Thread(comboTask, "Quầy 1").start();
        new Thread(comboTask, "Quầy 2").start();
    }
}