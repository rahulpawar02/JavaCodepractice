package generalCodingQuestions;

public class ReverseWordsInString {

	public static void main(String[] args) {
		
		String str = " My name is";
		str = str.trim();
		
		if(str.isEmpty()) {
			System.out.println("input is empty");
			return;
		}
		
		StringBuilder sb = new StringBuilder("");
		
		for (int i = 0; i < str.length(); i++) {

			if (str.charAt(i) == ' ') {
				System.out.print(sb.reverse());
				sb.setLength(0);
			}
			sb.append(str.charAt(i));
		}
		System.out.println(sb.reverse());	
	}
}
