class Node {
int data;
Node next;
Node prev;
// Constructor
public Node(int data) {
 this.data = data;
 this.next = null;
 this.prev = null;
}
}
//Doubly Linked List class
class DoublyLinkedList {
private Node head;
// Constructor to initialize empty list
public DoublyLinkedList() {
 this.head = null;
}
// Function to insert a node at the beginning
public void insertAtBegin(int data) {
 // Create a new node
 Node newNode = new Node(data);
 
 // Link the new node to the current head
 newNode.next = head;
 // If the list is not empty, update the previous pointer of the current head
 if (head != null) {
 head.prev = newNode;
 }
 
 // Update the head to point to the new node
 head = newNode;
}
// Function to display the list in forward direction
public void displayList() {
 Node temp = head;
 while (temp != null) {
 System.out.print(temp.data + " <-> ");
 temp = temp.next;
 }
 System.out.println("NULL");
}
}
public class linked{
public static void main(String[] args) {
 // Initialize an empty list
 DoublyLinkedList list = new DoublyLinkedList();
 
 // Insert nodes at the beginning
 list.insertAtBegin(10);
 list.insertAtBegin(20);
 list.insertAtBegin(30);
 
 // Display the linked list
 System.out.print("Doubly Linked List: ");
 list.displayList();
}
}