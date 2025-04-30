package ch15.sec05.exam03;

import java.util.ArrayList;

public class ComparableExample {
    public static void main(String[] args) {
        ArrayList<Person> list = new ArrayList<Person>();

        list.add(new Person("홍길동", 35));
        list.add(new Person("감자바", 25));
        list.add(new Person("박지원", 31));

        for (Person p : list) {
            System.out.println(p.name + ": " + p.age);
        }
    }
}
