package practice.day07;

public class TicketingRound3 {
    public static void main(String[] args) {
        EntryManager entryManager = new EntryManager(5);
        Fan[] fans = {
                new Fan("팬1", false, entryManager),
                new Fan("팬2", true, entryManager),
                new Fan("팬3", false, entryManager),
                new Fan("팬4", true, entryManager),
                new Fan("팬5", false, entryManager)
        };
        System.out.println("이벤트 시작! 남은 티켓: "+ fans.length + "장");
        for (Fan fan : fans) {
            Thread thread = new Thread(fan);
            thread.start();
            try {
                thread.join();
            } catch (InterruptedException e) {}
        }
        System.out.println("이벤트 종료! 모두 수고하셨습니다 \uD83C\uDF89");
    }
}
