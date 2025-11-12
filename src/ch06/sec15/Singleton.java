package ch06.sec15;

public class Singleton {
    // 1) 유일 인스턴스 보관
    private static final Singleton INSTANCE = new Singleton();

    // 2) 생성자 private: 외부 new 방지
    private Singleton() {}

    // 3) 정적 메소드로 제공
    public static Singleton getInstance() {
        return INSTANCE;
    }

    // 예시 메소드
    public void doWork() {
        System.out.println("싱글톤 작업 실행");
    }


}
