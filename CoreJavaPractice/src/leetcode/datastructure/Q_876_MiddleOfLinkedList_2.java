package leetcode.datastructure;

// Second Approach: Two Pointer
public class Q_876_MiddleOfLinkedList_2 {

	public static void main(String[] args) {

		int[] values = { 1, 2, 3, 4, 5 };
		ListNode headNode = InitalizePrintList.createLinkedList(values);
		System.out.println("Head Node is: " + headNode.data);
		InitalizePrintList.printLinkedList(headNode);
		ListNode middleNodeData = middleNode(headNode);
		System.out.println("middle Node Data:" + middleNodeData.data);
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
