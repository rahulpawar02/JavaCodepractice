
//#2 - Pyramid Pattern Programs in C, C++, Java using stars.
// given 6 row 6 colums
package patterns.pyramid.withstar;

public class HalfPyramid {

	public static void main(String[] args) {
		
		//for row
		for(int i = 1 ;i<=6;i++) {
			//for column
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
