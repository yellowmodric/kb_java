package practice.day07;

public class FestivalTicketEvent extends AbstractTicketEvent{

    public FestivalTicketEvent(int ticketCount) {
        super(ticketCount);
    }

    @Override
    protected void fanEntry() {
        Thread[] fans = new Thread[ticketCount];

        for (int i=0; i<ticketCount; i++) {
            final int index = i;
            Thread thread = new Thread() {
                public void run() {
                    String fanName = "팬" + (index + 1);
                    Thread.currentThread().setName(fanName);
                    System.out.println(fanName + " 티켓 구매 시도 중!");
                }
            };
            thread.start();
            try {
                thread.join();
            } catch (InterruptedException e) {}
        }

    }
}
