package array.minmax;
//Approach 1st linear search
public class MinMaxSolution1{

	 static class Pair{
		 
	 	int min;
	 	int max;
	  }
	  
	 public static Pair getMinMax(int arr[], int len){
		Pair minmax = new Pair();
		
		//if there is only one element
		if(len == 1){
			minmax.min = arr[0];
			minmax.max = arr[0];
			return minmax;
		}	
		
		//if more than one element in array and this one comparison to determine max and min
		if(arr[0]>arr[1]){  //1st comparison
			minmax.max = arr[0];
			minmax.min = arr[1];
		}else{
			
			minmax.max = arr[1];
			minmax.min = arr[0];
		}
		
		for(int i = 2;i<len;i++){ // inside for loop 3 comparision for accending order
			if(arr[i]>minmax.max){
				
				minmax.max = arr[i];
			}else if(arr[i] < minmax.min){
				
					  minmax.min = arr[i];
		        }
		}
		
		return minmax;
	} 

	 public static void main(String args[]) {
	        int arr[] = {1,2,3,4,5}; //1+n-2 for ascending order total comparison = 4
	      //int arr[] = {5,4,3,2,1}; //1+2(n-2) for descending order, total comparision = 7 inside for loop 6 and outside 1. 
	        int arrlen = arr.length;
	        Pair minmaxresult = getMinMax(arr,arrlen);
	        
	        System.out.println("max:"+minmaxresult.max);
	        System.out.println("min:"+minmaxresult.min);
		}

	}        