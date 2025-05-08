package Command;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        FileService fs = new FileService();

//        Command[] commands = {
//                () -> System.out.println("Add Command"),
//                new AddCommand(),
//                new Command() {
//                    @Override
//                    public void execute() {
//                        System.out.println("Add Command");
//                    }
//                },
//                new OpenCommand(),
//                new PrintCommand(),
//                new ExitCommand()
//                fs::open, //() -> fs.open()
//                fs::print, //() -> fs.print()
//                Main::exit
//        };

        //다중 if문 대신 이런 식으로도 사용 가능
        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("1: Add, 2: Open, 3: Print, 4: Exit");
            System.out.println("선택: ");
            int sel = scanner.nextInt();

//            commands[sel-1].execute();
        }
    }
}
