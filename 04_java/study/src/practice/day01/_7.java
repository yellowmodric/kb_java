package practice.day01;

import java.util.Scanner;

public class _7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int money = 0;
        int sadMoney = 0;
        boolean run = true;

        while(run) {
            System.out.println("---------------------");
            System.out.println("1. 예금 | 2. 출금 | 3. 잔고 | 4. 종료");
            System.out.println("---------------------");
            System.out.print("선택> ");

            String str = sc.nextLine();

            if (str.equals("1")) {
                System.out.print("예금액>");
                money = sc.nextInt();
                sc.nextLine();
            } else if (str.equals("2")) {
                System.out.println("출금액>");
                sadMoney = sc.nextInt();
                sc.nextLine();
                money -= sadMoney;
            } else if (str.equals("3")) {
                System.out.println("잔고>");
                System.out.println(sadMoney);
            } else if (str.equals("4")) {
                run = false;
            }
        }
        System.out.println("프로그램 종료");
    }
}
