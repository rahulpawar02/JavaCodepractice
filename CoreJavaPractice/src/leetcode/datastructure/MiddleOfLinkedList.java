package leetcode.datastructure;

public class MiddleOfLinkedList {

	public static void main(String[] args) {

		int[] values = { 1, 2, 3, 4, 5, 6 };
		ListNode head = createLinkedList(values);
	    ListNode middleNodeData = middleNode(head);
	    System.out.println("middle Node Data:" + middleNodeData.data);
	}

	// create LinkedList of ListNode
	public static ListNode createLinkedList(int[] values) {
		if (values.length == 0) {
			return null;
		}
		
		ListNode head = new ListNode(values[0]);
		ListNode current = head;
		
		for(int i = 1;i < values.length; i++) {
			 current.next = new ListNode(values[i]);// When you write current.next = new ListNode(val);, a new ListNode object is created, and the address/reference to this new object is stored in  the next field of the current node
			 current = current.next;// moves the current pointer to this new node, preparing for the next iteration.
		}
		return head;
	}
	
    // find the middle node of a linked list
	public static ListNode middleNode(ListNode head) {
		
		ListNode temp = head;
		if (head.next == null) {
			return head;
		}
		
        // Traverse the list to count the total number of nodes
		int count = 1;
		while (head.next != null) {
			head = head.next;
			count++;
		}

        // Traverse the list again to reach the middle node
		int middle = count / 2 + 1;
		int count2 = 1;
		while (count2 != middle) {
			temp = temp.next;
			count2++;
		}
		return temp;
	}

}