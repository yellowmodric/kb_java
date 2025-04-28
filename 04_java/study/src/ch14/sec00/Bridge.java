package ch14.sec00;

public class Bridge {
    int counter;
    String name;
    String address;

    public Bridge() {
        counter = 0;
        name = "아무개";
        address = "모름";
    }

    // Critical Section: 경쟁상태가 발생하는 메서드
    // synchronized: 한번에 한 스레드만 진입하도록 보장
    synchronized public void across(String name, String address) {
        counter++;
        this.name = name;
        this.address = address;
        check();
    }

    public void check() {
        if (name.charAt(0) != address.charAt(0)) {
            System.out.println("문제 발생!!!" + this); //여기서 this는 toString이 호출됨(문자열로 나와야 하기 때문)
        }
    }

    public String toString() {
        return "Bridge{" +
                "counter=" + counter +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
