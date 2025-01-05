package leetcode.datastructure;

public class Q_19_RemoveNthNodeFromEndLL_1 {

	public static void main(String[] args) {

		int values[] = { 1 };
		// Create LinkedList
		ListNode headNode = InitalizePrintList.createLinkedList(values);
		System.out.println("Head Node is: " + headNode.data);
		// Print the created linked list
		InitalizePrintList.printLinkedList(headNode);
		int n = 1;
		removeNthNode(headNode, n);
		InitalizePrintList.printLinkedList(headNode);
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
