package string.palindromicstring;

//Approach - 1
public class PalindromicOrNot1 {

	public static String checkPalind(String str1) {
		
		String rev_str = "";
		
		for(int i = str1.length()-1;i>=0;i--) {
			
			rev_str+= str1.charAt(i);			
		}
		
		if(str1.equals(rev_str)) {
			return "Palindromic String";
		}else {
			return "Not Palindromic String";
		}
		
	}
	public static void main(String[] args) {
	
		String str1 = "ab";
		System.out.println(checkPalind(str1));;

	}

}
