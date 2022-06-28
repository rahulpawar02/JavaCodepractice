package string.repeated_or_duplicate;

public class RepeatedWordTest2 {

	public static void main(String[] args) {
		
		String str = "abca";
		System.out.println(checkRepeated(str));

	}
	
	public static boolean checkRepeated(String str) {
	
		for(int i=0;i<str.length();i++) {
			
			for(int j=i+1;j<str.length();j++) {
				
				if(str.charAt(i) == str.charAt(j)) {
					return true;
				}
			}
		}
		return false;
	}
}
