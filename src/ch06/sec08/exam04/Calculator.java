package ch06.sec08.exam04;

public class Calculator {
    public class Calculator {
        int add(int x, int y) {
            return x + y;
        }
        double add(double x, double y) {
            return x + y;
        }
        String add(String a, String b) { // 오버로딩(매개타입 다름)
            return a + b;
        }
}
