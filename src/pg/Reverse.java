package pg;

import java.util.Scanner;

public class Reverse {
	public static String reverseString(String input) {
		StringBuffer rev = new StringBuffer(input).reverse();
		return rev.toString();
	}

	public static void main(String[] args) {
		/*Scanner sc = new Scanner(System.in);
		System.out.println("enter string");
		String s = sc.nextLine();
		String r = " ";
		for (int i = s.length() - 1; i >= 0; i--) {
			r = r + s.charAt(i);

		}
		System.out.println("reverse string is: " + r);
*/
		System.out.println(reverseString("mani"));
	}
}
