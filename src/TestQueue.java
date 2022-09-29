/*import java.util.Scanner;

public class TestQueue {
    // Global stack so the data can be sent between switch-cases.
    static Queue<Integer> gStack = new Queue<Integer>();

    static Scanner sc = new Scanner(System.in);

    // Runs the menu.
    public static void main(String[] args) { menu(); }

    // Standard input method, allows me to not retype input prompts.
    static int input(String msg) {
        System.out.println(msg);
        return Integer.parseInt(sc.next());
    }

    /// The main logic of the program, takes in and input and sends it to
    /// The switch-statement to be acted upon.
    static void menu() {
        while (true) {
            System.out.print(
                    "\n---------MAIN MENU---------\n" +
                            "1. Enqueue Element\n" +
                            "2. Dequeue Element\n" +
                            "3. Front Element\n" +
                            "4. Size of Queue\n" +
                            "5. Is Empty Queue?\n" +
                            "6. Print Queue Content\n" +
                            "7. Exit Program\n\n"
            );

            var choice = input("");

            String str;
            Queue<Integer> pStack;
            int data;
            switch (choice) {
                case 1:
                    str = gStack.toString();
                    data = input("Element to enqueue: ");
                    gStack.enqueue(data);
                    System.out.println("Added value " + data + " to the queue.");
                    System.out.print("Queue content before adding " + data + " is: " + str + "\n");
                    System.out.print("Queue content after adding " + data + " is: " + gStack + "\n");
                    break;
                case 2:
                    str = gStack.toString();
                    data = gStack.dequeue();
                    System.out.println("Removed value " + data + " to the queue.");
                    System.out.print("Queue content before removing " + data + " is: " + str + "\n");
                    System.out.print("Queue content after removing " + data + " is: " + gStack + "\n");
                    break;
                case 3:
                    System.out.println("Top element of the queue is: " + gStack.front());
                    break;
                case 4:
                    System.out.println("The size of the queue is: " + gStack.size());
                    break;
                case 5:
                    System.out.println((gStack.isEmpty())? "Queue Empty." : "Queue Not Empty");
                    break;
                case 6:
                    System.out.println(gStack);
                    break;
                case 7:
                    System.out.println("Exiting Program.");
                    return;
                default:
                    break;
            }
        }
    }
}*/