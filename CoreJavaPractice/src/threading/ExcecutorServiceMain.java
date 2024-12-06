package threading;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExcecutorServiceMain {

	public static void main(String[] args) {

		List<Integer> numList = new ArrayList<>(Arrays.asList(1,4,3,5));
		executeThreading(numList);
	}
	
	public static List<Integer> executeThreading(List<Integer> numList) {
		
		ExecutorService executor = Executors.newFixedThreadPool(2);
        List<Integer> results = new ArrayList<>();
		
		for(int num : numList) {
			executor.submit(() -> {
				int square = num * num;
				synchronized (results) {
					results.add(square); // Adding result to the list (thread-safe)
				}
				System.out.println("Thread: " + Thread.currentThread().getName() + " processed number: " + num
						+ ", square: " + square);
			});
		}
		return new ArrayList<>();
	}

}
