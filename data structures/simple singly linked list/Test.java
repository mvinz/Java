import java.util.*;

class Test{
	static Scanner scan = new Scanner(System.in);
    static LinkedList box = new LinkedList();

    static int choice;

    public static void main(String[] args) {
        while (true) {
            choices();
            choice = scan.nextInt();
            interpreter();
        }
    }

    public static void choices(){
        System.out.println("-------------------------------");
        System.out.println("1. Add new element.");
        System.out.println("2. Delete element.");
        System.out.println("3. Print the list.");
        System.out.println("4. Exit.");
        System.out.print("Choose: ");
    }

    public static void interpreter(){
        switch (choice) {
            case 1:
                System.out.print("Value: ");
                int value = scan.nextInt();
                box.add(value);
                terminate();
                break;
            case 2:
                System.out.print("Value: ");
                value = scan.nextInt();
                box.delete(value);
                terminate();
                break;
            case 3:
                box.display();
                terminate();
                break;
            case 4:
                System.exit(0);
        }
    }

    public static void terminate(){
        System.out.println("-------------------------------");
    }
}