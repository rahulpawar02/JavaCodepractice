package patterns;

public class AsscendingNo {

	public static void main(String[] args) {

		int num = 1;

		for (int i = 1; i <= 4; i++) {

			for (int j = 1; j <= i; j++) {

				System.out.print(num);
				num += 1;
			}
			
			System.out.println();
		}

	}

}
/*
pattern like

1
2 3
4 5 6
7 8 9 10
 
*/

