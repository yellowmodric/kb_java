package ch11.sec02.exam01;

public class ExceptionHandlingExample2 {
    public static void printLength(String data) {
        try { //예외가 발생할 수 있는 코드
            int result = data.length();
            System.out.println("문자 수: " + result);
        } catch (NullPointerException e) {
            System.out.println(e.getMessage()); // 예외 원인 메시지 출력
            System.out.println(e.toString()); //예외 타입 + 메시지 출력
            e.printStackTrace(); //예외 발생 위치까지 출력
        } finally { //예외가 발생하든 안 하든 무조건 실행
            System.out.println("[마무리 실행]\n");
        }
    }

    public static void main(String[] args) {
        System.out.println("[프로그램 시작]\n");
        printLength("ThisIsJava");
        printLength(null); //NullPointerException 예외 발생
        System.out.println("[프로그램 종료]"); //예외 발생 후 코드 실행 안됨
    }
}
