package Session6;

import java.util.ArrayList;
import java.util.List;

public class TicketPool {
    private String roomName;
    private List<Ticket> tickets = new ArrayList<>();

    public TicketPool(String roomName, int quantity) {
        this.roomName = roomName;
        addTickets(quantity);
    }

    public synchronized Ticket sellTicket() {
        for (Ticket t : tickets) {
            if (!t.isSold) {
                t.isSold = true;
                return t;
            }
        }
        return null;
    }

    public synchronized void addTickets(int count) {
        int currentSize = tickets.size();
        for (int i = 1; i <= count; i++) {
            tickets.add(new Ticket(roomName + "-" + (currentSize + i), roomName));
        }
    }

    public synchronized int getRemainingCount() {
        return (int) tickets.stream().filter(t -> !t.isSold).count();
    }
    public String getRoomName() { return roomName; }
}
