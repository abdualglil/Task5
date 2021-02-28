public class SinglyLinklist<E>{
    private Node<E> head=null;
    private Node<E> tail=null;
    private int size=0;

    public SinglyLinklist() {
    }

    public boolean isEmpty(){
        return size==0;
    }

    public int Size() {
        return size;
    }
    public E frist(){
        if (isEmpty()) return null;
        else return head.getElement();
    }
    public E last(){
        if (isEmpty()) return null;
        else return tail.getElement();
    }
    public void addfrist(E element){
        head=new Node<>(element,head);
        if (size==0)tail=head;
        size++;
    }
    public void addliast(E elemnt){
        Node<E> newst=new Node<>(elemnt,null);
        if (size==0) head=newst;
        else tail.setNext(newst);
        tail=newst;
        size++;
    }
    public E removfrist(){
        if (isEmpty())return null;
        E delet=head.getElement();
        head=head.getNext();
        size--;
        if (size==0) tail=null;
        return delet;
    }
    public String print(){
        Node<E> i=head;
        String all="";
        while (i!=null){
            all=all+i.getElement().toString()+"\n";
            i=i.getNext();
        }
        return all;
    }
    public E uSershScand(){    // A question R-3.6
        E element=null;
        Node<E> i=head;

        while (i.getNext()!=null){
            element=i.getElement();

            i=i.getNext();
        }
        return element;



    }
    public int siz2(){
        int siz2=0;          // A question R-3.9
        Node<E> i=head;
        while (i.getNext()!=null){
            siz2++;
            i=i.getNext();
        }
        if (siz2>0)siz2++;
        return siz2;
    }

public void rotat(){
        tail.setNext(head);
        head=head.getNext();
        tail=tail.getNext();
        tail.setNext(null);
}
public  SinglyLinklist<E> Merge(SinglyLinklist<E> a,SinglyLinklist<E> b){
        SinglyLinklist<E> newes=new SinglyLinklist<>();
            Node<E>i=a.head;
            while (i!=null){
            newes.addfrist(i.getElement());
            i=i.getNext();
            }
        Node<E>ib=b.head;
        while (ib!=null){
            newes.addliast(i.getElement());
            ib=ib.getNext();
        }

    return newes;

}

public void finding(){
    Node<E> i=head;
    Node<E>i2=head.getNext();
    String all="";
    while (i2.getNext()!=null){

        i=i.getNext();
        i2=i.getNext();
    }
    System.out.println(i.getElement());

}


    static private class Node<E>{
      private E element;
       private Node<E> next;

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