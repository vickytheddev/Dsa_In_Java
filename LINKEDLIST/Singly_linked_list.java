public class Singly_linked_list{

    Node head;

    private int size;
    Singly_linked_list(){
        this.size=0;
    }

    class Node{
        String data;
        Node next;
        Node(String data){
            this.data=data;
            this.next=null;
            size++;
        }
    }

    //add first
    public void addFirst(String data){
        Node newNode = new Node(data);
        if(head == null){
            head=newNode;
            return;
        }
        newNode.next=head;
        head=newNode;
    }

    //add last
    public void addLast(String data){
        Node newNode = new Node(data);
        if(head==null){
            head=newNode;
            return; 
        }
        Node currNode = head;
        while(currNode.next!=null){
            currNode=currNode.next;
        }
        currNode.next=newNode;
    }

    //print list
    public void printList() {
        Node currNode = head;
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }

        while (currNode != null) {
            System.out.print(currNode.data + " -> ");
            currNode = currNode.next;
        }

        System.out.println("NULL");
    }

    //deleteFirst
    public void deleteFirst(){
        if(head==null){
            System.out.println("Linked list is empty.");
            return;
        }
        size--;
        head = head.next;
    }

    //deleteLast
    public void deleteLast(){
        if(head==null){
            System.out.println("Linked list is empty.");
            return;
        }
        size--;
        if(head.next==null){ //single node 
            head=null;
            return;
        } 
        Node secondLast = head;
        Node lasteNode = head.next;
        while(lasteNode.next!=null){
            lasteNode=lasteNode.next;
            secondLast=secondLast.next;
        }
        secondLast.next=null;
    }
    
    //size
    public int getSize(){
        return size;
    }
    public static void main(String[] args){
        Singly_linked_list list = new Singly_linked_list();
        list.addFirst("E");
        list.addFirst("B");
        list.addLast("C");
        list.addLast("D");
        list.addFirst("A");
        list.deleteFirst();
        list.deleteLast();
        list.printList();
        System.out.println("linked list size is: "+list.getSize());
    }
}