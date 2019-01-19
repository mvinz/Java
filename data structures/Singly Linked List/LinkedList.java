public class LinkedList{
    static Node head;

    public static void add(int value){
        if (head == null) {
            head = new Node(value);
            return;
        }
        Node current = head;
        while (current.next != null) {
            current = current.next;
        }

        current.next = new Node(value);
    }

    public static void newHead(int value){
        Node newHead = new Node(value);
        newHead.next = head;
        head = newHead;
    }

    public static void changeHead(int value){
        if (head == null) {
            System.out.println("No head.");
            return;
        }
        head.data = value;
    }

    public static void printHead(){
        if (head == null) {
            System.out.println("No head.");
            return;
        }
        System.out.println(head.data);
    }

    public static void delete(int value){
        if (head == null) {
            return;
        }
        if (head.data == value) {
            head = head.next;
            return;
        }

        Node current = head;
        while (current.next != null) {
            if (current.next.data == value) {
                current.next = current.next.next;
                return;
            }
            current = current.next;
        }
    }

    public static int howMany(){
        int count = 1;
        if (head == null) {
            return 0;
        }
        Node current = head;
        while (current.next != null) {
            current = current.next;
            count++;
        }
        return count;
    }

    public static void printAll(){
        Node current = head;
        while (current != null) {

            if (current.next == null) {
                System.out.println("| " + current.data + " |");
            }else {
                System.out.print("| " + current.data + " |-");
            }
            current = current.next;
        }
    }
}
