package ch02.sec01;

public class VariableUseExamle {

    public static void main(String[] args) {

        final int MIN_PER_HOUR = 60;

        int hour = 3;
        int minute = 5;

        System.out.printf("%d시간 %d분%n", hour, minute);

        int totalMinute = hour * MIN_PER_HOUR + minute;
        System.out.printf("총 %d분%n", totalMinute);



    }



}
