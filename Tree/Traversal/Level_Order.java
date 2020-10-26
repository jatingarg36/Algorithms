package Tree.Traversal;

import java.util.LinkedList;
import java.util.Queue;

public class Level_Order {
    static class Node{
        Node left,right;
        int data;

        Node(int data) {
            this.data = data;
            left = right = null;
        }
    }
    public static void main(String[] args) {
        Node root = new Node(10);
        root.left = new Node(20);
        root.right = new Node(30);
        root.left.left = new Node(40);
        root.left.right = new Node(50);
        root.right.left = new Node(60);
        root.right.right = new Node(70);
        root.left.left.left = new Node(80);
        root.left.left.right= new Node(90);

        level_order_traversal(root);
    }

    private static void level_order_traversal(Node root) {
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        Node curr;
        while(!queue.isEmpty()){
            curr = queue.remove();
            System.out.println(curr.data);
            if(curr.left!=null){
                queue.add(curr.left);
            }
            else{
                System.out.println("N");
            }
            if(curr.right!=null) {
                queue.add(curr.right);
            }
            else{
                System.out.println("N");
            }
        }
    }
}
