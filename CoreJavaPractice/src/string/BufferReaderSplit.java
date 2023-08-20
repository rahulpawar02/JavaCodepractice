package string;
//
//import java.io.BufferedReader;
//import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class BufferReaderSplit {

	public static void main(String args[] ) throws Exception {
        //BufferedReader
       // String eventTime[];
		
		String[] eventTime = {};

		try (Scanner sc = new Scanner(System.in)) {
			//		while (sc.hasNext()) {
//			int i=0;
			eventTime = sc.nextLine().split(" ");
		//}
		}
System.out.println("aa" + Arrays.toString(eventTime));
		
//        int a[] = new int[eventTime.length];
//
//        for(int i=0;i<eventTime.length;i++){
//            a[i] = Integer.parseInt(eventTime[i]);
//        }
//              
//		Scanner sc1 = new Scanner(System.in);
//		int noOfpass = sc1.nextInt();
//		
//        String[] arrvTime = {};
//
//		Scanner sc2 = new Scanner(System.in);
//		arrvTime = sc2.nextLine().split(" ");
//		
//        int b[] = new int[arrvTime.length];
//
//        for(int i=0;i<arrvTime.length;i++){
//            b[i] = Integer.parseInt(arrvTime[i]);
//        }       
//        
//		int time = 0;
//		for (int i = 0; i < noOfpass; i++) {
//			time += a[0] + a[2];
//		}
//        System.out.println(time);

    }
}
