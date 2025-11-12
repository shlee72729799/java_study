package ch06.sec06.exam02;

public class CarExample {

    public static void main(String[] args) {
        Car myCar = new Car();
        System.out.println(myCar.company + " " + myCar.model + " / " + myCar.color);
        myCar.speed = 80;
        System.out.println("speed = " + myCar.speed + " / max = " + myCar.maxSpeed);
    }



}
