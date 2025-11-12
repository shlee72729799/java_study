package ch06.sec08.exam04;

public class CalculatorExample {

    public static void main(String[] args) {
        Calculator c = new Calculator();
        System.out.println(c.add(3, 5));            // int
        System.out.println(c.add(2.5, 7.3));        // double
        System.out.println(c.add("Hello, ", "OOP"));// String
    }


}
