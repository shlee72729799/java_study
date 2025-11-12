package ch06.sec08.exam03;

public class Calculator {

    double safeDivide(int x, int y) {
        if (y == 0) {
            System.out.println("0으로 나눌 수 없습니다.");
            return Double.NaN; // 혹은 0 리턴 등 정책
        }
        return (double) x / y;
    }
}
