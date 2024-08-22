// Saravana Bava S K
// Linked List Deletion program
// date = 23/08/2024
public class LinkedListExample {
    static class Node {
        int data;
        Node next;
        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    static class LinkedList {
        Node head;
        public void add(int data) {
            if (head == null) {
                head = new Node(data);
            } else {
                Node current = head;
                while (current.next != null) {
                    current = current.next;
                }
                current.next = new Node(data);
            }
        }
        public void deleteLastOccurrence(int target) {
            if (head == null) return;     
            Node current = head;
            Node lastOccurrence = null;
            Node prev = null;
            Node prevLastOccurrence = null;
            while (current != null) {
                if (current.data == target) {
                    lastOccurrence = current;
                    prevLastOccurrence = prev;
                }
                prev = current;
                current = current.next;
            }
            if (lastOccurrence != null) {
                if (lastOccurrence == head) {
                    head = head.next;
                } else if (prevLastOccurrence != null) {
                    prevLastOccurrence.next = lastOccurrence.next;
                }
            }
        }
        public void display() {
            Node current = head;
            while (current != null) {
                System.out.print(current.data + " ");
                current = current.next;
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(2);
        list.add(4);
        list.add(2);
        
        System.out.println("Original List:");
        list.display();
        
        list.deleteLastOccurrence(2);
        System.out.println("List after deleting last occurrence of 2:");
        list.display();
 
        list.deleteLastOccurrence(4);
        System.out.println("List after deleting last occurrence of 4:");
        list.display();

        list.deleteLastOccurrence(1);
        System.out.println("List after deleting last occurrence of 1:");
        list.display();
        
        list.deleteLastOccurrence(10);
        System.out.println("List after trying to delete last occurrence of 10:");
        list.display();
        
        list.deleteLastOccurrence(3);
        System.out.println("List after deleting last occurrence of 3:");
        list.display();
    }
}

