package week4_Trees;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        BinaryTree t = new BinaryTree();
        
        t.root = new Node(10);
        t.root.left = new Node(5);
        t.root.right = new Node(15);
        t.root.left.left = new Node(2);
        t.root.left.right = new Node(7);
        t.root.right.left = new Node(12);
        
        List<Integer> in = new ArrayList<>();
        List<Integer> pre = new ArrayList<>();
        List<Integer> post = new ArrayList<>();
        
        
        t.inOrder(t.root, in);
        t.preOrder(t.root, pre);
        t.postOrder(t.root, post);
        
        
        System.out.println("Inorder: " + in);
        System.out.println("Preorder: " + pre);
        System.out.println("Postorder: " + post);
        System.out.println("Level order: " + t.levelOrder(t.root));
    }
}
