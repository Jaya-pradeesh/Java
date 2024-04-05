import java.util.HashSet;
import java.util.Scanner;

public class SinglyLinkedList{
    private static ListNode head;
    private static class ListNode{
        private int data;
        private ListNode next;

        public ListNode(int data){
            this.data=data;
            this.next=null;
        }
    }

    public  ListNode Find_Nth_Node_FromEnd(int n) {
        if(head == null){
            return null;
        }
        if(n<=0){
            throw new IllegalArgumentException("Invalid "+n);
        }
        ListNode mainPointer = head;
        ListNode ReferencePointer = head;
        int count = 0;
        while(count<n){
            ReferencePointer = ReferencePointer.next;
            count++;
        }
        while(ReferencePointer!=null){
            ReferencePointer = ReferencePointer.next;
            mainPointer = mainPointer.next;
        }
        return mainPointer;


    }

    public void ViewList(){
        ListNode current = head;

        System.out.print("Linkded list : ");

        while(current!=null){
            System.out.print(current.data + "--> ");
            current = current.next;

        }
        System.out.print("null");

        System.out.println();

    }
    public void insert(int data){
        ListNode newList = new ListNode(data);
        if(head == null){
            head = newList;
        }else {
            ListNode current = head;
            while(current.next!=null){
                current = current.next;
            }
            current.next=newList;
        }

    }
    public int length(){
        int length = 0;
        ListNode current = head;
        while(current!=null){
            length++;
            current = current.next;
        }
        return length;

    }


    public ListNode deleteFirstNode(){
        if(head==null){
            return null;
        }
        ListNode temp = head;
        head = head.next;
        temp.next=null;

        return temp;
    }
    public static boolean search(int search){
        ListNode current = head;
        while (current != null){
            if(current.data == search){
                return true;
            }
            current = current.next;
        }
        return false;

    }
    public  ListNode reverse(){
        if (head == null) {
            return null;
        }
        ListNode current=head;

        ListNode previous=null;
        ListNode next=null;
        while(current!=null){
            next=current.next;
            current.next=previous;
            previous=current;
            current=next;

        }
        return previous;
    }
    public void removeDuplicate(){
        ListNode current = head;
        while(current!=null&&current.next!=null){
            if(current.data==current.next.data){
                current.next=current.next.next;
            }else {
                current =current.next;
            }
        }


    }
    public void removeDuplicates(){
        ListNode current = head;
        ListNode previous = null;
        HashSet<Integer> set = new HashSet<>();
        if(head == null){
            return;
        }
        while(current!=null){
            if(set.contains(current.data)){
                previous.next=current.next;
            }
            else {
                set.add(current.data);
                previous=current;
            }
            current=current.next;

        }

    }




    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        SinglyLinkedList sl = new SinglyLinkedList();
        SinglyLinkedList fl = new SinglyLinkedList();
        SinglyLinkedList removeDuplicates = new SinglyLinkedList();
        //sl------------------------------------------------------------------------------------------
        sl.head = new ListNode(10);
        ListNode second = new ListNode(20);
        ListNode third = new ListNode(30);
        ListNode fourth = new ListNode(40);
        ListNode fifth = new ListNode(50);

        //now link all the list as a chain
        sl.head.next=second;
        second.next=third;
        third.next=fourth;
        fourth.next=fifth;
        sl.ViewList();
        //fl------------------------------------------------------------------------------------------

        fl.head = new ListNode(10);
        ListNode two = new ListNode(10);
        ListNode three = new ListNode(30);
        ListNode four = new ListNode(30);
        ListNode five = new ListNode(50);

        //now link all the list as a chain
        fl.head.next=two;
        two.next=three;
        three.next=four;
        four.next=fifth;

        //removeDuplicates----------------------------------------------------------------------------------------
        removeDuplicates.head = new ListNode(10);
        ListNode rdsecond = new ListNode(20);
        ListNode rdthird = new ListNode(30);
        ListNode rdfourth = new ListNode(10);
        ListNode rdfifth = new ListNode(30);

        //now link all the list as a chain
        removeDuplicates.head.next=rdsecond;
        rdsecond.next=rdthird;
        rdthird.next=rdfourth;
        rdfourth.next=rdfifth;
        //-------------------------------------------------------------------------------------------
        fl.ViewList();
        fl.removeDuplicates();
        fl.ViewList();
        removeDuplicates.removeDuplicates();
        removeDuplicates.ViewList();
//        System.out.print("Enter number to check LIST : ");
//        int src = sc.nextInt();
//        if(search(src) == true){
//            System.out.println("TRUE");
//
//        }else {
//            System.out.println("FLASE");
//
//        }
//        head =sl.reverse();
//
//        sl.ViewList();

//        ListNode findN = sl.Find_Nth_Node_FromEnd(1);
//        System.out.println("The Node : "+findN.data);










//        sl.deleteFirstNode();


//        int listLength=sl.length();
//        System.out.println("Length of the list : "+ listLength);
    }
}