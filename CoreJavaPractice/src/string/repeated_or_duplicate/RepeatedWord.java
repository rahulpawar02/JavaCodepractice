package string.repeated_or_duplicate;

class RepeatedWord{

public static void main(String args[]){

	String str = "abcabcocc";

	char ch[] = str.toCharArray();
	// char empty [] = new char[str.length()];
	String str1 = " ";

	for(int i=0; i<ch.length;i++){


		for(int j=i+1;j<ch.length;j++){

			@SuppressWarnings("unused")
			int k=0;
			if(ch[i] == ch[j]){

				if(str1.contains(String.valueOf(ch[j]))){

					continue;

				}else{

					str1 += String.valueOf(ch[j]);
				}
				
			}
		}
	}

	System.out.println(str1);

  }

}