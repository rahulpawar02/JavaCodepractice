package patterns;

public class ReverseHalf {

	public static void main(String[] args) {
//		int num = 5;
		for(int i=5;i>=1;i--) {
			
			for(int j=0;j<i;j++) {
				System.out.print(i-j);
//				
			}
			System.out.println();
		}
	}

}

/*
Pattern like

5 4 3 2 1
4 3 2 1
3 2 1 
2 1
1
*/