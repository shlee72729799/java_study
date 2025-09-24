package ch04.sec08;

public class ContinueExample {

	public static void main(String[] args) {
		 for (int i = 1; i <= 10; i++) {
	            if (i % 2 != 0) {
	                continue; // 홀수일 경우 아래 코드 건너뜀
	            }
	            System.out.print(i + " ");
	        }
	}

}
