public class LinkedList{
	class Node{
		int data;
		Node next;
		Node(int data){
			this.data = data;
		}
	}

	Node head;

	public void add(int data){
		if (head == null) {
			head = new Node(data);
			return;
		}
		Node current = head;
		while (current.next != null) {
			current = current.next;
		}
		current.next = new Node(data);
	}

	public void delete(int data){
		if (head == null) {
			return;	
		}
		if (head.data == data) {
			head = head.next;
			return;
		}
		Node current = head;
		while (current.next != null) {
			if (current.next.data == data) {
				current.next = current.next.next;
				return;
			}
			current = current.next;
		}
	}

	public void display(){
		Node current = head;
		while (current != null) {
			if (current.next == null) {
				System.out.println("| " + current.data + " |");
			}
			else {
				System.out.print("| " + current.data + " | - ");
			}
			current = current.next;
		}
	}
}