package practice.day07;

public class RegularBuyer implements TicketBuyer {

    @Override
    public void buyTicket() {

    }

    @Override
    public void waitTurn() {
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {}
    }

    @Override
    public void entranceMessage(String name) {
        System.out.println(name + " 입장 완료!");
    }
}
