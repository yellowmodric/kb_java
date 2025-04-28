package practice.day04;

import java.util.Scanner;

public class PaymentManager {
    int count = 0;
    int total = 0;
    int creditCard = 0;
    int kakaoPay = 0;

    Scanner sc = new Scanner(System.in);

    public void process(Payment payment, int amount) {
        if (payment.beforePay()) {
            System.out.print("결제 금액을 입력하세요: ");
            amount = sc.nextInt();

            if (payment.pay(amount)) {
                payment.approve();
                count++;
                total += amount;
                payment.cancel("테스트 취소");

                if (payment instanceof KakaoPay) {
                    ((KakaoPay) payment).sendNotification();
                    kakaoPay++;
                } else {
                    System.out.println("[알림 서비스 없음]");
                    creditCard++;
                }
            } else {
                System.out.println("[결제 실패: 승인/취소 건너뜀]");
            }
        }
    }

    public void printSummary() {
        System.out.println("✅ 결제 통계 요약");
        System.out.println("총 결제 횟수: " + count + "회");
        System.out.println("총 결제 금액: " + total + "원");
        System.out.println("[CreditCard]: " + creditCard + "건");
        System.out.println("[KakaoPay]: " + kakaoPay + "건");
    }
}
