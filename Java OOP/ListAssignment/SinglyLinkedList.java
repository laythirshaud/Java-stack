public class SinglyLinkedList {
    public Node head;
    public SinglyLinkedList() {
        this.head=null;
    }
    public void remove(){
        Node curr = this.head ;
        while (curr.next.next != null){
            curr=curr.next;
        }
        curr.next=null;

    }
    public void printValues(){
        Node curr = this.head ;
        while (curr != null){
            System.out.println(curr.value);
            curr=curr.next;
        }
    }
    // SLL methods go here. As a starter, we will show you how to add a node to the list.
    public void add(int value) {
        Node newNode = new Node(value);
        if(head == null) {
            head = newNode;
        } else {
            Node runner = head;
            while(runner.next != null) {
                runner = runner.next;
            }
            runner.next = newNode;
        }
    }    
}