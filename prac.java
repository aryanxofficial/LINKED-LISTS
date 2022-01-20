// import java.util.*;
//there is nothing like structure in java

public class prac {

    public static class Node{
        int data;
        Node next;
    }
    public static class LinkedList{
        Node head;
        Node tail;
        int size;

        public void addLast(int val){
            Node nn=new Node();
            nn.data=val;
            if(size==0){
                head=tail=nn;
            }
            else{
                tail.next=nn;
                tail=nn;
            }
            size++;
        }
        public void addFirst(int val){
            Node nn=new Node();
            nn.data=val;
            if(size==0){
                head=tail=nn;
            }
            else{
                nn.next=head;
                head=nn;
            }
            size++;
        }
        public void display(Node head){
            Node temp=head;
            while(temp!=null){
                System.out.print(temp.data+"->");
                temp=temp.next;
            }
        }
    }
    
    public static void main(String[] args){

        LinkedList list=new LinkedList();

        list.addFirst(10);
        list.addFirst(20);
        list.addFirst(30);
        list.addFirst(40);
        list.addFirst(50);
        list.addLast(60);
        list.addLast(70);
        list.display(list.head);

    }
}
