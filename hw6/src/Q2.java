public class Q2 {
    public static void main(String[] args) {
     doulayLinkedList<Integer>list=new doulayLinkedList<>();

        list.addFirst(1);
        list.addlast(2);
        list.addlast(3);
        list.addlast(4);
        list.addlast(5);

        System.out.println("size : "+list.methodSize(list));
        System.out.println("Size by method: "+list.size());

    }
}
