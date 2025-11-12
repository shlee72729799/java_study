package ch06.sec07.exam05;

public class CarExample {


    public static void main(String[] args) {
        Car a = new Car();
        Car b = new Car("Avante");
        Car c = new Car("K5", "Gray");
        Car d = new Car("G80", "Black", 300);

        System.out.println(a.model + "/" + a.color + "/" + a.maxSpeed);
        System.out.println(b.model + "/" + b.color + "/" + b.maxSpeed);
        System.out.println(c.model + "/" + c.color + "/" + c.maxSpeed);
        System.out.println(d.model + "/" + d.color + "/" + d.maxSpeed);
    }
}
