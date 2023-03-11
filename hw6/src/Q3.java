public class Q3 {
    public static void main(String[] args) {
     doulayLinkedList<Integer>list1=new doulayLinkedList<>();
       doulayLinkedList<Integer>list2=new doulayLinkedList<>();
        doulayLinkedList<Integer>list3=new doulayLinkedList<>();
        list1.addFirst(11);
        list1.addlast(12);


        list2.addFirst(11);
        list2.addlast(12);

        if (list1.equals(list2))
            System.out.println("list1  and list2 are equals" );
        else
            System.out.println("list1  and list2 are not equals" );

    }
}
