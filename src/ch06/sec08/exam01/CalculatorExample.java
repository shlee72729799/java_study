package ch06.sec08.exam01;

public class CalculatorExample {
    public static void main(String[] args) {
        Calculator cal = new Calculator();
        cal.powerOn();
        int sum = cal.plus(10, 20);
        double q = cal.divide(10, 4);
        System.out.println("sum=" + sum + ", divide=" + q);
        cal.powerOff();
    }
}
