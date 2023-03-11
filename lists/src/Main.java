import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        SinglyLinkedList<Integer> list1 = new SinglyLinkedList<Integer>();
        SinglyLinkedList<Integer> list2 = new SinglyLinkedList<Integer>();
        list1.addlast(1);
        list1.addlast(2);
        list1.addlast(3);
        list1.addlast(4);
        list1.addlast(5);
        list2.addlast(6);
        list2.addlast(7);
        list2.addlast(8);
        list2.addlast(9);
        list2.addlast(10);
        list1.reverse((List<Integer>) list1);




    }
}
