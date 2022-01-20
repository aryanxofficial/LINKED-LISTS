import java.util.*;
import java.io.*;

public class addLast{

    public static class Node{
        int data;
        Node next;
    }

    public static class LinkedList{
        //sara kaam jo bhi hoga linked list class ke andar hoga
        
        Node head;
        Node tail;
        int size=0;

       public void addlast(int val){
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

        public void display(Node head){
            System.out.println("the linked list is:");
            Node temp=head;
            while(temp!=null){
                System.out.println(temp.data);
                temp=temp.next;
            }
        }

    }

    public static void main(String[] args) throws Exception{
        
        LinkedList list=new LinkedList();
        list.addlast(10);
        list.addlast(20);
        list.addlast(29);
        list.addlast(30);
        list.addlast(40);
        list.addlast(50);
        list.display(list.head);
    }
}