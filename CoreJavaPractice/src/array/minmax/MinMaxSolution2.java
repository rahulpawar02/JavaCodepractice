package array.minmax;

//approach 2 tournament method
public class MinMaxSolution2{

	static class Pair{
	
		int max;
		int min;
	}

	public static Pair getMinMax(int arr[], int low, int high){
 		
 		Pair minmax = new Pair();
 		Pair mml = new Pair();
 		Pair mmr = new Pair();
 		
		//if one element
		if(low == high){
			minmax.min = arr[low];
			minmax.max = arr[low];
			return minmax;		
		} 		
 	
 		//if two elements
 		if(high == low+1){ //check two elements 
 			if(arr[low]>arr[high]){ //compare between two elements 
 				
 				minmax.max = arr[low];
 				minmax.min = arr[high];
 			}else{
 				minmax.max = arr[high];
 				minmax.min = arr[low];
 			
 			} 	
 		}
 		
 		//if more than two elements
 		int mid = (low+high)/2;
 		    mml = getMinMax(arr,low,mid);
 		    mmr = getMinMax(arr,mid+1,high);
 		    
 		//compare minimums of two parts
 		if(mml.min < mmr.min){
 			minmax.min = mml.min;
 		}else{
 			minmax.min = mmr.min;
 		}
 		
 		//compare maximums of two parts
 		if(mml.max>mmr.max){
 			minmax.max = mml.max;
 		}else{
 			minmax.max = mmr.max;
 		}
 		
 		return minmax;
 	}		    		

	public static void main(String args[]){
		int arr[] = {1,2,3,4,5,6};
		int len = arr.length;
		
		Pair minmax = getMinMax(arr,0,len-1);
		
		System.out.println("maximum element:"+minmax.max);
		System.out.println("minimum element:"+minmax.min);
	}

}	