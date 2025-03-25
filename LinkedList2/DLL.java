package LinkedList2;

public class DLL {

    private Node head;

    public void insertFirst(int val){
        Node node = new Node(val);
        node.next = head;
        node.prev = null;
        if(head != null){
            head.prev = node;
        }
        head = node;
    }

    public void insertLast(int val){
        if(head == null){
            insertFirst(val);
            return;
        }
        Node temp = head;
        while(temp.next != null){
            temp = temp.next;
        }
        Node node = new Node(val, null, temp);
        temp.next = node;
    }

    public void insert(int after, int val){
        Node p = find(after);
        Node node = new Node(val);
        node.next = p.next;
        node.prev = p;
        if(p.next != null){
            p.next.prev = node;
        }
        p.next = node;
    }

    public Node find(int value){
        Node node = head;
        while(node != null){
            if(node.value == value){
                return node;
            }
            node = node.next;
        }
        return null;
    }

    public void display(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.print("END");
    }

    public void displayRev(){
        Node last = head;
        while(last.next != null){
            last = last.next;
        }
        while(last != null){
            System.out.print(last.value + " -> ");
            last = last.prev;
        }
        System.out.print("START");
    }

    private class Node{
        int value;
        Node next;
        Node prev;

        public Node(int val){
            this.value = val;
        }

        public Node(int val, Node next, Node prev){
            this.value = val;
            this.next = next;
            this.prev = prev;
        }
    }
}
