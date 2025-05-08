package ch16.sec05.exam03;

import ch12.sec03.exam04.Memeber;

public class Person {
    //생성자가 여러 개일 경우 매개변수를 통해 일치하는 생성자를 찾는다.
    //매개변수 1개 생성자 사용
    public Member getMember1(Creatable1 creatable) {
        String id = "winter";
        Member member = creatable.create(id);
        return member;
    }

    //매개변수 2개 생성자 사용
    public Member getMember2(Creatable2 creatable) {
        String id = "winter";
        String name = "한겨울";
        Member member = creatable.create(id, name);
        return member;
    }
}
