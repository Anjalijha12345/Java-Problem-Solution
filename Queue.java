class Queue {
    private static final int MAX_SIZE = 10;  // Maximum size of the queue
    private int[] queueArray;  // Array to store queue elements
    private int front;  // Pointer to the front of the queue
    private int rear;   // Pointer to the rear of the queue
    private int size;   // Current number of elements in the queue

    public Queue() {
        queueArray = new int[MAX_SIZE];  // Initialize the array with the maximum size
        front = -1;  // Initialize the front pointer to -1
        rear = -1;   // Initialize the rear pointer to -1
        size = 0;    // Initialize the size to 0 (empty queue)
    }

    public boolean isEmpty() {
        return size == 0;  // Check if the queue is empty (size is 0)
    }

    public boolean isFull() {
        return size == MAX_SIZE;  // Check if the queue is full (size is equal to the maximum size)
    }

    public void enqueue(int item) {
        if (isFull()) {
            System.out.println("Queue is full. Cannot enqueue.");
            return;
        }

        if (rear == -1) {
            front = 0;
            rear = 0;
        } else {
            rear++;  // Increment the rear pointer to insert the new element
        }

        queueArray[rear] = item;  // Add the new element to the rear of the queue
        size++;  // Increment the size
        System.out.println("Enqueued: " + item);
    }

    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty. Cannot dequeue.");
            return -1;
        }

        int item = queueArray[front];  // Get the element at the front of the queue
        front++;  // Increment the front pointer to remove the front element
        size--;   // Decrement the size

        if (front > rear) {
            front = -1;
            rear = -1;  // Reset both pointers when the queue becomes empty
        }

        return item;  // Return the dequeued element
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Queue is empty.");
            return -1;
        }

        return queueArray[front];  // Get the element at the front of the queue without dequeuing
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("Queue is empty.");
            return;
        }

        System.out.print("Queue: ");
        for (int i = front; i <= rear; i++) {
            System.out.print(queueArray[i] + " ");  // Display all elements in the queue from front to rear
        }
        System.out.println();
    }
}
