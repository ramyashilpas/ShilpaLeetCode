package shilpa.leetcode;
 
public class IntersectionOfTwoLinkedLists {

   static class Node {
        int val;
        Node next;
        Node(int x) {
            val = x;
            next = null;
        }
    }
    public static Node getIntersectionNode(Node headA, Node headB) {
      while(headB!=null){
          Node temp=headA;
          while(temp!=null){
              // if both Nodes are same
              if(temp==headB){
                  return headB;
              }
              temp=temp.next;
          }
          headB=headB.next;
      }
        // If intersection is not present between the lists,
        // return NULL.
     return null;
    }

    public static void main(String[] args) {

       //listA = [4,1,8,4,5], listB = [5,6,1,8,4,5]
        Node headA,headB;
        headA=new Node(4);
        headB=new Node(5);

        Node newNode=new Node(1);
        headA.next=newNode;

        newNode=new Node(6);
        headB.next=newNode;

        newNode=new Node(1);
        headB.next.next=newNode;

        newNode=new Node(8);
        headA.next.next=newNode;
        headB.next.next.next=newNode;

        newNode=new Node(4);
        headA.next.next.next=newNode;
        headB.next.next.next.next=newNode;

        newNode=new Node(5);
        headA.next.next.next.next=newNode;
        headB.next.next.next.next.next=newNode;

        headA.next.next.next.next.next=null;
        headB.next.next.next.next.next.next=null;
       Node intersectionPoint=IntersectionOfTwoLinkedLists.getIntersectionNode(headA,headB);
       if(intersectionPoint==null){
           System.out.println("No intersection Point");
       }
       else{
           System.out.println("IntersectionPoint: "+intersectionPoint.val);
       }
    }
}
