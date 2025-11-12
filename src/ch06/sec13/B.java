package ch06.sec13;

public class B {
    public static void main(String[] args) {
        A a = new A();
        System.out.println(a.pub); // OK
        System.out.println(a.def); // OK (default)
        // System.out.println(a.pri); // 에러: private
        a.print();
    }
}
