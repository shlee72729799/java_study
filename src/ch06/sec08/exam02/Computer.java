package ch06.sec08.exam02;

public class Computer {
    int sum(int... values) { // values는 내부에서 int[] 로 사용됨
        int result = 0;
        for (int v : values) result += v;
        return result;
    }
}
