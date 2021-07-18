package patterns_35_types;

//Pattern 2- Right sided Triangle
public class Pattern2 {

	public static void main(String[] args) {
		
		int n=5;
		
		for(int i=1;i<=n;i++) {
			
			//decreasing triangle of spaces
			for(int j=i;j<=n;j++) {
				System.out.print(" ");
			}
			//increasing triangle of star
			
			for(int k=1;k<=i;k++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
