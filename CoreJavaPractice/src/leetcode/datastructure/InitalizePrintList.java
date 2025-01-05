package leetcode.datastructure;

public class InitalizePrintList {

	// create LinkedList of ListNode
	public static ListNode createLinkedList(int[] values) {
		if (values.length == 0) {
			return null;
		}

		ListNode head = new ListNode(values[0]);
		ListNode current = head;

		for (int i = 1; i < values.length; i++) {
			current.next = new ListNode(values[i]);// When you write current.next = new ListNode(val);, a new ListNode object is created, and the address/reference to this new object is stored in the next field of the current node
			current = current.next;// moves the current pointer to this new node, preparing for the next iteration.
		}
		return head;
	}

	// Print the created linked list
	public static void printLinkedList(ListNode headNode) {

		ListNode current = headNode;
		System.out.println("LinkedList data is:");
		while (current != null) {
			System.out.print(current.data + " ");
			current = current.next;
		}
	}
}
