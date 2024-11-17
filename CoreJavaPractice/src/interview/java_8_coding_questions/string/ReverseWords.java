package interview.java_8_coding_questions.string;

import java.util.Arrays;
import java.util.stream.Collectors;

public class ReverseWords {

	public static void main(String[] args) {
		String str = " My name is";
		String reverseWords = Arrays.stream(str.split(" ")).map(word -> new StringBuilder(word).reverse().toString())
				.collect(Collectors.joining(" "));
		System.out.println(reverseWords);
	}
}
