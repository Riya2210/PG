package pg;

import java.util.Scanner;

public class StringChar {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("enter string");
		String s = in.nextLine();
		Scanner sc = new Scanner(System.in);
		System.out.println("enter character");
		char c = sc.next().charAt(0);
		char[] chars = s.toCharArray();
		System.out.println(chars.length);
		System.out.println(removeChar(chars, c));

	}

	private static char[] removeChar(char[] chars, char c) {
	char[] chars1 = new char[chars.length] ;
int count = 0;
	
		for (int i = 0; i <chars.length; i++) {
			if (chars[i] != c) {
				chars1[count]=chars[i];
				count++;
			}
		}
		return chars1;
	}
}

 /***
  * TODO : Difference b/w i++ and ++i
  *  and remove character from char array
  *   can we remove or not??
  ***/



