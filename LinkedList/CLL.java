// package LinkedList;

// import org.w3c.dom.Node;

// public class CLL {

//     private Node head;
//     private Node tail;

//     public void insert(int val) {
//         Node node = new Node(val);
//         if (head == null) {
//             head = node;
//             tail = node;
//             return;
//         }

//         tail.next = node;
//         node.next = head;
//         tail = node;
//     }

//     public void delete(int val) {
//         Node node = head;
//         if (node == null) {
//             return;
//         }

//         if (head == tail) {
//             head = null;
//             tail = null;
//             return;
//         }

//         if (node.val == val) {
//             head = head.next;
//             tail.next = head;
//             return;
//         }

//         do {
//             Node n = node.next;
//             if (n.val == val) {
//                 node.next = n.next;
//                 break;
//             }
//             node = node.next;
//         } while (node != head);
//     }

//     public void Display() {
//         Node temp = head;
//         if (head != null) {
//             do {
//                 System.out.print(temp.val + " -> ");
//                 temp = temp.next;
//             } while (temp != head);
//         }
//     }

//     private class Node {
//         int val;
//         Node next;

//         public Node(int val) {
//             this.val = val;
//         }
//     }

// }

// //
// class Solution {


//     public int findTheWinner(int n, int k) {
//         CLL list = new CLL();
//         for (int i = 1; i <= n; i++) {
//             list.insert(i);
//         }
//         return find
        
//     }

//     class CLL {

//         private Node head;
//         private Node tail;

//         public void insert(int val) {
//             Node node = new Node(val);
//             if (head == null) {
//                 head = node;
//                 tail = node;
//                 return;
//             }

//             tail.next = node;
//             node.next = head;
//             tail = node;
//         }

//         public int find(int k){
//             Node temp = head;
//             while (temp != null) {
//                 int q = k;
//                 while (k > 2) {
//                     temp = temp.next;
//                 k--;
//             }
//                 delete(temp.next.val);
//                 temp = temp.next;
//             }
//             return head.val;
//         }

//         public void delete(int val) {
//             Node node = head;
//             if (node == null) {
//                 return;
//             }

//             if (head == tail) {
//                 head = null;
//                 tail = null;
//                 return;
//             }

//             if (node.val == val) {
//                 head = head.next;
//                 tail.next = head;
//                 return;
//             }

//             do {
//                 Node n = node.next;
//                 if (n.val == val) {
//                     node.next = n.next;
//                     break;
//                 }
//                 node = node.next;
//             } while (node != head);
//         }

//         private class Node {
//             int val;
//             Node next;

//             public Node(int val) {
//                 this.val = val;
//             }
//         }

//     }
// }
