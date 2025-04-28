package org.scoula.lib;

import java.util.Scanner;

public class Input {
    static Scanner scanner = new Scanner(System.in);

    static String read(String title) {
        System.out.print("이름: ");
        return scanner.nextLine();
    }

    static String read(String title, String defaultValue) {
        System.out.print("이름(" + defaultValue + "):");
        String input = scanner.nextLine();
        if (input.trim().isEmpty()) {
            return defaultValue;
        } else {
            return input;
        }
    }

    static int readInt(String title) {
        System.out.print("나이: ");
        return Integer.parseInt(scanner.nextLine());
    }

    static boolean confirm(String title, boolean defaultValue) {
        System.out.print("종료할까요? ");

        if (defaultValue == true) {
            System.out.print("(Y/n): ");
        } else {
            System.out.print("(y/N): ");
        }

        String input = scanner.nextLine();

        if (input.toLowerCase().equals("y")) {
            return true;
        } else if (input.toLowerCase().equals("n")) {
            return false;
        }

        if (input.trim().isEmpty()) {
            return defaultValue;
        } else {
            return true;
        }
    }

    static boolean confirm(String title) {
        return confirm(title, true);
    }
}
