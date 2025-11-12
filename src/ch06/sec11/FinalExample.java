package ch06.sec11;

public class FinalExample {

    public static void main(String[] args) {
        System.out.println("지구 둘레(km) ≈ " + Earth.circumference());
        Earth e = new Earth("Earth");
        System.out.println("행성명: " + e.planetName);
        // e.planetName = "Mars"; // 컴파일 에러: final 필드 재할당 불가
    }


}
