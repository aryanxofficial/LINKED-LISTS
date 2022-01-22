public class foldLL2 {

    public static class Node{
        int data;
        Node next;
    }
    public static class LinkedList{
        Node head;
        Node tail;
        int size;

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
        public void addAt(int idx , int val){
            if(idx < 0 || idx >size){
                System.out.println("invlaid index");
            }
            else if(idx==0){
                addFirst(val);
            }
            else if(idx==size){
                addlast(val);
            }
            else {
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
        public void display(Node head){
            Node temp=head;
            System.out.println("\nthe linked list is :");
            while(temp!=null){
                System.out.print(temp.data+"->");
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
        public Node midNode(Node head){
            if(head==null || head.next==null){
                return head;
            }
            Node fast=head;
            Node slow=head;
            while(fast.next!=null && fast.next.next!=null){
                slow=slow.next;
                fast=fast.next.next;
            }
            return slow;
        }
        public Node reverse(Node head){
            if(head==null || head.next==null){
                return head;
            }
            Node curr=head;
            Node prev=null;
            
            while(curr!=null){
                Node fwd=curr.next;
                curr.next=prev;
                prev=curr;
                curr=fwd;
            }
            return prev;
        }
        public void foldLL2(){
            if(head==null || head.next==null){
                return;
            }
            Node middlepoint=midNode(head);
            Node nhead=middlepoint.next;
            middlepoint.next=null;

            nhead=reverse(nhead);

            Node c1=head;
            Node c2=nhead;
            while(c2!=null){
                Node f1=c1.next;
                Node f2=c2.next;
                c1.next=c2;
                c2.next=f1;
                c1=f1;
                c2=f2; 
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
        list.display(list.head);
        // System.out.println("\nthe middle node of linked list is:");
        // Node mid=list.midNode(list.head);
        // System.out.println(mid.data);
        // Node nhead=list.reverse(list.head);
        // System.out.println("the reversed list is:");
        // list.display(nhead);
        list.foldLL2();
        list.display(list.head);


    }
}
