package Assignments;

public class P07 {
    public static void main(String[] args) {
        RBTree rbTree = new RBTree();
        rbTree.put(1);
        rbTree.put(2);
        rbTree.put(3);
        rbTree.put(4);
        rbTree.put(5);
        rbTree.put(6);
        rbTree.put(7);
        rbTree.put(8);
        rbTree.put(9);
        rbTree.put(10);
    }
}

class RBTree {
    private Node root;
    private static final boolean RED = true;
    private static final boolean BLACK = false;

    private class Node {
        int key;
        Node left, right;
        boolean color;

        Node(int key) {
            this.key = key;
            this.color = RED;
        }
    }

    private boolean isRed(Node x) {
        if (x == null) return false;
        return x.color == RED;
    }

    private Node rotateLeft(Node h) {
        Node x = h.right;
        h.right = x.left;
        x.left = h;
        x.color = h.color;
        h.color = RED;
        return x;
    }

    private Node rotateRight(Node h) {
        Node x = h.left;
        h.left = x.right;
        x.right = h;
        x.color = h.color;
        h.color = RED;
        return x;
    }

    private void flipColors(Node h) {
        h.color = RED;
        h.left.color = BLACK;
        h.right.color = BLACK;
    }

    public void put(int key) {
        root = put(root, key);
        root.color = BLACK;
    }

    private Node put(Node h, int key) {
        if (h == null) return new Node(key);
        if (key < h.key) h.left = put(h.left, key);
        else if (key > h.key) h.right = put(h.right, key);
        else h.key = key;

        if (isRed(h.right) && !isRed(h.left)) h = rotateLeft(h);
        if (isRed(h.left) && isRed(h.left.left)) h = rotateRight(h);
        if (isRed(h.left) && isRed(h.right)) flipColors(h);

        return h;
    }
}

