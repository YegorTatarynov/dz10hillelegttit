package dz10hillel;

public class Main {
    public static void main(String[] args) {

        MyLinkedList<Integer> myLinkedList = new MyLinkedList<Integer>();
        myLinkedList.add(0);
        myLinkedList.add(1);
        myLinkedList.add(2);
        myLinkedList.add(3);

        System.out.println(myLinkedList);

        myLinkedList.add(0, 5);
        System.out.println(myLinkedList);
    }
}
