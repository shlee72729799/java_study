package ch06.sec10;

public class StaticExample {

    public static void main(String[] args) {
        // 객체 없이 클래스명으로 접근
        int a = Calculator.plus(10, 20);
        int b = Calculator.minus(50, 8);
        System.out.println("a=" + a + ", b=" + b);
        System.out.println("pi=" + Calculator.pi);
    }



}
