// class Node{
//     int value;
//     Node next;
// }


//     public class LinkedList {
//         public static void main(String[] args) {
//             Node n1 = new   Node();
//             Node n2 = new Node();
//             n1.value =10;
//             n1.next =n2;
//             n2.value =20;
//             n2.next = null;

//         }
    
// }

import java.util.LinkedList;

public class LinkedListDemo {

    public static void main(String[] args) {

        LinkedList<Integer> l1 = new LinkedList<>();

        // Add elements
        l1.add(10);
        l1.add(20);
        l1.add(30);

        // Add at beginning and end
        l1.addFirst(5);
        l1.addLast(40);

        // Add at specific index
        l1.add(2, 15);

        System.out.println("After Adding: " + l1);

        // Update element
        l1.set(1, 100);
        System.out.println("After Updating: " + l1);

        // Get elements
        System.out.println("First Element: " + l1.getFirst());
        System.out.println("Last Element: " + l1.getLast());
        System.out.println("Element at Index 2: " + l1.get(2));

        // Remove elements
        l1.remove(2);
        l1.removeFirst();
        l1.removeLast();

        System.out.println("After Removing: " + l1);

        // Size
        System.out.println("Size: " + l1.size());

        // Check if element exists
        System.out.println("Contains 20? " + l1.contains(20));

        // Check if empty
        System.out.println("Is Empty? " + l1.isEmpty());

        // Clear list
        l1.clear();

        System.out.println("After Clear: " + l1);
        System.out.println("Is Empty? " + l1.isEmpty());
    }
}