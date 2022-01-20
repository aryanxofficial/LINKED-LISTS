import java.util.*;
import java.io.*;

public class kth_node_from_end {

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

        public void display(){
            Node temp=head;
            System.out.println("the linked list is:");
            while(temp!=null){
                System.out.println(temp.data);
                temp=temp.next;
            }
        }

        public int kLast(int idx){
            //in starting make 2 pointers ..ek ko pehle hi k steps aage badha do and then move them with same speed
            Node slow=head;
            Node fast=head;
            if(idx<0 || idx>size){
                System.out.println("invalid value of k");
                return -1;
            }
            else{
                for(int i=0 ; i<idx ; i++){
                    fast=fast.next;
                }
                while(fast.next!=null){
                    slow=slow.next;
                    fast=fast.next;
                }
            }
            return slow.data;
        }
    }

    public static void main(String[] args){
        LinkedList list=new LinkedList();
        list.addLast(10);
        list.addLast(20);
        list.addLast(30);
        list.addLast(40);
        list.addLast(50);
        list.addLast(60);
        list.addLast(70);
        list.display();
        System.out.println("kth node from end is:");
        System.out.println(list.kLast(2));
    }
}
