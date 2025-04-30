package practice.day09.queue;

import java.util.LinkedList;
import java.util.Queue;

public class DollQueueManager {
    static Queue<String> queue = new LinkedList<>();

    public static void registerCustomer(String name) {
        queue.add(name);
        System.out.println("\uD83D\uDC49 " + name + " 님이 대기열에 등록되었습니다.");
    }

//    public void processNextCustomer() {
//        if (queue.isEmpty()) {
//            System.out.println("현재 대기열에 아무도 없습니다!");
//            return;
//        } else {
//            String name = queue.poll();
//            System.out.println("\uD83C\uDF89 " + name + " 님! 인형 뽑기 하러 오세요!");
//        }
//    }

    public void showWaitingList() {
        System.out.println("\uD83E\uDDFE 현재 대기열: " + queue);
    }

    public String getNextCustomer() {
        if (queue.isEmpty()) {
            System.out.println("현재 대기열에 아무도 없습니다!");
            return null;
        } else {
            String name = queue.poll();
            return name;
        }
    }
}
