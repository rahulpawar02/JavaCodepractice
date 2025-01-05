package leetcode.datastructure;

//Second Approach: two pointer
public class Q_19_RemoveNthNodeFromEndLL_2 {

	public static void main(String[] args) {

		int values[] = { 1, 2, 3, 4, 5 };
		// Create LinkedList
		ListNode headNode = InitalizePrintList.createLinkedList(values);
		System.out.println("Head Node is: " + headNode.data);
		// Print the created linked list
		InitalizePrintList.printLinkedList(headNode);
		int n = 3;
		ListNode headNode2 = removeNthNode(headNode, n);
		InitalizePrintList.printLinkedList(headNode2);
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
