public class DoublyLinkedList{
	class Node{
		int data;
		Node next, prev;
		Node(int data){
			this.data = data;
		}
	}

	Node head, tail;

	public void addToHead(int data){
		Node newHead = new Node(data);
		if (head == null) {
			head = newHead;
			tail = head;
		}
		else {
			head.prev = newHead;
			newHead.next = head;
			head = newHead;
		}
	}

	public void addToTail(int data){
		Node newTail = new Node(data);
		if (head == null) {
			head = newTail;
			tail = head;
		}
		else {
			newTail.prev = tail;
			tail.next = newTail;
			tail = newTail;
		}
	}

	public void delete(int data){
		if (head.data == data) {
			head = head.next;
			return;
		}
		if (tail.data == data) {
			tail = tail.prev;
			return;
		}
	}

	public void show(){
		Node current = head;
		while (current != null) {
			System.out.println(current.data);
			current = current.next;
		}
	}

	public void showInvert(){
		Node current = tail;
		while (current != null) {
			System.out.println(current.data);
			current = current.prev;
		}
	}

}