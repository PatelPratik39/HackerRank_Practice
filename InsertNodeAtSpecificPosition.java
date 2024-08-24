/**
 *
 */


public class InsertNodeAtSpecificPosition {
    static class Node {
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    static class LinkedList{
        Node head;

        public void insertAtTail ( int data ) {
            Node newNode = new Node(data);

            if(head == null){
                head = newNode;
            } else{
                Node current = head;

                while(current.next != null){
                    current = current.next;
                }
                current.next = newNode;
            }
        }

        public void insertAfter(Node prevNode, int newData){
            if(prevNode == null){
                System.out.println("Previosu Node can not be null");
                return;
            }

            Node newNode = new Node(newData);
            newNode.next = prevNode.next;
            prevNode.next = newNode;
        }

        public void printList(){
            Node current = head;
            while (current != null){
                System.out.print(current.data + " -> ");
                current = current.next;
            }
            System.out.println("Null");
        }
    }

    public static void main ( String[] args ) {
        LinkedList list = new LinkedList();

        list.insertAtTail(1);
        list.insertAtTail(2);
        list.insertAtTail(3);
        System.out.println();
        list.printList();

        Node secondNode = list.head.next;
        list.insertAfter(secondNode,4);
        list.printList();
    }
}
