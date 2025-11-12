package ch06.sec07.exam02;

public class Korean {
    String nation = "대한민국"; // 공통(고정) 값
    String name;              // 객체마다 다름
    String ssn;               // 객체마다 다름

    public Korean(String name, String ssn) {
        this.name = name; // 매개변수명=필드명 -> this로 구분
        this.ssn  = ssn;
    }
}
