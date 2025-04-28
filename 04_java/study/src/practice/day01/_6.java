package practice.day01;

public class _6 {
    public static <dobule> void main(String[] args) {
        int[][] array = {
                {95, 86},
                {83, 92, 96},
                {78, 83, 93, 87, 88}
        };
        int total = 0;
        double avg = 0.0;
        double len = 0.0;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                total += array[i][j];
            }
            len += array[i].length;
            avg = total / len;
        }
        System.out.println("전체 합: " + total);
        System.out.println("평균: " + avg);
    }
}
