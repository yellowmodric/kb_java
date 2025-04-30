package ch13.sec02.exam01;

public class GenericExample {
    public static void main(String[] args) {
        //K는 TV 타입, M은 String 타입으로 결정!
        Product<TV, String> product1 = new Product<>();

        //위에서 지정한 타입으로 사용해야 한다.
        product1.setKind(new TV());
        product1.setModel("스마트TV");

        TV tv = product1.getKind();
        String tvModel = product1.getModel();

        //K는 Car 타입, M은 String 타입으로 결정!
        Product<Car, String> product2 = new Product<>();

        product2.setKind(new Car());
        product2.setModel("SUV 자동차");

        Car car = product2.getKind();
        String carModel = product2.getModel();
    }
}
