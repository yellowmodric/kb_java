package ch14.sec05.exam02;

public class JoinExample {
    public static void main(String[] args) {
        SumThread sumThread = new SumThread();
        sumThread.start();
        try {
            sumThread.join(); //sumThread가 끝날때까지 메인 스레드 대기
        } catch (InterruptedException e) {
            System.out.println("1~100 합: " + sumThread.getSum());
        }
    }
}
