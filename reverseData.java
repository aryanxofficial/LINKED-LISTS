import java.util.*;
import java.io.*;

public class reverseData {

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

        public Node getNodeAt(int idx){
            Node temp=head;
            int ci=0;
            while(temp!=null && ci<idx){
                temp=temp.next;
                ci++;
            }
            return temp;
        }

        public void reverseDataIterative(){
            Node ln=head;
            int li=0;//left index
            int ri=size-1;//right index
            while(li<ri){
                Node rn=getNodeAt(ri);
                int ld=ln.data;
                int rd=rn.data;
                
                //now swapping the data //
                //if i try to swap using a third variable (temp)list reverse nahi hogi
               ln.data=rd;
               rn.data=ld;

                ln=ln.next;
                li++;
                ri--;
            }
        }

    }

    public static void main(String[] args){
        LinkedList list=new LinkedList();
        list.addlast(10);
        list.addlast(20);
        list.addlast(30);
        list.addlast(40);
        list.addlast(50);
        list.addlast(60);
        list.addlast(70);
        list.display(list.head);
        list.reverseDataIterative();
        list.display(list.head);
    }
}
