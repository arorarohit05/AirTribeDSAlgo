// question related to linked list - never creating it from scratch
// how to create it from scratch

// how do i play around with it
// class definition


// [10 6 7 8 9]

// arr[0] = 10
public class LinkedList {
    // reference to object of type Node
    Node head;


    //
    // head-> Welcome->  Airtribe ->   Hello



    public void insertAtStart(String data){

        // Node creation
        Node newNode = new Node(data);    // newNode -> [Rohit,null]

        //LINKING

        if(head == null) {
            head = newNode;
            return;
        }

        // point airtribe to hello, and point head to airtibe
        newNode.next = head;
        head = newNode;
    }

    // Rohit->Welcome->AirTribe->Hello -> null
    //                            temp

    // Farhan
    public void insertAtLast(String data){
        // Node creation
        Node newNode = new Node(data); // newNode ["Farhan", null]

        if(head == null) {
            head = newNode;
            return;
        }

        // linking

        Node temp = head;
        while(temp.next!=null){
            temp=temp.next;
        }

        temp.next=newNode;
    }


    //Rohit->Welcome->AirTribe->Hello->Farhan->null
    //        temp
    //            Rohit->Welcome-> Mohammad-> AirTribe->Hello->Farhan->null

    ////Rohit->Welcome->Mohammad        AirTribe->Hello->Farhan->null


    // Mohammad -> null
    public void insertAtMiddle(String data, int place){
        // Node creation
        Node newNode = new Node(data); // newNode ["Mohammad", null]


        Node temp = head;
        // Linking
        while(--place > 1 && temp != null){
            temp = temp.next;
        }
        // a++
        // ++a

        if(temp==null){
            System.out.println("Place doesnt exit");
            return;
        }

        newNode.next = temp.next;
        temp.next = newNode;

    }

    public void printIt(){
        // traverse the linked list

        // head

        Node temp = head;

        while(temp!=null){
            System.out.print(temp.data + "->");
            temp = temp.next;
        }

        System.out.println("null");
    }

    //  Welcome->  Airtribe ->   Hello -> null
    //                                    head

    // Welcome -> Airtribe -> Hello ->

    // odd 7 ->4
    // even 8 -> 4

    //head -> Rohit->Welcome->Mohammed->AirTribe->Hello->Farhan->Golu->Molu->null
    //                                   slow
    //                                                           fast
    // 2 pointer appaorach
    // slow fast approacgh
    public void printMiddleNode(){

        // count
        // count/2 --> reach that many

        // can we do it in single traveal

        Node slow = head;
        Node fast = head;
        if(slow == null){
            System.out.println("Empty list");
            return;
        }
              // odd               // even
        while(fast.next!=null && fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }



        System.out.println(slow.data);

    }

    public static void main(String[] args) {
        // CRUD operation in linked list

        LinkedList list  = new LinkedList();
        list.insertAtStart("Hello");  //
        list.insertAtStart("AirTribe");  // Airtribe -> Hello -> null
        list.insertAtStart("Welcome");  // Airtribe -> Hello -> null

        list.printIt();


        list.insertAtStart("Rohit");

        list.printIt();

        list.insertAtLast("Farhan"); // Rohit->Welcome->AirTribe->Hello->Farhan->null
        list.printIt();

        list.insertAtMiddle("Mohammed",3);
        list.printIt();

        list.insertAtMiddle("Golu",7);
        list.printIt();

        list.insertAtMiddle("Molu",8);
        list.printIt();

        list.printMiddleNode();

        // delete first -> head = head.next
        // delete last  -> sl.next = null
        // delete middle -> a-> b -> c
        //                 // a.next = a.next.next
    }
}

// reversr the singly linked list - HW
