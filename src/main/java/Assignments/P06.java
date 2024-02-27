package Assignments;

public class P06 {
    /* Binomial Heap */
    public static void main(String[] args) {
        BinomialHeap heap = new BinomialHeap();
        heap.insert(50);
        heap.insert(60);
        heap.insert(70);
        heap.insert(80);
        heap.insert(90);
        heap.insert(100);
        heap.insert(110);
        heap.insert(120);
        heap.insert(10);
        heap.insert(20);
        heap.insert(30);
        heap.insert(40);

        System.out.println(heap.extractMin());
    }
}

class BinomialHeap {
    private Node head;

    public BinomialHeap() {
        head = null;
    }

    public void insert(int key) {
        BinomialHeap temp = new BinomialHeap();
        temp.head = new Node(key);
        head = union(head, temp.head);
    }

    public int extractMin() {
        if (head == null) {
            return -1;
        }

        Node min = head;
        Node prevMin = null;
        Node next = min.sibling;
        Node prev = min;

        while (next != null) {
            if (next.key < min.key) {
                min = next;
                prevMin = prev;
            }
            prev = next;
            next = next.sibling;
        }

        if (prevMin == null) {
            head = min.sibling;
        } else {
            prevMin.sibling = min.sibling;
        }

        BinomialHeap temp = new BinomialHeap();
        temp.head = reverse(min.child);
        head = union(head, temp.head);

        return min.key;
    }

    public void decreaseKey(int oldKey, int newKey) {
        Node node = search(head, oldKey);
        if (node == null) {
            return;
        }

        node.key = newKey;
        Node parent = node.parent;
        while (parent != null && node.key < parent.key) {
            int temp = node.key;
            node.key = parent.key;
            parent.key = temp;

            node = parent;
            parent = node.parent;
        }
    }

    public void delete(int key) {
        decreaseKey(key, Integer.MIN_VALUE);
        extractMin();
    }

    private Node search(Node node, int key) {
        if (node == null) {
            return null;
        }

        if (node.key == key) {
            return node;
        }

        Node found = search(node.child, key);
        if (found != null) {
            return found;
        }

        return search(node.sibling, key);
    }

    private Node reverse(Node node) {
        if (node == null || node.sibling == null) {
            return node;
        }

        Node newHead = reverse(node.sibling);
        node.sibling.sibling = node;
        node.sibling = null;

        return newHead;
    }

    private Node union(Node h1, Node h2) {
        if (h1 == null) {
            return h2;
        }

        if (h2 == null) {
            return h1;
        }

        Node head;
        Node tail;
        Node next1 = h1;
        Node next2 = h2;

        if (h1.degree <= h2.degree) {
            head = h1;
            next1 = next1.sibling;
        } else {
            head = h2;
            next2 = next2.sibling;
        }

        tail = head;

        while (next1 != null && next2 != null) {
            if (next1.degree <= next2.degree) {
                tail.sibling = next1;
                next1 = next1.sibling;
            } else {
                tail.sibling = next2;
                next2 = next2.sibling;
            }
            tail = tail.sibling;
        }

        if (next1 != null) {
            tail.sibling = next1;
        } else {
            tail.sibling = next2;
        }

        Node prev = null;
        Node curr = head;
        Node next = head.sibling;

        while (next != null) {
            if (curr.degree != next.degree || (next.sibling != null && next.sibling.degree == curr.degree)) {
                prev = curr;
                curr = next;
            } else {
                if (curr.key <= next.key) {
                    curr.sibling = next.sibling;
                    link(next, curr);
                } else {
                    if (prev == null) {
                        head = next;
                    } else {
                        prev.sibling = next;
                    }
                    link(curr, next);
                    curr = next;
                }
            }
            next = curr.sibling;
        }

        return head;
    }

    private void link(Node child, Node parent) {
        child.parent = parent;
        child.sibling = parent.child;
        parent.child = child;
        parent.degree++;
    }

    private class Node {
        private int key;
        private int degree;
        private Node parent;
        private Node child;
        private Node sibling;

        public Node(int key) {
            this.key = key;
            degree = 0;
            parent = null;
            child = null;
            sibling = null;
        }
    }
}
