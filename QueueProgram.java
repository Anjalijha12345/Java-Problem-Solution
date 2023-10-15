import java.util.*;

public class QueueProgram {
    public static void main(String[] args) {
        Queue queue = new Queue();  // Create an instance of the Queue class
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("Queue Operations:");
            System.out.println("1. Enqueue");
            System.out.println("2. Dequeue");
            System.out.println("3. Peek");
            System.out.println("4. Display");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();  // Read the user's menu choice

            switch (choice) {
                case 1:
                    System.out.print("Enter the element to enqueue: ");
                    int item = scanner.nextInt();
                    queue.enqueue(item);  // Call the enqueue method to add an element to the queue
                    break;

                case 2:
                    int dequeuedItem = queue.dequeue();  // Call the dequeue method to remove an element
                    if (dequeuedItem != -1)
                        System.out.println("Dequeued: " + dequeuedItem);
                    break;

                case 3:
                    int peekItem = queue.peek();  // Call the peek method to view the front element
                    if (peekItem != -1)
                        System.out.println("Peek: " + peekItem);
                    break;

                case 4:
                    queue.display();  // Call the display method to show the elements in the queue
                    break;

                case 5:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice. Try again.");
            }
        } while (choice != 5);  // Continue the menu loop until the user chooses to exit (choice 5)
        scanner.close();  // Close the scanner when done
    }
}
