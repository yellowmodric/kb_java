package ch16.sec04;

public class LambdaExample {
    public static void main(String[] args) {
        Person person = new Person();

        //실행문이 2개 이상이기 때문에 중괄호와 return 필요
        person.action((x, y) -> {
            double result = x + y;
            return result;
        });

        //리턴문이 하나만 있을 경우 return과 중괄호 생력 가능
        person.action((x, y) -> (x + y));

    person.action((x, y) -> sum(x, y));

    }

    public static double sum(double x, double y) {
        return x + y;
    }
}
