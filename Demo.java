import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Scanner;

public class Demo {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static class LinkedList{
        Node head ;
         public void insertAtTail(int data){
             Node newNode = new Node(data);

//             if the list is empty then add new Node and make it head
             if(head == null){
                 head = newNode;
             } else{
                 Node currentNode = head;
                 while(currentNode.next != null){
                     currentNode = currentNode.next;
                 }
                 currentNode.next = newNode;
             }
         }

        // Method to print the linked list
        public void printList() {
            Node current = head;
            while (current != null) {
                System.out.println(current.data);
                current = current.next;
            }
        }
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        LinkedList list = new LinkedList();

        int n = scanner.nextInt();

        for(int i =0; i < n; i++){
            int data = scanner.nextInt();
            list.insertAtTail(data);
        }
        list.printList();
        scanner.close();
    }
}
