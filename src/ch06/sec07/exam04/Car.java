package ch06.sec07.exam04;

public class Car {
    String model;
    String color;
    int maxSpeed;

    Car() {} // 기본

    Car(String model) {
        this.model = model;
    }

    Car(String model, String color) {
        this(model);
        this.color = color;
    }

    Car(String model, String color, int maxSpeed) {
        this(model, color);
        this.maxSpeed = maxSpeed;
    }
}
