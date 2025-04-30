package Iterator;

public class Book { //setter가 없으므로 수정을 못하는 불변 객체 -> record로 간단하게 만들 수 있음
    private String name;

    public Book(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
