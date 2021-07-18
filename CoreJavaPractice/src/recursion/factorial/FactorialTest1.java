package recursion.factorial;

public class FactorialTest1 {

	public static int findFactorial(int n) {
		
		int fact = 1;
		for(int i=1;i<=n;i++) {
			
			fact = fact *i;
		}
		return fact;		
	}
	public static void main(String[] args) {
	
		int result = findFactorial(5);
		System.out.println(result);
	}

}
