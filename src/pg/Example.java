package pg;

public class Example {
	public static void main(String[] args) {

		String s = "johnny can't program, he can only be told what to type";
		char[] chararray = s.toCharArray();
		chararray = remove_one_character_from_a_character_array_in_java(
				chararray, 23);
		System.out.println(chararray);
	}

	public static char[] remove_one_character_from_a_character_array_in_java(
			char[] original, int location_to_remove) {
		char[] result = new char[original.length - 1];
		int last_insert = 0;
		for (int i = 0; i < original.length; i++) {
			if (i == location_to_remove)
				i++;

			result[last_insert++] = original[i];
		}
		return result;
	}
}
