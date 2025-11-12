package ch06.sec07.exam05;

public class Car {
    String model;
    String color;
    int maxSpeed;

    Car() {
        this("Sonata", "White", 240); // 공통 초기화
    }

    Car(String model) {
        this(model, "Black", 240);
    }

    Car(String model, String color) {
        this(model, color, 240);
    }

    Car(String model, String color, int maxSpeed) {
        this.model = model;
        this.color = color;
        this.maxSpeed = maxSpeed;
    }
}
