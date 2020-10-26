package Tree;

public class Binary_Search_Tree {

    static class Node{
        Node left,right;
        int data;

        public Node(int data) {
            this.data = data;
            left = right = null;
        }
    }

    Node root;

    Binary_Search_Tree(){
        root = null;
    }

    Node insert_node(Node node,int item){
        if(node == null){
            node = new Node(item);
            return node;
        }
        if(item<=node.data){
            node.left = insert_node(node.left,item);
        }
        else{
            node.right = insert_node(node.right,item);
        }
        return node;
    }

    void inorder(Node root){
        if(root==null){
            return;
        }
        inorder(root.left);
        System.out.println(root.data);
        inorder(root.right);
    }

    void preorder(Node root){                   // gives the sorted array
        if(root==null){
            return;
        }
        System.out.println(root.data);
        preorder(root.left);
        preorder(root.right);
    }

    void postorder(Node root){
        if(root==null){
            return;
        }
        postorder(root.left);
        postorder(root.right);
        System.out.println(root.data);

    }
    public static void main(String[] args) {
        Binary_Search_Tree bst = new Binary_Search_Tree();
        Node root = new Node(10);
        bst.insert_node(root,12);
        bst.insert_node(root,8);
        bst.insert_node(root,18);
        bst.insert_node(root,3);
        bst.insert_node(root,1);
        bst.insert_node(root,9);
        bst.insert_node(root,14);

        bst.preorder(root);

    }
}
