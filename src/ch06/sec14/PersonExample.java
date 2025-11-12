package ch06.sec14;

public class PersonExample {
    public static void main(String[] args) {
        Person p = new Person();
        p.setName("  Lee  ");
        p.setAge(23);
        System.out.println(p.getName() + " / " + p.getAge());
    }
}
