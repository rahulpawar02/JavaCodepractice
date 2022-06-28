package string.repeated_or_duplicate;

public class RepeatedWordTest3 {

	public static void main(String[] args) {
		
		String str = "abc";
		System.out.println(checkRepeated(str));

	}

	private static boolean checkRepeated(String str) {
		
		String tempStr = " ";
		for(int i = 0;i<str.length();i++) {
			
			String strTemp = String.valueOf(str.charAt(i));
			if(tempStr.contains(strTemp)) {
				return true;
			}
				tempStr += strTemp; 
		}
		return false;
	}

}
