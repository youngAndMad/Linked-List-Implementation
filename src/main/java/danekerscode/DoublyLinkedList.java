package danekerscode;

import java.util.NoSuchElementException;

public class DoublyLinkedList {
    Node head = null;
    Node tail = null;
    private int size = 0;
    class Node{
        int val;
        public Node next;
        public Node prev;

        public Node(int val, Node next, Node prev) {
            this.val = val;
            this.next = next;
            this.prev = prev;
        }
    }

    public void addFirst(int val){
        Node temp = new Node(val , head,null);
        if (head!=null){
            head.prev = temp;
        }
        head = temp;
        if (tail == null){
            tail = temp;
        }
        size++;
        System.out.println("element added:" + val);
    }

    public void addLast(int val){
        Node temp = new Node(val, null , tail);
        if (tail!=null){
            tail.next = temp;
        }
        tail = temp;
        if (head == null){
            head = temp;
        }
        size++;
        System.out.println("element added:" + val);
    }

    public int pollFirst(){
        if (size == 0){
            throw new NoSuchElementException("oops, your list is empty");
        }
        Node temp = head;
        head = head.next;
        head.prev = null;
        size--;
        System.out.println("element deleted:" + temp.val);
        return temp.val;
    }
    public int pollLast(){
        if (size ==0){
            throw new NoSuchElementException("oops, your list is empty");
        }
        Node temp = tail;
        tail = tail.prev;
        tail.next = null;
        size--;
        System.out.println("element deleted:" + temp.val);
        return temp.val;
    }

    public void println(){
        Node temp = head;
        while (temp!=null){
            System.out.print(temp.val + ", ");
            temp = temp.next;
        }
    }


    public boolean isEmpty(){
        return this.size == 0;
    }

    public int size(){
        return this.size;
    }


}
