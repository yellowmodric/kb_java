package practice.day04;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        Payment payment = new CreditCard();
//        payment.pay(5000);
//        payment.approve();
//        payment.cancel("단순 변심");

//        Payment payment = new KakaoPay();
//        payment.pay(3000);       // 실패 케이스
//        payment.pay(7000);       // 성공 케이스
//        payment.approve();
//        payment.cancel("오입력");

//        Payment[] payments = {
//                new CreditCard(),
//                new KakaoPay(),
//                new KakaoPay(),
//                new CreditCard()
//        };
//
//        Scanner scanner = new Scanner(System.in);
//
//        for (int i = 1; i <= payments.length; i++) {
//            System.out.println("[" + i + "번 결제수단] 결제 금액을 입력하세요:");
//            int amount = scanner.nextInt();
//            if (payments[i - 1].pay(amount)) {
//                payments[i - 1].approve();
//                payments[i - 1].cancel("테스트 취소");
//            } else {
//                System.out.println("[결제 실패: 승인/취소 건너뜀]");
//            }
//            System.out.println();
//        }

//        System.out.println("=== 결제 수단 선택 ===");
//        System.out.println("[1] 신용카드");
//        System.out.println("[2] 카카오페이");
//
//        Scanner sc = new Scanner(System.in);
//
//        System.out.print("결제 수단을 선택하세요: ");
//        int payMethod = sc.nextInt();
//
//        Payment payment;
//        if (payMethod == 1) {
//            payment = new CreditCard();
//        } else {
//            payment = new KakaoPay();
//        }
//
//        System.out.print("결제 금액을 입력하세요: ");
//        int amount = sc.nextInt();
//
//        if (payment.pay(amount)) {
//            payment.approve();
//            payment.cancel("테스트 취소");
//
//            if (payment instanceof KakaoPay) {
//                ((KakaoPay) payment).sendNotification();
//            } else {
//                System.out.println("[알림 서비스 없음]");
//            }
//        } else {
//            System.out.println("[결제 실패: 승인/취소 건너뜀]");
//        }

//        System.out.println("=== 유니페이 결제 시스템 ===");
//        System.out.println("[1] 신용카드");
//        System.out.println("[2] 카카오페이");
//
//        Scanner sc = new Scanner(System.in);
//
//        System.out.print("결제 수단을 선택하세요: ");
//        int payMethod = sc.nextInt();
//
//        Payment payment;
//        if (payMethod == 1) {
//            payment = new CreditCard();
//        } else {
//            payment = new KakaoPay();
//            System.out.print("[카카오페이 사용자 인증을 진행하시겠습니까? (y/n)]");
//            String input = sc.next();
//
//            if (input.equals("y")) {
//                ((KakaoPay) payment).authenticate();
//            }
//        }
//
//        if (payment.beforePay()) {
//            System.out.print("결제 금액을 입력하세요: ");
//            int amount = sc.nextInt();
//
//            if (payment.pay(amount)) {
//                payment.approve();
//                payment.cancel("테스트 취소");
//
//                if (payment instanceof KakaoPay) {
//                    ((KakaoPay) payment).sendNotification();
//                } else {
//                    System.out.println("[알림 서비스 없음]");
//                }
//            } else {
//                System.out.println("[결제 실패: 승인/취소 건너뜀]");
//            }
//        }

        while (true) {
            System.out.println("=== 유니페이 결제 시스템 ===");
            System.out.println("[1] 신용카드");
            System.out.println("[2] 카카오페이");
            System.out.println("[0] 종료");

            Scanner sc = new Scanner(System.in);

            System.out.print("결제 수단을 선택하세요: ");
            int payMethod = sc.nextInt();

            Payment payment;
            if (payMethod == 1) {
                payment = new CreditCard();
            } else if (payMethod == 2) {
                payment = new KakaoPay();
                System.out.print("[카카오페이 사용자 인증을 진행하시겠습니까? (y/n)]");
                String input = sc.next();

                if (input.equals("y")) {
                    ((KakaoPay) payment).authenticate();
                }
            }
//            if (payment.beforePay()) {
//                System.out.print("결제 금액을 입력하세요: ");
//                int amount = sc.nextInt();
//            }
        }
    }
}

