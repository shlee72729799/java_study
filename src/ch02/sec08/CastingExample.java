package ch02.sec08;

public class CastingExample {

	public static void main(String[] args) {
		  int var1 = 10;
	        byte var2 = (byte) var1;  // int → byte
	        System.out.println(var2); // 10

	        long var3 = 300;
	        int var4 = (int) var3;    // long → int
	        System.out.println(var4); // 300

	        int var5 = 65;
	        char var6 = (char) var5;  // int → char (유니코드 문자)
	        System.out.println(var6); // 'A'

	        double var7 = 3.14;
	        int var8 = (int) var7;    // double → int (소수점 버림)
	        System.out.println(var8); // 3
		
	
	}

}
