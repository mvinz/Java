import java.util.*;

class Testing{
    static Scanner scan = new Scanner(System.in);
    static LinkedList box = new LinkedList();

    static int choice;

    public static void main(String[] args) {
        while (true) {
            choices();
            choice = scan.nextInt();
            interpreter(choice);
        }
    }

    public static void choices(){
        System.out.println("-------------------------------");
        System.out.println("1. Add new element.");
        System.out.println("2. New head.");
        System.out.println("3. Delete element.");
        System.out.println("4. Print how many elements.");
        System.out.println("5. Print all elements.");
        System.out.println("6. Change head data.");
        System.out.println("7. Print head data.");
        System.out.println("8. Exit.");
        System.out.print("Choose: ");
    }

    public static void interpreter(int choice){
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
                box.newHead(value);
                terminate();
                break;
            case 3:
                System.out.print("Value: ");
                value = scan.nextInt();
                box.delete(value);
                terminate();
                break;
            case 4:
                System.out.println(box.howMany());
                terminate();
                break;
            case 5:
                box.printAll();
                terminate();
                break;
            case 6:
                System.out.print("Value: ");
                value = scan.nextInt();
                box.changeHead(value);
                terminate();
                break;
            case 7:
                box.printHead();
                terminate();
                break;
            case 8:
                System.exit(0);
        }
    }

    public static void terminate(){
        System.out.println("-------------------------------");
    }
}
