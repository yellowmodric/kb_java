package practice.day01;

public class _1 {
    public static void main(String[] args) {
        int total = 0;
        for(int i=0; i<=100; i++) {
            if (i % 3 == 0) {
                total += i;
            }
        }
        System.out.println(total);
    }
}
