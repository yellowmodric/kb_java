package practice.day06;

import java.util.Scanner;
import java.util.regex.Pattern;

public class InvalidNameException extends Exception{
    public InvalidNameException(String message) {
        super(message);
    }

    public static void main(String[] args) throws InvalidNameException{
        Scanner sc = new Scanner(System.in);

        System.out.print("참가자 이름을 입력하세요: ");
        String name = sc.nextLine();

        boolean result = Pattern.matches("^[가-힣]{2,10}$", name);
        String message = "이름은 한글 2~10자여야 합니다!";

        if (result) {
            System.out.println("(다음 단계로 진행합니다!)");
        } else {
            try {
                throw new InvalidNameException(message);
            }
            catch (InvalidNameException e) {
                System.out.println("\uD83D\uDE21 탈락! 잘못된 이름입니다: " + message);
            }

        }
    }
}
