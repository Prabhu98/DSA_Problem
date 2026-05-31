package org.example;

class Node {

    int data;  // store values
    Node next;  // ref pointer to the next node


    Node(int data){
        this.data = data;
        this.next = null;
    }
}

public class LinkedListIImplementation {

    Node head; //first node in the list

    public void inserAtBegining(int data){

        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;

    }

    public void insertAtLastIndex(int data) {
        if (head == null) {
            inserAtBegining(data);
        }

        Node newNode = new Node(data);
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }

    public void insertIndex(int index, int data){
        if( index < 0){
            System.out.println("Invalid Index");
            return;
        }

        Node newNode = new Node(data);
        Node temp = head;

        for(int i=0;i<index-1;i++){
            temp = temp.next;
        }

        newNode.next = temp.next;
        temp.next = newNode;
    }

    public void deleteWithVal(int data){
        Node temp = head;

        if(head.data == data){
            head = head.next;
        }

        while( temp.next!= null && temp.next.data != data){
            temp = temp.next;
        }

        if(temp.next == null){
            System.out.println("Invalid Index");
        }
        temp.next = temp.next.next;


    }

    public void deleteIndex(int index){
        Node temp = head;
        if( index < 0){
            System.out.println("Invalid Index");
            return;
        }

        if(index == 0){
            head = head.next;
            return;
        }
        for(int i=0;i<index-1;i++){
            temp = temp.next;
        }

        temp.next = temp.next.next;


    }

    public void display(){
        Node temp = head;

        while(temp!=null){
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("Null");
    }

    public static void main(String[] args) {
        LinkedListIImplementation l1 = new LinkedListIImplementation();

        l1.inserAtBegining(3);
        l1.inserAtBegining(2);
        l1.inserAtBegining(1);

        l1.deleteIndex(1);

        l1.display();
    }

}
