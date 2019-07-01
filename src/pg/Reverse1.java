package pg;

import java.util.Scanner;

public class Reverse1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter string");
		String s = sc.nextLine();
	
	 StringBuffer sbf = new StringBuffer(s); 
     System.out.println("String buffer = " + sbf); 
     sbf.reverse(); 
     System.out.println("String buffer after reversing = " + sbf); 
}
}