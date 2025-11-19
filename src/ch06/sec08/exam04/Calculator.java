package ch06.sec08.exam04;

public class Calculator {

    int add(int x, int y) {
        return x + y;
    }

    double add(double x, double y) {
        return x + y;
    }

    // 오버로딩 (매개변수 타입이 다름)
    String add(String a, String b) {
        return a + b;
    }
}
