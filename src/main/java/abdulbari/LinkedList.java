package abdulbari;

public class LinkedList {
    private Node head;
    public void reverseList(){
        Node current = head;
        Node prev = null;
        Node next = null;

        while(current != null){
            next = current.next;
            current.next = prev;
            prev = current;
            current = current.next;
        }
        head = prev;
    }
}
