package leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class FirstUniqueCharacter {

	public static void main(String[] args) {
		
		String s = "loveleetcode";
		int arr[] = new int [256];
		Map<Character, Integer> map=  new HashMap<>();
		for(int i=0;i<s.length();i++) 
		{
			arr[s.charAt(i)]+=1;
			System.out.println(s.charAt(i)+" "+arr[s.charAt(i)]);
			
			System.out.println(map);
		}
		
		
	
//		
//		for(int i=0;i<arr.length;i++) 
//		{
//			int count = 0;
////			while(arr[i]!=0) {
////				count++;
////				System.out.println(count);
////			}
//				
//			if(arr[s.charAt(i)]>1) {
//				count++;
//				System.out.println(count);
////			}
////	   }
//		
//		for(int i=0;i<arr.length;i++) {
//			
//			if(arr[i]>0) {
//				for(int j=0;j<s.length();j++) {
//					System.out.println(arr[i]);
//					map.put(s.charAt(j), arr[i]);
//				}
//				
//			}
//		}
	
	}
	
	
}
