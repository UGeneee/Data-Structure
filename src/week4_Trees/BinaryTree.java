package week4_Trees;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

class BinaryTree {

    Node root;

    public void inOrder(Node n, List<Integer> out) {
        if (n == null) {
            return;
        }

        inOrder(n.left, out);
        out.add(n.data);
        inOrder(n.right, out);
    }

    public void preOrder(Node n, List<Integer> out) {
        if (n == null) {
            return;
        }

        out.add(n.data);
        preOrder(n.left, out);
        preOrder(n.right, out);
    }

    public void postOrder(Node n, List<Integer> out) {
        if (n == null) {
            return;
        }

        postOrder(n.left, out);
        postOrder(n.right, out);
        out.add(n.data);
    }

    public List<Integer> levelOrder(Node n) {
        List<Integer> out = new ArrayList<>();

        if (n == null) {
            return out;
        }

        Queue<Node> q = new ArrayDeque<>();
        q.add(n);

        while (!q.isEmpty()) {
            {
                Node cur = q.remove();
                out.add(cur.data);
                if (cur.left != null) {
                    q.add(cur.left);
                }
                if (cur.right != null) {
                    q.add(cur.right);
                }
            }
        }
        return out;
    }
}
