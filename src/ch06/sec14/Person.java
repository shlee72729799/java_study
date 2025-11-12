package ch06.sec14;

public class Person {

    private String name;   // 캡슐화
    private int age;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        // 필요하면 필터링/변환
        this.name = name == null ? "UNKNOWN" : name.trim();
    }

    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        // 유효성 검사
        if (age < 0 || age > 150) {
            throw new IllegalArgumentException("나이 범위가 올바르지 않습니다.");
        }
        this.age = age;
    }


}
