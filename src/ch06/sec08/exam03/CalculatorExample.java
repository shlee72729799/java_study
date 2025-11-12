package ch06.sec08.exam03;

public class CalculatorExample {
    public class CalculatorExample {
        public static void main(String[] args) {
            Calculator c = new Calculator();
            System.out.println(c.safeDivide(10, 2));
            System.out.println(c.safeDivide(10, 0));
        }
}
