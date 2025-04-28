package practice.day07;

public class TicketingRound1 {
    public static void main(String[] args) {
        for (int i=0; i<2; i++) {
            final int index = i;
            System.out.println("=== run() 직접 호출 테스트 ===");
            Thread runThread = new Thread(new Runnable() {
                @Override
                public void run() {
                    String fanName = "팬" + (index + 1);
                    Thread.currentThread().setName(fanName);
                    System.out.println(Thread.currentThread().getName() + " 티켓 구매 시도 중!");
                }
            });

            Thread mainThread = new Thread(new Runnable() {
                public void run() {
                    System.out.println("main 티켓 구매 시도 중!");
                }
            });

            Thread startThread = new Thread(new Runnable() {
                public void run() {
                    String fanName = "팬" + ((index == 0) ? 2 : 1);
                    Thread.currentThread().setName(fanName);
                    System.out.println(Thread.currentThread().getName() + " 티켓 구매 시도 중!");
                }
            });

            runThread.run();
            mainThread.run();
            startThread.run();
        }
}
}
