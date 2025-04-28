package ch14.sec04;

public class ThreadNameExample {
    public static void main(String[] args) {
        Thread mainThread = Thread.currentThread();
        System.out.println(mainThread.getName());

        for (int i=0; i<3; i++) {
            Thread threadA = new Thread() {
                public void run() {
                    System.out.println(getName() + "실행"); //자동 할당된 스레드 이름 출력
                }
            };
            threadA.start();
        }

        Thread chatThread = new Thread() {
            public void run() {
                System.out.println(getName() + "실행");
            }
        };
        chatThread.setName("chat-thread");
        chatThread.start();
    }
}
