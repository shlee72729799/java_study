package ch06.sec08.exam02;

public class ComputerExample {

    public static void main(String[] args) {
        Computer com = new Computer();
        System.out.println(com.sum(1, 2, 3));
        System.out.println(com.sum(1, 2, 3, 4, 5));
        int[] arr = {10, 20, 30};
        System.out.println(com.sum(arr)); // 배열도 전달 가능
    }

}
