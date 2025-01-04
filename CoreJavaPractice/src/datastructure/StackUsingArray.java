package datastructure;

public class StackUsingArray {

	//Stack functions: push, pop, peek
	
	public static void main(String[] args) {
		
		Stack stack = new Stack(5);
		stack.push(3);
		stack.push(5);
		stack.printStack();

		int pick = stack.pick();
		System.out.println("pick value: " + pick);
		stack.pop();
		stack.printStack();
		
	}
}

class Stack {

	private int[] stackArray;
	private int top;

	public Stack(int size) {
		stackArray = new int[size];
		top = -1;
	}

	public void push(int element) {

		if (top == stackArray.length - 1) {
			System.out.println("Stack is full & can't push" + element);
			return;
		} // Increment top and insert the element
		++top;
		stackArray[top] = element;
	}
	
	public int pop() {
		
		if(isEmpty()) {
			System.out.println("Stack is empty, can't pop");
			return -1;
		}
		--top;
		return stackArray[top];
	}
	
	public int pick() {
		if(isEmpty()) {
			System.out.println("Stack is empty, can't pop");
			return -1;
		}
		return stackArray[top];
	}
	
	public boolean isEmpty() {
		return top == -1;
	}

	//print the stack
	public void printStack() {
		
		if(isEmpty()) {
			System.out.println("Stack is empty!");
			return;
		}
		
		System.out.println("Stack elements are:");
		for(int i =0; i <=top; i++ ) {
			System.out.println(stackArray[i]);
		}
	}

}

/*

When you implement a stack using an array, the pop operation typically works by decrementing the top index (or pointer) to reflect the removal of the top element. 
However, the actual data in the array remains intact unless explicitly cleared

int poppedValue = arr[top];
arr[top] = 0; // Clear the value
top--;

*/
