package practice.day10.metamong;

import practice.day10.framework.Ticket;
import practice.day10.framework.TicketFactory;

public class MetaMonTicketFactory extends TicketFactory {

    @Override
    protected Ticket createTicket(String owner) {
        return new MetaMonTicket(owner);
    }

    @Override
    protected void registerTicket(Ticket ticket) {
        System.out.println("티켓 " + ticket.toString() + " 등록 완료");
    }
}
