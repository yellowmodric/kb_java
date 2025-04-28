package practice.day01;

public class _3 {
    public static void main(String[] args){
        int x = 4;
        int y = 5;

        for (int i=0; i<=10; i++){
            for(int j=0; j<=10; j++){
                if ((x * i) + (y * j) == 60) {
                    System.out.println("(" + i + ", " + j + ")");
                }
            }
        }
    }
}
