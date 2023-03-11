public class Q4 {
    public static void main(String[] args) {
    doulayLinkedList<Integer>list1=new doulayLinkedList<>();
       doulayLinkedList<Integer>list2=new doulayLinkedList<>();
        list1.addFirst(1);
        list1.addlast(2);
        list1.addlast(3);
        list1.addlast(4);

        System.out.print("list1: ");
        list1.print();
        list2.addFirst(5);
        list2.addlast(6);
        list2.addlast(7);
        list2.addlast(8);
        list2.addlast(9);
        System.out.print("list2: ");
        list2.print();
        System.out.print("after margin list: ");
        list1=list1.margin(list1,list2);
        list1.print();

    }
}
