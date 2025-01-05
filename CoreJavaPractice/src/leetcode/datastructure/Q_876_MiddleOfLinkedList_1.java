package leetcode.datastructure;

//Approach 1
public class Q_876_MiddleOfLinkedList_1 {

	public static void main(String[] args) {

		int[] values = { 1, 2, 3, 4, 5, 6 };
		ListNode headNode = InitalizePrintList.createLinkedList(values);
		System.out.println("Head Node is: " + headNode.data);
		InitalizePrintList.printLinkedList(headNode);
	    ListNode middleNodeData = middleNode(headNode);
	    System.out.println("middle Node Data:" + middleNodeData.data);
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