Linked List Manipulation in Java
This repository contains a Java implementation of a singly linked list with various operations. The main feature of this implementation is the ability to delete the last occurrence of a specified item from the linked list.

Features
Add Elements: Append elements to the end of the linked list.
Delete Last Occurrence: Remove the last occurrence of a specified item from the list.
Display List: Print all elements of the linked list.
Implementation
Node Class
Represents an individual element in the linked list.
Contains data and a reference to the next node.
LinkedList Class
add(int data): Adds a new node with the given data to the end of the list.
deleteLastOccurrence(int target): Deletes the last occurrence of the specified target value from the list.
display(): Prints all elements of the linked list.
Main Method
The main method includes test cases to demonstrate:

Deleting the last occurrence of an item that appears multiple times.
Deleting the last occurrence of an item that only appears once.
Handling cases where the item does not exist in the list.

