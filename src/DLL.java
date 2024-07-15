//
//class Node {
//    int val;
//    Node next;
//    Node prev;
//    Node(int val){
//        this.val = val;
//    }
//}
//
//public class DLL {
//
//    public static void main(String[] args) {
//
//        Node head = new Node(1);
//
//        head.next = new Node(2);
//        head.next.next = new Node(2);
//        head.next.prev = head;
//        head.next.next.next = new Node(4);
//        head.next.next.prev = head.next;
//
////        System.out.println(head.val);
//        Node root = reverseDLL(head);
//        System.out.println("root :: " + root.val);
//        while(root!=null) {
//            System.out.println("in root"+root.val);
//            root=root.next;
//        }
//
//    }
//    public static Node reverseDLL(Node head)
//    {
//        if(head == null)
//            return null;
//
//        Node prev = head;
//        Node cur = head.next;
//        while(cur!=null){
//
//            Node nex = cur.next;
//            if(prev.val == cur.val){
//                cur.prev = null;
//                while(cur!=null && cur.val==prev.val){
//                    cur = cur.next;
//
//                }
//                prev.next = cur;
//                if(cur!=null)
//                    cur.prev = cur;
//            }
//            prev=cur;
//            if(cur!=null)
//                cur=cur.next;
//        }
//
//        return head;
//    }
//}
//
