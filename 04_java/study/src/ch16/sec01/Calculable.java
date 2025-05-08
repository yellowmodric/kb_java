package ch16.sec01;

//FunctionalInterface : 추상 메소드가 하나인지 검사해주는 역할
@FunctionalInterface
public interface Calculable {
    void calculate(int x, int y);
}
