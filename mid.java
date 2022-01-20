import java.util.*;
import java.io.*;

public class mid {

    public static class Node {
        int data;
        Node next;
    }

    public static class LinkedList{
        Node head;
        Node tail;
        int size;

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
            System.out.println("the linked list is:");
            while(temp!=null){
                System.out.println(temp.data);
                temp=temp.next;
            }

        }
        public int mid(){
            Node slow=head;
            Node fast=head;
            while(fast.next!=null  && fast.next.next!=null){
                slow=slow.next;
                fast=fast.next.next;
            }
            return slow.data;
        }
    }

    public static void main(String[] args){
        LinkedList list=new LinkedList();

        list.addFirst(10);
        list.addFirst(20);
        list.addFirst(30);
        list.addFirst(40);
        list.addFirst(50);
        list.addFirst(60);
        // list.addFirst(70);
        list.display(list.head);
        System.out.println("middle element of linked list is:");
        System.out.println(list.mid());
    }
}
