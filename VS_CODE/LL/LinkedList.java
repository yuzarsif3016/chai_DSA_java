class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class LinkedList {
    Node head;

    public static void main(String[] args) {
        LinkedList l = new LinkedList();
        l = l.insertAtEnd(l, 1);
        l = l.insertAtEnd(l, 2);
        l = l.insertAtEnd(l, 3);
        l = l.insertAtEnd(l, 4);
        l.insertAtIndex(l,44,3 );
        l.print(l);
    }

    LinkedList insertAtEnd(LinkedList l, int x) {

        Node newNode = new Node(x);
        if (l.head == null) {
            l.head = newNode;
            return l;
        } else {
            Node curr = l.head;
            while (curr.next != null) {
                curr = curr.next;
            }
            curr.next = newNode;
            return l;
        }
    }

    void print(LinkedList l) {
        Node curr = l.head;
        while (curr != null) {
            System.out.print(curr.data + " -> ");
            curr = curr.next;

        }
        System.out.println();
    }

    void insertAtIndex(LinkedList l, int x, int index) {
        Node newNode = new Node(x);
        if (index == 0) {
            newNode.next = l.head;
            l.head = newNode;
        } else {
            Node curr = l.head;
            while (index > 1 && curr != null) {
                curr = curr.next;
                index--;
            }
            if (curr == null) {
                System.out.println("Index out of bounds");
            } else {
                newNode.next = curr.next;
                curr.next = newNode;
            }
        }

    }

    //Deletion in linked list
    void deleteFirst(LinkedList l){
        if(l.head==null){
            System.out.println("List is empty");
            return;
        }
        l.head=l.head.next;

    }

    //delete at position
    void deleteAtPosition(LinkedList l, int index){
        if(l.head==null){
            System.out.println("List is empty");
            return;
        }
        if(index==0){
            l.head=l.head.next;
            return;
        }
        Node curr=l.head;
        while(index>1 && curr!=null){
            curr=curr.next;
            index--;
        }
        if(curr==null || curr.next==null){
            System.out.println("Index out of bounds");
        }else{
            curr.next=curr.next.next;
        }
    }

    


}