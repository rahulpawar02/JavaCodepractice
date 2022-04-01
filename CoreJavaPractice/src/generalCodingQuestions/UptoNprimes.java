package generalCodingQuestions;

public class UptoNprimes {

	public static void main(String[] args) {

		//remember: 2 is always prime no  & prime number is only divide by itself, if divide by any number then this is not prime number.
		int target_no = 7;

		for (int i = 2; i <= target_no; i++) {

			int count = 0; //we take a count variable for the tracing purpose.
			for (int j = 2; j * j <= i; j++) { //under this we are write the logic of checking prime or not.
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
