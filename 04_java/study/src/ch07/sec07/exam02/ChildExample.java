package ch07.sec07.exam02;

public class ChildExample {
    public static void main(String[] args) {
        Child child = new Child();
        Parent parent = child;

        parent.method1();
        parent.method2(); //오버라이딩된 메소드는 자식 메소드로 접근
//        parent.method3(); //자식에만 있는 메소드는 접근 불가
    }
}
