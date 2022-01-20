import java.util.*;
import java.io.*;

public class remove {

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

        public void removefirst(){
            Node temp=head;
            temp=temp.next;
            head.next=null;
            head=temp;
            size--;
        }


        public void removelast(){
            Node temp=head;
            while(temp.next.next!=null){
                temp=temp.next;
            }
            temp.next=null;
            tail=temp;
            size--;
        }

        public Node getNodeAt(int idx){
            Node temp=head;
            int ci=0;

            while(temp!=null  && ci<idx){
                temp=temp.next;
                ci++;
            }
            return temp;
        }

        public void removeIndex(int idx){
            if(idx<0 || idx>size){
                System.out.println("invalid arguments");
            }
            else if(idx==0){
                removefirst();
            }
            else if(idx==size){
                removelast();
            }
            else{
                Node prev=getNodeAt(idx-1);
                Node tbr=prev.next; //tbr =to be removed
                prev.next=tbr.next;
                tbr.next=null;
            }
            size--;
            
            
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
        list.removeIndex(3);
        list.display(list.head);
        // list.removefirst();
        // list.display(list.head);
        // list.removelast();
        // list.display(list.head);
    }
}
