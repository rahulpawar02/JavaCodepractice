package leetcode.datastructure;

//Second Approach: two pointer
public class Q_19_RemoveNthNodeFromEndLL_2 {

	public static void main(String[] args) {

		int values[] = { 1, 2, 3, 4, 5 };
		// Create LinkedList
		ListNode headNode = createLinkedList(values);
		System.out.println("Head Node is: " + headNode.data);
		// Print the created linked list
		printLinkedList(headNode);
		int n = 3;
		ListNode headNode2 = removeNthNode(headNode, n);
		printLinkedList(headNode2);
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
	//Approach 2
	public static ListNode removeNthNode(ListNode head, int n) {
		
		ListNode dummy = new ListNode(0);
		dummy.next = head;
		
		ListNode first = dummy;
		ListNode second = dummy;
		
		for(int i = 0; i <= n; i++) {
			first = first.next;
		}
		
		while(first != null) {
			first = first.next;
			second = second.next;
		}
		
		second.next = second.next.next;
		return dummy.next;
	}
}
