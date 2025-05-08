package ch17.sec06.exam02;

import java.util.Arrays;
import java.util.stream.IntStream;

public class MapExample {
    public static void main(String[] args) {
        int[] intArray = {1, 2, 3, 4, 5};

        //int -> Stream 변환
        IntStream intStream = Arrays.stream(intArray);
        intStream
                .asDoubleStream()
                .forEach(d -> System.out.println(d));
        System.out.println();

        intStream = Arrays.stream(intArray);
        intStream
                .boxed() //wrapper 객체 받아주는 것?
                //래퍼 객체에서 .intValue()로 다시 int 추출 가능
                .forEach(obj -> System.out.println(obj.intValue()));
    }
}
