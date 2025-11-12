package ch06.sec11;

public class Earth {
    // 상수(클래스 공통, 불변): static final
    public static final double EARTH_RADIUS = 6371.0; // km
    public static final double PI = 3.1415926535;

    // 인스턴스 final 필드 (생성자에서 1회만 초기화 가능)
    public final String planetName;

    public Earth(String name) {
        this.planetName = name;
    }

    public static double circumference() {
        return 2 * PI * EARTH_RADIUS;
    }




}
