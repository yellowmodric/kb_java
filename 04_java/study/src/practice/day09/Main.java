package practice.day09;

import practice.day09.queue.DollQueueManager;
import practice.day09.util.RandomCustomerProvider;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        DollQueueManager dqm = new DollQueueManager();

        System.out.println("=== 유라의 인형뽑기 가게 ===");
        System.out.println("[1] 고객 등록");
        System.out.println("[2] 뽑기 진행");
        System.out.println("[3] 현재 대기열 보기");
        System.out.println("[0] 종료");

        boolean run = true;

        while(run) {
            System.out.print("선택 >> ");

            Scanner scanner = new Scanner(System.in);
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    DollQueueManager.registerCustomer(RandomCustomerProvider.getRandomCustomer());
                    break;
                case 2:
//                    dqm.processNextCustomer();
                    break;
                case 3:
                    dqm.showWaitingList();
                    break;
                case 0:
                    run = false;
                    System.out.println("\uD83D\uDC4B 프로그램을 종료합니다.");
                    System.exit(0);
            }
            System.out.println();
        }
    }
}
