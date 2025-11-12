package ch06.sec09;

public class CarExample {
    public static void main(String[] args) {
        Car myCar = new Car();       // 객체 생성 후 멤버 접근
        myCar.setGas(3);
        myCar.setSpeed(60);
        myCar.run();
        myCar.run();
        myCar.run();
        myCar.run();                 // 기름 소진 메시지 확인
    }



}
