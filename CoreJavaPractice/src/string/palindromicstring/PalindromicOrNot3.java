package string.palindromicstring;

public class PalindromicOrNot3 {

	public static void main(String[] args) {
		
		String str = "abba";
		boolean result = isPalindrome(str);
		System.out.println(result);


	}
	
	public static boolean isPalindrome(String str) {
		
		int j = str.length() - 1;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == str.charAt(j--)) {
				continue;
			}
		}
		return false;
	}

}
