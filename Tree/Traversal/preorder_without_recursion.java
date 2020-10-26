package Tree.Traversal;

import java.util.Stack;

public class preorder_without_recursion {
    static class Node{
        Node left,right;
        int data;

        Node(int data) {
            this.data = data;
            left = right = null;
        }
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        root.left.left.left = new Node(8);
        root.left.left.right= new Node(9);

        iterative_preorder(root);
    }

    private static void iterative_preorder(Node root) {
        Stack<Node> st = new Stack<>();
        st.push(root);
        Node curr;
        while(!st.empty()){
            curr = st.pop();
            System.out.println(curr.data);
            if(curr.right!=null)
                st.push(curr.right);
            if(curr.left!=null){
                st.push(curr.left);
            }
        }

    }
}
