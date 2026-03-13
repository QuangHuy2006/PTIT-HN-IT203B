package Session6;

public class Ticket {
    String ticketId;
    String roomName;
    boolean isSold = false;

    public Ticket(String ticketId, String roomName) {
        this.ticketId = ticketId;
        this.roomName = roomName;
    }
}
