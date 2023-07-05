package TicketManager;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TicketManagerTest {
    @Test
    public void testSortTickets() {
        TicketRepository repo = new TicketRepository();
        TicketManager manager = new TicketManager(repo);
        Ticket ticket1 = new Ticket(1, "SPB", "MSK", 300, 60);
        Ticket ticket2 = new Ticket(2, "MSK", "SPB", 700, 70);
        Ticket ticket3 = new Ticket(3, "SPB", "MSK", 100, 70);
        Ticket ticket4 = new Ticket(4, "SPB", "MSK", 200, 60);
        Ticket ticket5 = new Ticket(5, "UFA", "NSB", 500, 160);
        Ticket ticket6 = new Ticket(6, "NSB", "UFA", 500, 160);
        Ticket ticket7 = new Ticket(7, "SPB", "MSK", 800, 70);
        Ticket ticket8 = new Ticket(8, "MSK", "NSK", 900, 260);
        Ticket ticket9 = new Ticket(9, "SPB", "MSK", 400, 80);
        manager.add(ticket1);
        manager.add(ticket2);
        manager.add(ticket3);
        manager.add(ticket4);
        manager.add(ticket5);
        manager.add(ticket6);
        manager.add(ticket7);
        manager.add(ticket8);
        manager.add(ticket9);

        Ticket[] expected = {ticket3, ticket4, ticket1, ticket9, ticket7};
        Ticket[] actual = manager.findAll("SPB", "MSK");

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testSort2Tickets() {
        TicketRepository repo = new TicketRepository();
        TicketManager manager = new TicketManager(repo);
        Ticket ticket1 = new Ticket(1, "SPB", "MSK", 100, 60);
        Ticket ticket2 = new Ticket(2, "MSK", "SPB", 200, 70);
        Ticket ticket3 = new Ticket(3, "SPB", "MSK", 300, 70);
        Ticket ticket4 = new Ticket(4, "SPB", "MSK", 400, 60);
        Ticket ticket5 = new Ticket(5, "UFA", "NSB", 500, 160);
        Ticket ticket6 = new Ticket(6, "NSB", "UFA", 600, 160);
        Ticket ticket7 = new Ticket(7, "SPB", "MSK", 700, 70);
        Ticket ticket8 = new Ticket(8, "MSK", "NSK", 800, 260);
        Ticket ticket9 = new Ticket(9, "SPB", "MSK", 900, 80);
        manager.add(ticket1);
        manager.add(ticket2);
        manager.add(ticket3);
        manager.add(ticket4);
        manager.add(ticket5);
        manager.add(ticket6);
        manager.add(ticket7);
        manager.add(ticket8);
        manager.add(ticket9);

        Ticket[] expected = {ticket1, ticket3, ticket4, ticket7, ticket9};
        Ticket[] actual = manager.findAll("SPB", "MSK");

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testSortOneTickets() {
        TicketRepository repo = new TicketRepository();
        TicketManager manager = new TicketManager(repo);
        Ticket ticket1 = new Ticket(1, "SPB", "MSK", 100, 60);
        Ticket ticket2 = new Ticket(2, "MSK", "SPB", 200, 70);
        Ticket ticket3 = new Ticket(3, "SPB", "MSK", 300, 70);
        Ticket ticket4 = new Ticket(4, "SPB", "MSK", 400, 60);
        Ticket ticket5 = new Ticket(5, "UFA", "NSB", 500, 160);
        Ticket ticket6 = new Ticket(6, "NSB", "UFA", 600, 160);
        Ticket ticket7 = new Ticket(7, "SPB", "MSK", 700, 70);
        Ticket ticket8 = new Ticket(8, "MSK", "NSK", 800, 260);
        Ticket ticket9 = new Ticket(9, "SPB", "MSK", 900, 80);
        manager.add(ticket1);
        manager.add(ticket2);
        manager.add(ticket3);
        manager.add(ticket4);
        manager.add(ticket5);
        manager.add(ticket6);
        manager.add(ticket7);
        manager.add(ticket8);
        manager.add(ticket9);

        Ticket[] expected = {ticket5};
        Ticket[] actual = manager.findAll("UFA", "NSB");

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testSortNoTickets() {
        TicketRepository repo = new TicketRepository();
        TicketManager manager = new TicketManager(repo);
        Ticket ticket1 = new Ticket(1, "SPB", "MSK", 300, 60);
        Ticket ticket2 = new Ticket(2, "MSK", "SPB", 700, 70);
        Ticket ticket3 = new Ticket(3, "SPB", "MSK", 100, 70);
        Ticket ticket4 = new Ticket(4, "SPB", "MSK", 200, 60);
        Ticket ticket5 = new Ticket(5, "UFA", "NSB", 500, 160);
        Ticket ticket6 = new Ticket(6, "NSB", "UFA", 500, 160);
        Ticket ticket7 = new Ticket(7, "SPB", "MSK", 800, 70);
        Ticket ticket8 = new Ticket(8, "MSK", "NSK", 900, 260);
        Ticket ticket9 = new Ticket(9, "SPB", "MSK", 400, 80);
        manager.add(ticket1);
        manager.add(ticket2);
        manager.add(ticket3);
        manager.add(ticket4);
        manager.add(ticket5);
        manager.add(ticket6);
        manager.add(ticket7);
        manager.add(ticket8);
        manager.add(ticket9);

        Ticket[] expected = { };
        Ticket[] actual = manager.findAll("UFA", "SPB");

        Assertions.assertArrayEquals(expected, actual);
    }

}
