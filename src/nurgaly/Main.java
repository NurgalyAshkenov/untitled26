package nurgaly;

public class Main {
    public static void main(String[] args) {
        System.out.println("--- Testing MyArrayList ---");
        MyList<String> fruits = new MyArrayList<>();
        fruits.add("Mango");
        fruits.add("Peach");
        fruits.add(1, "Orange");
        fruits.remove("Peach");
        for (String item : fruits) {
            System.out.println("Fruit: " + item);
        }

        System.out.println("\n--- Testing MyLinkedList ---");
        MyList<String> animals = new MyLinkedList<>();
        animals.add("Wolf");
        animals.add("Fox");
        animals.add("Bear");
        animals.remove(0);
        animals.add(1, "Rabbit");
        for (String animal : animals) {
            System.out.println("Animal: " + animal);
        }

        System.out.println("\n--- Testing MyStack ---");
        MyStack<Integer> numberStack = new MyStack<>();
        numberStack.push(10);
        numberStack.push(20);
        numberStack.push(30);
        System.out.println("Popped: " + numberStack.pop());
        System.out.println("Top element: " + numberStack.peek());

        System.out.println("\n--- Testing MyQueue ---");
        MyQueue<String> line = new MyQueue<>();
        line.enqueue("Task1");
        line.enqueue("Task2");
        line.enqueue("Task3");
        System.out.println("Dequeued: " + line.dequeue());
        System.out.println("Next in line: " + line.peek());

        System.out.println("\n--- Testing MyMinHeap ---");
        MyMinHeap minHeap = new MyMinHeap();
        minHeap.insert(42);
        minHeap.insert(17);
        minHeap.insert(33);
        minHeap.insert(5);
        System.out.println("Extracted min: " + minHeap.extractMin());
        System.out.println("Current min: " + minHeap.peek());
    }
}
