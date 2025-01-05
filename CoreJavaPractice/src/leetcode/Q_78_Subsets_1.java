package leetcode;
import java.util.ArrayList;
import java.util.List;

public class Q_78_Subsets_1 {

	public static void main(String[] args) {
   
	  int nums[] = {1, 2, 3};
	 
	  List<List<Integer>> resultSubSets = new ArrayList<>();
	  
	  resultSubSets.add(new ArrayList<>());
	  for(int num : nums) {
		  
		 int n = resultSubSets.size(); // this list dynmically changable based on list we copy list and add the element into it. so we need the size.
		  
		 for(int j = 0;j<n;j++) {
			 List<Integer> temp = new ArrayList<>(resultSubSets.get(j)); //copy resultSubSets of list
			 temp.add(num); //add number into that copy list
			 resultSubSets.add(temp); //add this temp list into resultSubSets list	 
		 }
	  }
	  System.out.println("result sets are:" + resultSubSets );
	}

}

//1 2 3
// []
// add 1 in the result set list [1]
//add into resultlist
// current list = [], [1]
//add next number 2 into resutlt listof list
//[2],[1,2]
// add into existing resultlist, [], [1], [2], [1,2]
//copy list and add the next number into it[3], [1,3], [2, 3], [1, 2,3] store into existing list.
//i.e [], [1], [2], [1, 2], [3], [1,3], [2, 3], [1, 2, 3]


//copy list
//add number into copy list
//add this list into main list