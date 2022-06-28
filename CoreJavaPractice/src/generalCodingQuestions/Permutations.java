package generalCodingQuestions;

import java.util.Scanner;

public class Permutations {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string:");
		String str = sc.next();
		printPermutations(str, "");

	}

	// recursive method
	public static void printPermutations(String ques, String asf) {

		// base condition of recursion
		if (ques.length() == 0) {
			System.out.println(asf);
			return;
		}
		for (int i = 0; i < ques.length(); i++) {

			char ch = ques.charAt(i);
			String quesLeft = ques.substring(0, i);
			String quesRight = ques.substring(i + 1);

			String resQues = quesLeft + quesRight;
			// recursive call
			printPermutations(resQues, asf+ch);
		}
	}

}
