package ch02.sec02;

public class IntegerLiteralExample {

    public static void main(String[] args) {

        // 여러 진법 정수 리터럴
        int var1 = 0b01011; // 2진수(0b)
        int var2 = 0206;    // 8진수(0)
        int var3 = 365;     // 10진수
        int var4 = 0xB3;    // 16진수(0x)

        // 10진수로 출력
        System.out.println("var1: " + var1);
        System.out.println("var2: " + var2);
        System.out.println("var3: " + var3);
        System.out.println("var4: " + var4);

        // 각 값의 2/8/16진수 문자열로도 출력
        System.out.printf("var1=%d (bin=%s)%n", var1, Integer.toBinaryString(var1));
        System.out.printf("var2=%d (oct=%s)%n", var2, Integer.toOctalString(var2));
        System.out.printf("var3=%d (dec=%d)%n", var3, var3);
        System.out.printf("var4=%d (hex=%s)%n", var4, Integer.toHexString(var4).toUpperCase());

        // 참고: 자릿수 구분 밑줄, long 리터럴
        int oneMillion = 1_000_000;
        long big = 10_000_000_000L;
        System.out.printf("oneMillion=%d, big=%d%n", oneMillion, big);



    }


}
