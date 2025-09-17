package ch02.sec09;

public class OperationPromotionExample {

	public static void main(String[] args) {
		
		 // 1. 컴파일 단계에서 연산
        byte result1 = 10 + 20;  
        System.out.println("result1: " + result1);

        // 2. byte + byte → int로 변환 후 연산
        byte v1 = 10;
        byte v2 = 20;
        int result2 = v1 + v2;
        System.out.println("result2: " + result2);

        // 3. byte + int + long → long으로 변환 후 연산
        byte v3 = 10;
        int v4 = 100;
        long v5 = 1000L;
        long result3 = v3 + v4 + v5;
        System.out.println("result3: " + result3);

        // 4. char + char → int로 변환 후 연산
        char v6 = 'A';   // 65
        char v7 = 1;     
        int result4 = v6 + v7;
        System.out.println("result4: " + result4);
        System.out.println("result4: " + (char)result4);

        // 5. int / int → 결과는 int
        int v8 = 10;
        int result5 = v8 / 4;  
        System.out.println("result5: " + result5);

        // 6. int / double → double로 변환
        int v9 = 10;
        double result6 = v9 / 4.0;  
        System.out.println("result6: " + result6);

        // 7. int / int → int, 하지만 한쪽을 강제 캐스팅하면 double 결과
        int v10 = 1;
        int v11 = 2;
        double result7 = (double) v10 / v11;
        System.out.println("result7: " + result7);

		
		
	}

}
