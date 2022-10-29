package generalCodingQuestions;
//
public class CheckPrime {

	public static void main(String[] args) {
		
		boolean result = checkPrime(5);
		System.out.println(result);
		
		if(Boolean.TRUE.equals(result)) {
			System.out.println("Given number is prime number");
		}else {
			System.out.print("Given number is not prime number");
		}
	}
	
	public static boolean checkPrime(int number) {
		
		//first check the given number is less than 1 or 1. then it is not prime.
		if(number<=1) {
			return false;
		}
		
		for(int i=2;i<=number/2;i++) {
			if(number%i == 0) {
				return false; // if divide by any ith value then this is not prime number
			}
		}
		return true;  // if not divide by any number means upto number/2 this ranges number then this is prime number.
	}

}
