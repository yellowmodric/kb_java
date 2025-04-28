package ch06.sec07.exam05;

public class Car {
    String company = "현대자동차";
    String model;
    String color;
    int maxSpeed;

    public Car(String model) {
        //매개변수 세개를 가진 다른 생성자를 this로 호출
        this(model, "은색", 250);
    }

    public Car(String model, String color) {
        this(model, color, 250);
    }

    public Car(String model, String color, int maxSpeed) {
        this.model = model;
        this.color = color;
        this.maxSpeed = maxSpeed;
    }
}
