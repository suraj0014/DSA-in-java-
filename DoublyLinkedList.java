public class DoublyLinkedList {
    public static void main(String[] args) {

        LinkedList list = new LinkedList();

        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);

        list.print();
        list.remove(3);
        list.print();    }
}

class LinkedList {

    class Node {
        int data;
        Node prev;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    Node head;

    
    void add(int data) {

        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            return;
        }

        Node curr = head;

        while (curr.next != null) {
            curr = curr.next;
        }

        curr.next = newNode;
        newNode.prev = curr;
    }
      void remove (int n){
        if (n == 1){
            head = head.next;
            head.prev = null;
            return;

        }
        Node curr = head;
        for (int i = 1; i < n - 1; i++){
            curr = curr.next;
        }
        if (curr != null){
            curr.next = curr.next.next;
            curr.next.next.prev = curr;
        } else{
            System.out.println(".invalid position!");
        }
      }
    
    void print() {

        Node curr = head;

        while (curr != null) {
            System.out.print(curr.data + " <-> ");
            curr = curr.next;
        }

        System.out.println("null");
    }
}