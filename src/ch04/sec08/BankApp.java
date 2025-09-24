package ch04.sec08;
import java.util.Scanner;
public class BankApp {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
	        boolean run = true;
	        int balance = 0;

	        while (run) {
	            System.out.println("---------------------------------");
	            System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
	            System.out.println("---------------------------------");
	            System.out.print("선택> ");

	            String menu = scanner.nextLine(); // 메뉴 입력(문자열)

	            switch (menu) {
	                case "1": // 예금
	                    System.out.print("예금액> ");
	                    int deposit = Integer.parseInt(scanner.nextLine());
	                    balance += deposit;
	                    break;

	                case "2": // 출금
	                    System.out.print("출금액> ");
	                    int withdraw = Integer.parseInt(scanner.nextLine());
	                    balance -= withdraw; // 과제 예시처럼 단순 차감
	                    break;

	                case "3": // 잔고 조회
	                    System.out.println("잔고> " + balance);
	                    break;

	                case "4": // 종료
	                    run = false;
	                    break;

	                default:
	                    System.out.println("잘못된 입력입니다.");
	            }
	        }

	        System.out.println("프로그램 종료");
	        scanner.close();

	}

}
