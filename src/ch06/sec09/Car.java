package ch06.sec09;

public class Car {

    // 인스턴스 필드
    int gas;
    int speed;

    // 인스턴스 메소드
    void setGas(int gas) { this.gas = gas; }
    void setSpeed(int speed) { this.speed = speed; }
    void run() {
        if (gas <= 0) {
            System.out.println("기름이 없습니다.");
            return;
        }
        System.out.println("속도 " + speed + "km/h 로 주행합니다.");
        gas--;
    }
}
