// import java.util.*;
// import java.io.*;

public class merge2sorted{

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

        public static LinkedList mergelists(LinkedList l1 , LinkedList l2){
            LinkedList merge=new LinkedList();
            Node one=l1.head;
            Node two=l2.head;
            while(one!=null && two!=null){
                if(one.data > two.data){
                    merge.addlast(two.data);
                    two=two.next;
                }
                else{
                    merge.addlast(one.data);
                    one=one.next;
                }
            }
            while(one!=null){
                merge.addlast(one.data);
                one=one.next;
            }
            while(two!=null){
                merge.addlast(two.data);
                two=two.next;
            }
            return merge;
        }

    }

    public static void main(String[] args){
        LinkedList list1=new LinkedList();
        LinkedList list2 =new LinkedList();
        //first list
        list1.addlast(10);
        list1.addlast(20);
        list1.addlast(30);
        list1.addlast(40);
        list1.display(list1.head);

        //second list
        list2.addlast(5);
        list2.addlast(9);
        list2.addlast(13);
        list2.addlast(17);
        list2.addlast(21);
        list2.addlast(25);
        list2.display(list2.head);

        LinkedList merged=LinkedList.mergelists(list1 , list2);
        merged.display(merged.head);

        

    }

}
