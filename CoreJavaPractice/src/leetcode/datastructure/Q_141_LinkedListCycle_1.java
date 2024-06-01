package leetcode.datastructure;

import java.util.HashSet;

//First Approach: 

public class Q_141_LinkedListCycle_1 {

	public static void main(String[] args) {

		int values[] = { 1, 2, 3, 4, 5 };
		// Create LinkedList
		ListNode headNode = createCyclicLinkedList(values);
		System.out.println("Head Node is: " + headNode.data);
		// Print the created linked list
		//printLinkedList(headNode);
		boolean hasCycle = hasCycle(headNode);
		System.out.println("is cycle present:" + hasCycle);
	}

	public static ListNode createCyclicLinkedList(int values[]) {

		if (values.length == 0) {
			return null;
		}

		ListNode head = new ListNode(values[0]);
		ListNode current = head;
		ListNode temp = null;
		for (int i = 1; i < values.length; i++) {
			current.next = new ListNode(values[i]);
			current = current.next;
			if(values[i] == 3) {
				temp = current;
			}
		}
		
		if(current.next == null) {
			current.next = temp;
		}
		return head;
	}
//we not printing the cyclic LinkedList, becuase it's infinite.
/*	public static void printLinkedList(ListNode headNode) {
		ListNode current = headNode;
		System.out.println("LinkedList data is:");
		while (current != null) {
			System.out.println(current.data);
			current = current.next;
		}		
		System.out.println("last node address:" + current.next );
	}
*/
	
	//Apporach 1:
	static boolean hasCycle(ListNode head) {

		HashSet<ListNode> visitedNode = new HashSet<ListNode>();

		while (head != null) {
			if (visitedNode.contains(head)) {
				return true;
			}
			visitedNode.add(head);
			head = head.next;
		}
		return false;
	}
}

//cyclic Linked List like:
//1 -> 2 -> 3 -> 4 -> 5 -> 3 ->4 -> 5 -> 3 -> .... infinite
//O/P: is cycle present: true
