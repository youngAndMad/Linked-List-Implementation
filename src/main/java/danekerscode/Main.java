package danekerscode;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Main {
    static Scanner in = new Scanner(System.in);
    static DoublyLinkedList linkedList = new DoublyLinkedList();
    public static void main(String[] args) throws InterruptedException {
        info();
        Thread.sleep(1000);
        while (true){
            System.err.println("enter command number for manipulation");
            int n = in.nextInt();
            switch (n){
                case 1 -> addFirst();
                case 2 -> addLast();
                case 3 -> pollFirst();
                case 4 -> pollLast();
                case 5 -> size();
                case 6 -> println();
                case 7 -> check();
                case 8 -> {
                    System.out.println("exit");
                }
                default -> {
                    System.out.println("invalid command");
                }
            }
        }
    }
    private static void info(){
        System.out.println("1 -> add first");
        System.out.println("2 -> add last");
        System.out.println("3 -> poll first");
        System.out.println("4 -> poll last");
        System.out.println("5 -> check list size");
        System.out.println("6 -> print all");
        System.out.println("7 -> check isEmpty?");
        System.out.println("8 -> exit();");
    }

    public static void addFirst(){
        System.out.println("enter num:");
        int n = in.nextInt();
        linkedList.addFirst(n);
    }

    public static void addLast(){
        System.out.println("enter num:");
        int n = in.nextInt();
        linkedList.addLast(n);
    }

    public static int pollFirst(){
        return linkedList.pollFirst();
    }

    public static int pollLast(){
       return linkedList.pollLast();
    }

    public static void println(){
        linkedList.println();
    }

    public static int size(){
        System.out.println("size:" + linkedList.size());
        return linkedList.size();
    }

    public static void check(){
        System.out.println(linkedList.isEmpty() ? Boolean.TRUE : Boolean.FALSE);
    }

}