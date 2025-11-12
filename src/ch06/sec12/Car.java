package ch06.sec12;
import ch06.sec12.hankook.Tire;
import ch06.sec12.hyundai.Engine;




public class Car {
    Engine engine = new Engine();
    Tire frontLeft = new Tire();  // Hankook

    // Kumho는 풀네임으로
    ch06.sec12.kumho.Tire frontRight = new ch06.sec12.kumho.Tire();

    public void spec() {
        System.out.println("Engine: " + engine);
        System.out.println("FrontLeft: " + frontLeft);
        System.out.println("FrontRight: " + frontRight);
    }



}
