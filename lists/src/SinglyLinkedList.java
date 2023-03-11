import java.util.List;

public class SinglyLinkedList <E>{
    private Node<E> head=null;
    private Node<E> tail=null;
    int numofelements=0;

    public int getNumofelements() {
        return numofelements;
    }

    public void setAfterhead(E value) {
         head.getNext().setElement(value);
    }
    public E GetAfterhead() {
        return head.next.element;
    }

    public boolean isempty() {
        return numofelements==0;
    }
    public E first(){
        if(isempty())
            return null;
        else
            return head.element;
    }
    public E last(){
        if (isempty())
            return null;
        else
            return tail.getElement();
    }

    public void addFirst(E e){
        head=new Node<E>(e,head);
        if(isempty())
            tail=head;
        numofelements++;
    }

    public void addlast(E e) {
        Node<E> newn=new Node<E> (e,null);
        if(isempty())
            head=newn;
        else
            tail.setNext(newn);
        tail=newn;
        numofelements++;
    }
    public void concattenaight( SinglyLinkedList<E> m){
        tail.next=m.head;
        m.head=head;
        tail=m.tail;
        numofelements+=m.numofelements;
        m.numofelements=numofelements;

    }
    //reversing
    /*public E reverse(){
        Node<E>current=head.next;
        Node<E>prev=head;
        Node<E>n;
        if(current.next==null)
        {
            current.setNext(prev);
            return current.element;
        }
        else{
            n=reverse(current.next,current);

        }
    }*/
/*
    public void concattenaight(SinglyLinkedList<E> l ,SinglyLinkedList<E> m){
        l.tail.next=m.head;
        m.head=l.head;
        l.tail=m.tail;
        l.numofelements+=m.numofelements;
        m.numofelements=l.numofelements;

    }*/

    public  Object reverse(List<E>l){
        Node<E>previous=null;
        Node<E>current=head;
        Node<E>following=head;
        while(current!= null)
        {
            following=following.next;
            current.next=previous;
            previous=current;
            current=following;
        }

        return l;
    }




    public int size(){
        Node<E>tmp;
        int size=0;
        tmp=head;
        if(tmp==null)
            return 0;
        else {
            size++;
            while(tmp.next!=null){
                size++;
                tmp=tmp.next;
            }
            return size;}

    }
    public E removefirst(){
        Node<E> felement= head;
        head=head.getNext();
        numofelements--;
        if(numofelements==0)
            tail=null;
        return felement.element;
    }
    public void rotate(){
        tail.next=head;
        head=head.next;
        tail=tail.next;
        tail.next=null;

    }
    public E second_to_last(){
        Node<E>secondTolast=null;
        Node<E>current=head;
        while(current != null){
            if (current.next==null)
            {
                break;
            }
            secondTolast=current;
            current=current.next;
        }
        return secondTolast.element;

    }

    private static class Node<E>{
        private   E element;
        private    Node<E> next;

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




