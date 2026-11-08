package week5_BST;

public class Main {

    public static void main(String[] args) {
        BST t = new BST();

        int[] vals = {50, 30, 70, 20, 40, 60, 80};

        for (int i = 0; i < vals.length; i++) {
            t.insert(vals[i]);
        }
        
        System.out.print("Inorder after insertion: ");
        t.inOrderPrint();

        if (t.search(t.root, 40)) {
            System.out.println("Search 40: Found");
        } else {
            System.out.println("Search 40: Not Found");
        }

        if (t.search(t.root, 100)) {
            System.out.println("Search 100: Found");
        } else {
            System.out.println("Search 100: Not Found");
        }

        t.deleteKey(20);
        System.out.print("After deleting 20: ");
        t.inOrderPrint();

        t.deleteKey(30);
        System.out.print("After deleting 30: ");
        t.inOrderPrint();

        t.deleteKey(50);
        System.out.print("After deleting 50: ");
        t.inOrderPrint();
        
    }
}
