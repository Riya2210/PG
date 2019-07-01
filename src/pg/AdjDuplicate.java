package pg;

import java.util.Scanner;

public class AdjDuplicate {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter string");
		String s = sc.nextLine();
		System.out.println(singleOccurence(s));
	}

	public static StringBuilder singleOccurence(String s) {
		StringBuilder sb = new StringBuilder();
		if (s.length() > 0) {
			char previous = s.charAt(0);
			sb.append(previous);
			for (int i = 1; i < s.length(); i++) {
				char current = s.charAt(i);
				if (current != previous) {
					sb.append(current);
					previous = current;
				}
			}
		}
		return sb;
	}

}
