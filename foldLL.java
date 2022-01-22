// import java.util.*;
// import java.io.*;

public class foldLL{

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

        public void addAt(int idx, int val) {
            if (idx < 0 || idx > size) {
                System.out.println("Invalid arguments");
            } else if (idx == 0) {
                addfirst(val);
            } else if (idx == size) {
                addlast(val);
            } else {
                Node node = new Node();
                node.data = val;

                Node temp = head;
                for (int i = 0; i < idx - 1; i++) {
                    temp = temp.next;
                }
                node.next = temp.next;

                temp.next = node;
                size++;
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
        
        public void display(Node head){
            System.out.println("the linked list is :");
            Node temp=head;
            while(temp!=null){
                System.out.print(temp.data+" ");
                temp=temp.next;
            }
            System.out.println();
        }

        private void foldHelper(Node right , int count){
            if(right==null){
                return;
            }
            
            foldHelper(right.next , count+1);
            if(count > size/2){
                Node temp=left.next;
                left.next=right;
                right.next=temp;
                left=temp;
            }
            else if(count==size/2){
                tail=right;
                tail.next=null;
            }
        }

        Node left;
        public void fold(){
            left=head;
            foldHelper(head , 0);
            display(head);
        }

    }

    public static void main(String[] args){
        LinkedList list1=new LinkedList();
   
        list1.addlast(10);
        list1.addlast(20);
        list1.addlast(30);
        list1.addlast(40);
        list1.addlast(50);
        list1.addlast(60);
        list1.addlast(70);
        System.out.println("list before filding");
        list1.display(list1.head);   
        System.out.println("list after filding");
        list1.fold();

    }

}
