package string.palindromicstring;

//Approach 2- two pointer 
public class PalindromicOrNot2 {

	
	public static String checkPalind(String str1) {
		
		int i = 0;
		int j= str1.length()-1;
		
		while(i<j) {
			
			if(str1.charAt(i)!=str1.charAt(j)) {
				
				return "Not Palindromic String";
			}
			
			i++;
			j--;
		}
		
		return "Palindromic String";
	}
	
	public static void main(String[] args) {
		
		String str1 = "abbc";
		System.out.println(checkPalind(str1));
	}
}
