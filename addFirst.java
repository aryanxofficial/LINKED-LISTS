import java.util.*;
import java.io.*;

public class addFirst {

    public static class Node{
        int data;
        Node next;
    }
    public static class LinkedList{
        Node head;
        Node tail;
        int size;

        public void addfirst(int val){
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
            System.out.println("the linked list is :");
            Node temp=head;
            while(temp!=null){
                System.out.println(temp.data);
                temp=temp.next;
            }
        }

    }

    public static void main(String[] args){
        LinkedList list=new LinkedList();
        list.addfirst(10);
        list.addfirst(20);
        list.addfirst(30);
        list.addfirst(40);
        list.addfirst(50);
        list.addlast(60);
        list.addlast(70);
        list.display(list.head);
    }
}
