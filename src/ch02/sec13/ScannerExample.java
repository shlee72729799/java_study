package ch02.sec13;
import java.util.Scanner;

public class ScannerExample {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        // 숫자 입력받아 더하기
        System.out.print("x 값 입력: ");
        String strX = scanner.nextLine();  // 문자열 입력
        int x = Integer.parseInt(strX);    // 정수로 변환

        System.out.print("y 값 입력: ");
        String strY = scanner.nextLine();
        int y = Integer.parseInt(strY);

        int result = x + y;
        System.out.println("x + y: " + result);
        System.out.println();

        // 문자열 입력받아 출력 (q 입력 시 종료)
        while (true) {
            System.out.print("입력 문자열: ");
            String data = scanner.nextLine();

            if (data.equals("q")) {   // "q" 입력하면 루프 종료
                break;
            }

            System.out.println("출력 문자열: " + data);
            System.out.println();
        }

        System.out.println("종료");
        scanner.close();
    }
}
