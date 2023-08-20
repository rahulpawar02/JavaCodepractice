package interview.java_8_coding_questions.string;

import java.util.Arrays;
import java.util.List;

//Given a list of integers, find the maximum value element present in it using Stream functions?
public class MaxValueElement {

	public static void main(String[] args) {
        List<Integer> myList = Arrays.asList(10,15,8,49,25,98,98,32,15,101);

        int maxEle = myList.stream().max(Integer::compare).get();
        System.out.println("Max value element:" + maxEle);
	}	
}
