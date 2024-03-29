public class circularlyLinkedList<E> {

    private Node<E>tail=null;
    private  int size=0;

    public circularlyLinkedList() {

    }
    public int methodSize(circularlyLinkedList<E> list){
        Node<E>i=tail.next;
        int s=0;
        while (i!=null){
            s++;
            i=i.next;
           if( tail.next==i)
            break;
        }return  s;
    }
    public boolean  equals(circularlyLinkedList<E> L,circularlyLinkedList<E> M){
        boolean f=false;
        Node<E>m=M.tail.next;
        Node<E>l=L.tail.next;
        if (L.size()==M.size()){
            while (m!=null&&l!=null){
                if (m.element==l.element)
                    f=true;
                else {
                    f=false;
                    return  f;}
                m=m.next;
                l=l.next;
                if( m==M.tail.next&&l==L.tail.next)
                    break;
            }}

        return  f;
    }
    public boolean  sameSequence(circularlyLinkedList<E> L,circularlyLinkedList<E> M){
        boolean f=false;
        Node<E>m=M.tail.next;
        Node<E>l=L.tail.next;
        if (L.size()==M.size()){
//
            ///////////////////////////////////////////////////
            for (int i = 1; i <=M.size ; i++) {

                if (m.element== l.element) {

                    break;

                }
                else {
                    m = m.next;
                    if (i == M.size )
                        return f;
                }


            }///////////////////////////////
            while (m!=null&&l!=null){
                if (m.element==l.element)
                    f=true;
                else {
                    f=false;
                    return  f;}
                m=m.next;
                l=l.next;
                if(l==L.tail.next)
                    break;
            }
        }

        return  f;
    }
    public circularlyLinkedList<E> split(circularlyLinkedList<E>l){
        circularlyLinkedList<E>l2=new circularlyLinkedList<>();
        if (l.size%2==0){
            for (int i=0;i<=l.size/2;i++){
             l2.addLast(  l.removeFirst());
            }
    }return l2;}
    public circularlyLinkedList<E> clone(circularlyLinkedList<E>l){
        circularlyLinkedList<E>l1=new circularlyLinkedList<>();
        Node<E> i=l.tail.next;
        while (i!=l.tail){

           l1.addLast(i.element);
           i=i.next;
        }   l1.addLast(i.element);
        return l1;}

    public  boolean isEmpty(){
        return  size==0;
    }
    public  int size()
    {return size;}
    public E first()
    {
        if( isEmpty())return  null;
        return tail.next.getElement();
    }
    public E last()
    {
        if( isEmpty())return  null;
        return  tail.element;
    }
//    public void addFirst(E newElment)
//    {if (size==0)
//    {   tail=new Node<E>(newElment,null);
//        tail.setNext(tail);}
//        else {
//            Node<E>newest=new Node<>(newElment,tail.next);
//            tail.setNext(newest);
//    }
//
//        size++;
//
//    }
    public void addFirst(E newElment)
    {if (size==0)
    {   tail=new Node<E>(newElment,null);
        tail.setNext(tail);}
    else {
       tail.next=new Node<>(newElment,tail.next);
        tail.setNext(tail.next);
    }

        size++;

    }
   public  void addLast(E newelement){
        addFirst(newelement);
      tail=tail.next;
   }
    public E removeFirst(){
        if (isEmpty())return  null;
       Node<E>x=tail.next;
       if ((x==tail))
           tail=null;
       else
           tail.next=x.next;
       size--;
       return  x.element;

//        E del=tail.next.element;
//         tail.next=tail.next.next;
//        size--;
//        if (size==0)
//            tail=null;
//        return  del;


    }
    public void rotate(){
        if(tail!=null){
            tail=tail.next;
        }
    }
    public String tostring(){
     return (String) removeFirst();
    }

    public void print() {
    }

    private static  class Node<E>{
        E element;
        Node<E>next;

        public Node(E element, Node<E> next) {
            this.element = element;
            this.next = next;
        }

        public E getElement() {
            return element;
        }

        public void setElement(E element) {
            this.element = element;
        }

        public Node<E> getNext() {
            return next;
        }

        public void setNext(Node<E> next) {
            this.next = next;
        }
    }

}
