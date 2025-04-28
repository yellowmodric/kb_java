package org.scoula.lib;

public class InputTest {
    public static void main(String[] args) {
        System.out.println("입력값: " + Input.read(String.valueOf(Input.scanner)));
        System.out.println("입력값: " + Input.read(String.valueOf(Input.scanner), "홍길동"));
        System.out.println("입력값: " + Input.readInt(String.valueOf(Input.scanner)));
        System.out.println("입력값: " + Input.confirm(String.valueOf(Input.scanner), true));
        System.out.println("입력값: " + Input.confirm(String.valueOf(Input.scanner)));
    }
}
