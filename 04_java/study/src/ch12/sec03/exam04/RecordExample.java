package ch12.sec03.exam04;

public class RecordExample {
    public static void main(String[] args) {
        Memeber m = new Memeber("winter", "눈송이", 25);

        System.out.println(m.id()); //id() : getter 역할을 하는 메소드
        System.out.println(m.name());
        System.out.println(m.age());
        System.out.println(m.toString());
        System.out.println();

        Memeber m1 = new Memeber("winter", "눈송이", 25);
        Memeber m2 = new Memeber("winter", "눈송이", 25);
        System.out.println("m1.hashCode: " + m1.hashCode());
        System.out.println("m2.hashCode: " + m2.hashCode());
        System.out.println("m1.equals(m2): " + m1.equals(m2));
    }
}
