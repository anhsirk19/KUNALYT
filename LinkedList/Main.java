

public class Main {
    public static void main(String[] args) {
        // LL list = new LL();
        // list.insertFirst(1);
        // list.insertFirst(2);
        // list.insertFirst(3);
        // list.insertFirst(4);
        // list.insertFirst(5);
        // list.insertLast(6);
        // list.insertLast(78);
        // list.insert(5, 4);
        // list.Display();
        // System.out.println(list.deleteFirst());
        // list.Display();
        // System.out.println(list.deleteLast());
        // list.Display();
        // System.out.println(list.delete(2));
        // list.Display();
        // list.insertRec(121,3);
        // list.Display();
        // DLL list = new DLL();
        // list.insertFirst(2);
        // list.insertFirst(3);
        // list.insertFirst(4);
        // list.insertFirst(5);
        // list.insertLast(1);
        // list.insertLast(0);
        // // list.Display();
        // list.insert(3, 9);
        // list.Display();

        // CLL list = new CLL();
        // list.insert(23);
        // list.insert(3);
        // list.insert(19);
        // list.insert(75);
        // list.delete(19);
        // list.Display();

        LL first = new LL();
        LL second = new LL();

        first.insertLast(1);
        first.insertLast(2);
        first.insertLast(4);
        first.Display();

        second.insertLast(1);
        second.insertLast(3);
        second.insertLast(4);
        second.Display();

        LL ans = LL.merge(first, second);
        ans.Display();
    }
}
