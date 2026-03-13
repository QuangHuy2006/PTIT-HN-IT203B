package Session6;

public class TheatreBasic {

        public static void main(String[] args) throws InterruptedException {
            TicketPool roomA = new TicketPool("A", 10);
            TicketPool roomB = new TicketPool("B", 10);

            BookingCounter bc1 = new BookingCounter("Quầy 1", roomA, roomB);
            BookingCounter bc2 = new BookingCounter("Quầy 2", roomA, roomB);

            Thread t1 = new Thread((Runnable) bc1);
            Thread t2 = new Thread((Runnable) bc2);

            t1.start();
            t2.start();

            t1.join();
            t2.join();

            System.out.println("\nKết thúc chương trình");

            System.out.println("Quầy 1 bán được: " + bc1.getSoldCount() + " vé");
            System.out.println("Quầy 2 bán được: " + bc2.getSoldCount() + " vé");

            System.out.println("Vé còn lại phòng A: " + roomA.getRemainingCount());
            System.out.println("Vé còn lại phòng B: " + roomB.getRemainingCount());
        }

}
