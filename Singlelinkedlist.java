class Node {
    int data;   //0
    Node next; //null
    Node(int data){
        this.data=data;
        this.next=null;
    }
}
class LinkedList{
    Node head;
    Node tail;
    public void insert(int data){
        Node n= new Node(data);
        n.next=null;
        if(head==null)//it is the first node
        {
            head=n;
            tail=n;
        }
        else{
            tail.next=n;
            tail=n;
            }
        }
    
    public void display(){
        Node temp=head;
        while(temp!=null){
            System.out.println(temp.data);
            temp=temp.next;
        }
    }

}
public class Singlelinkedlist {
    public static void main(String[] args) {
        LinkedList l= new LinkedList();
        l.insert(10);
        l.insert(20);
        l.insert(30);
        l.insert(40);
        l.display();
    }
    
}
