package Session6;

public class TicketSupplier {
    private TicketPool poolA, poolB;
    public TicketSupplier(TicketPool a, TicketPool b) { this.poolA = a; this.poolB = b; }

    public void run() {
        for (int i = 0; i < 2; i++) {
            try { Thread.sleep(3000); } catch (InterruptedException e) {}
            poolA.addTickets(3);
            poolB.addTickets(3);
            System.out.println("\n[NHÀ CUNG CẤP]: Đã thêm 3 vé vào mỗi phòng\n");
        }
    }
}
