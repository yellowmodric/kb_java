package practice.day06;

import ch07.sec07.exam02.Parent;

import java.util.Scanner;
import java.util.regex.Pattern;

public class CelebrityRegister {
    public static void main(String[] args) throws InvalidNameException {
        Scanner sc = new Scanner(System.in);

        System.out.print("남자 연예인 몇 명 등록할까요? ");
        int num = sc.nextInt();
        sc.nextLine();

        MaleCelebrity[] maleNames = new MaleCelebrity[num];

        int count = 0;

        while (count < num) {
            try {
                System.out.print("이름 입력: ");
                String name = sc.nextLine();

                if (!Pattern.matches("^[가-힣]{2,10}$", name)) {
                    throw new InvalidNameException("이름은 한글 2~10자여야 합니다!");
                }
                MaleCelebrity maleCelebrity = new MaleCelebrity(name);

                boolean isDuplicate = false;

                for (int j = 0; j < count; j++) {
                    if (maleCelebrity.equals(maleNames[j])) {
                        isDuplicate = true;
                        break;
                    }
                }

                if (isDuplicate) {
                    System.out.println("중복된 이름입니다. 등록하지 않습니다.");

                } else {
                    maleNames[count++] = maleCelebrity;
                }
            } catch (InvalidNameException e) {
                System.out.println("\uD83D\uDE21 탈락! 잘못된 이름입니다: 이름은 한글 2~10자여야 합니다!");
            }
        }

        System.out.print("여자 연예인 몇 명 등록할까요? ");
        int num2 = sc.nextInt();
        sc.nextLine();

        FemaleCelebrity[] femaleNames = new FemaleCelebrity[num];

        int count2 = 0;

        while (count2 < num2) {
            try {
                System.out.print("이름 입력: ");
                String name = sc.nextLine();

                if (!Pattern.matches("^[가-힣]{2,10}$", name)) {
                    throw new InvalidNameException("이름은 한글 2~10자여야 합니다!");
                }
                FemaleCelebrity femaleCelebrity = new FemaleCelebrity(name);

                boolean isDuplicate2 = false;

                for (int j = 0; j < count2; j++) {
                    if (femaleCelebrity.equals(femaleNames[j])) {
                        isDuplicate2 = true;
                        break;
                    }
                }

                if (isDuplicate2) {
                    System.out.println("중복된 이름입니다. 등록하지 않습니다.");

                } else {
                    femaleNames[count2++] = femaleCelebrity;
                }
            } catch (InvalidNameException e) {
                System.out.println("\uD83D\uDE21 탈락! 잘못된 이름입니다: 이름은 한글 2~10자여야 합니다!");
            }
        }

        System.out.println();
        System.out.println("[남자 연예인 리스트]");
        for (int i=0; i<num; i++) {
            System.out.println(maleNames[i]);
        }

        System.out.println();
        System.out.println("[여자 연예인 리스트]");
        for (int i=0; i<num2; i++) {
            System.out.println(femaleNames[i]);
        }
    }
}
