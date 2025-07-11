public class DoublyLikedList {
    class Node{
        int data;
        Node prev;
        Node next;

        Node(int data){
            this.data = data;
            this.prev = null;
            this.next = null;
        }
    }
    Node head;
    public void insertAtBeginning(int data){
        Node newNode = new Node(data);
        newNode.next = head;
        head.prev = newNode;
        head = newNode;
    }

    public void insertAtEnd(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        Node temp = head;
        while(temp.next != null){
            temp = temp.next;
        }
        temp.next = newNode;
        newNode.prev = temp;
    }

    public void insertAtPosition(int data, int position){
        Node newNode = new Node(data);
        if(position == 0){
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
            return;
        }
        Node temp = head;
        for(int i = 0;i < position-1; i++){
            temp = temp.next;
        }
        if(temp == null){
            System.out.println("Position out of Bound");
            return;
        }
        newNode.next = temp.next;
        temp.next.prev = newNode;
        temp.next = newNode;
        newNode.prev = temp;
    }

    public void deleteNode(int key){
        Node temp = head, prev = null, next = null;
        if(temp != null && temp.data == key){
            head = temp.next;
            return;
        }
        while(temp != null && temp.data != key){
            prev = temp;
            temp = temp.next;
        }
        if(temp == null) return;
        prev.next = temp.next;
        temp.next.prev = prev;
    }

    public boolean search(int key){
        Node temp = head;
        while(temp != null){
            if(temp.data == key){
                return true;
            }
            temp = temp.next;
        }
        return false;
    }

    public void printList(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        DoublyLikedList list = new DoublyLikedList();
        list.insertAtBeginning(1);
        list.insertAtEnd(2);
        list.insertAtEnd(3);
        list.insertAtPosition(4, 2); // Insert 4 at position 2
        list.printList(); // Output: 1 2 4 3
        list.deleteNode(2);
        list.printList(); // Output: 1 4 3
        System.out.println(list.search(3)); // Output: true
    }
}
