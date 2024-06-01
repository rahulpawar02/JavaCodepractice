package leetcode.datastructure;

// Second Approach: Two Pointer
public class Q_876_MiddleOfLinkedList_2 {

	public static void main(String[] args) {

		int[] values = { 1, 2, 3, 4, 5 };
		ListNode headNode = createLinkedList(values);
		System.out.println("Head Node is: " + headNode.data);
		printLinkedList(headNode);
		ListNode middleNodeData = middleNode(headNode);
		System.out.println("middle Node Data:" + middleNodeData.data);
	}

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
			System.out.println(current.data);
			current = current.next;
		}
	}
	//Approach 2:
	public static ListNode middleNode(ListNode head) {
		
		ListNode slow = head, fast = head;
		
		while(fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
		}
		return slow;
	}
}
