package patterns.pyramid.withstar;
//row =6
//col =6

public class InvertedHalfPyramid {

	public static void main(String[] args) {
		
		for(int i=6;i>=1;i--) {
			for(int j=1;j<=i;j++) {
				if(i == 1 )
				System.out.print("*");
		  }
			System.out.println();
		}
	}
}
