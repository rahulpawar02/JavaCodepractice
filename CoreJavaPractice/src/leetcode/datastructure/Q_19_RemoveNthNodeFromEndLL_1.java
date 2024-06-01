package leetcode.datastructure;

public class Q_19_RemoveNthNodeFromEndLL_1 {

	public static void main(String[] args) {

		int values[] = { 1 };
		// Create LinkedList
		ListNode headNode = createLinkedList(values);
		System.out.println("Head Node is: " + headNode.data);
		// Print the created linked list
		printLinkedList(headNode);
		int n = 1;
		removeNthNode(headNode, n);
		printLinkedList(headNode);

	}

	public static ListNode createLinkedList(int values[]) {

		if (values.length == 0) {
			return null;
		}

		ListNode head = new ListNode(values[0]);
		ListNode current = head;

		for (int i = 1; i < values.length; i++) {
			current.next = new ListNode(values[i]);
			current = current.next;
		}
		return head;
	}

	public static void printLinkedList(ListNode headNode) {

		ListNode current = headNode;
		System.out.println("LinkedList data is:");
		while (current != null) {
			System.out.println(current.data);
			current = current.next;
		}
	}
	
	//Approach 1
	public static void removeNthNode(ListNode headNode, int n) {
		
		//fint out count;
		ListNode current = headNode;
		int count = 0;
		
		while(current != null) {
			current = current.next;
			count++;
		}
		
		if(count == 1 && n == 1) {
			headNode = null;
			return;
		}			
		current = headNode;
		int prevIndex = count-n;
		
		//ll = [1,2] and n=2, we are delete the head node.
		
		if(prevIndex == 0) {
			headNode = current.next;
		}

		while(current != null) {
			prevIndex--;
			if(prevIndex == 0) {
				current.next = current.next.next;
				return;
			}
			current = current.next;
		}	
	}
}
