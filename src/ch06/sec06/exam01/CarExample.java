package ch06.sec06.exam01;

public class CarExample {
    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.model = "Avante";
        myCar.start = true;
        myCar.speed = 60;

        System.out.println("model = " + myCar.model);
        System.out.println("start = " + myCar.start);
        System.out.println("speed = " + myCar.speed);
    }


}
