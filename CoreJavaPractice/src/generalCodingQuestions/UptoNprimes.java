package generalCodingQuestions;

public class UptoNprimes {

	public static void main(String[] args) {

		int target_no = 7;

		for (int i = 2; i <= target_no; i++) {

			int count = 0;
			for (int j = 2; j * j <= i; j++) {
				if (i % j == 0) {
					count++;
					break;
				}
			}
			
			if(count == 0) {
				System.out.println(i);
			}
			

		}

	}

}
