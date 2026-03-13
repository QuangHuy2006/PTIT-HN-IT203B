package Session6;

import java.util.ArrayList;
import java.util.List;

public class TicketAdvanced {
    private String name;
    private List<String> tickets = new ArrayList<>();

    public TicketAdvanced(String name, int qty) {
        this.name = name;
        for (int i = 1; i <= qty; i++) tickets.add(name + "-" + i);
    }

    public synchronized void addTickets(int qty) {
        for (int i = 1; i <= qty; i++) tickets.add(name + "-New-" + i);
        this.notifyAll();
    }

    public synchronized String getTicket() throws InterruptedException {
        while (tickets.isEmpty()) {
            this.wait();
        }
        return tickets.remove(0);
    }

    public synchronized boolean hasTicket() { return !tickets.isEmpty(); }
    public String getName() { return name; }
}
