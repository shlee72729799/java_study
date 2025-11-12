package ch06.sec10;

public class Calculator {

    // 정적 필드
    static double pi;

    // 정적 블록(클래스 로딩 시 1회 실행, 복잡 초기화 가능)
    static {
        System.out.println("[Calculator static block]");
        pi = 3.1415926535;
        // 복잡한 초기화 로직이 있다면 여기에
    }

    // 정적 메소드
    public static int plus(int x, int y) {
        return x + y;
    }

    public static int minus(int x, int y) {
        return x - y;
    }




}
