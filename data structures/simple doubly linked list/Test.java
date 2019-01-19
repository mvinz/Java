class Test{
	public static void main(String[] args) {
		DoublyLinkedList list = new DoublyLinkedList();
		list.addToHead(5);
		list.addToHead(3);
		list.addToTail(7);
		list.addToTail(1);
		list.show();
		System.out.println("Inverse: ");
		list.showInvert();
	}
}