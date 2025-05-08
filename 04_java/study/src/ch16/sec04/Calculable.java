package ch16.sec04;

@FunctionalInterface
public interface Calculable {
    //double 값 두개를 받아서 double 값 리턴
    double calc(double x, double y);
}
