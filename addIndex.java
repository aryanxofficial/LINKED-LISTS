import java.util.*;
import java.io.*;

public class addIndex {

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

        public void addindex(int val,int idx){
            Node nn=new Node();
            nn.data=val;
            if(idx<0 || idx>size){
                System.out.println("invalid index");
            }
            else if(idx==0){
                addfirst(val);

            }
            else if(idx==size){
                addlast(val);
            }
            else{
                Node temp=head;
                for(int i=1;i<idx;i++){
                    temp=temp.next;
                }
                Node fwd=temp.next;
                temp.next=nn;
                nn.next=fwd;
            }
            size++;
        }

        public int getNodeAt(int idx){
            Node temp=head;
            int ci=0;
            while(temp!=null && ci<idx){
                 temp=temp.next;
                 ci++;
            }

            return temp.data;
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
        list.addindex(100 ,2);
        System.out.println(list.getNodeAt(2));
        // System.out.println(list.size);
        
        list.display(list.head);
    }
}
