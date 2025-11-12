package ch06.sec13;

public class A {

    public int pub = 1;       // 어디서나 접근
    int def = 2;              // 같은 패키지
    private int pri = 3;      // 클래스 내부만

    public void print() {
        System.out.println(pub + ", " + def + ", " + pri);
    }


}
