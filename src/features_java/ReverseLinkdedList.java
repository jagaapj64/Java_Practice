/*
 * package PracticeTask;
 * 
 * import org.w3c.dom.Node;
 * 
 * public class ReverseLinkdedList {
 * 
 * public static ListNode reverseList(ListNode head) { ListNode prev = null;
 * ListNode current = head;
 * 
 * 
 * while(current != null) { ListNode next = current.next; current.next = prev;
 * prev = current; current = next; } return prev; } static void push(int data) {
 * Node temp = new Node(data); temp.next = head; head = temp; }
 * 
 * public static void main(String[] args) { int[] head = [1,2,3,4,5];
 * reverseList(head);
 * 
 * }
 * 
 * }
 */