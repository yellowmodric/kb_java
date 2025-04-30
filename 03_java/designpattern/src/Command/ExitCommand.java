package Command;

import java.util.Scanner;

public class ExitCommand implements Command {

    @Override
    public void execute() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("종료할까요?(Y/n) ");
        String answer = scanner.nextLine();

        scanner.close();
        //대소문자 상관없이 비교
        if (answer.isEmpty() || answer.equalsIgnoreCase("Y")) {
            //종료 상태 코드
            //0은 정상 종료
            System.exit(0);
        }
    }
}
