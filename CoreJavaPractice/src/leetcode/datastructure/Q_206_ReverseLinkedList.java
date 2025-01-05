package leetcode.datastructure;

public class Q_206_ReverseLinkedList {

	public static void main(String[] args) {

		int[] values = { 1, 2, 3, 4, 5 };
		ListNode headNode = InitalizePrintList.createLinkedList(values);
		InitalizePrintList.printLinkedList(headNode);

		System.out.println();
		ListNode reversedHeadNode = reverseLinedList(headNode);
		System.out.println("Reversed LinkedList is:");
		InitalizePrintList.printLinkedList(reversedHeadNode);

	}

	public static ListNode reverseLinedList(ListNode headNode) {

		if (headNode == null) {
			return null;
		}

		if (headNode.next == null) {
			return headNode;
		}

		ListNode prevNode = null;
		ListNode currNode = headNode;

		while (currNode != null) {
			ListNode nextNode = currNode.next;
			currNode.next = prevNode;
			prevNode = currNode;
			currNode = nextNode;
		}

		headNode = prevNode;
		return headNode;
	}
}

/*
 
output:
 
LinkedList data is:
1 2 3 4 5 

Reversed LinkedList is:
LinkedList data is:
5 4 3 2 1 

*/
