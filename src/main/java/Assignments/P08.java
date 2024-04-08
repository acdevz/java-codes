package Assignments;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class P08 {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(10);
        root.left = new TreeNode(30);
        root.right = new TreeNode(15);
        root.left.left = new TreeNode(20);
        root.left.right = new TreeNode(5);
        inorderTraversal(root);

        TreeNode newRoot = BinaryTreeToBST.convertToBST(root);
        System.out.println("Inorder Traversal of the new BST:");
        inorderTraversal(newRoot);
    }

    public static void inorderTraversal(TreeNode root) {
        if (root != null) {
            inorderTraversal(root.left);
            System.out.print(root.data + " ");
            inorderTraversal(root.right);
        }
    }
}

class TreeNode {
    int data;
    TreeNode left;
    TreeNode right;

    TreeNode(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}

class BinaryTreeToBST {
    private static List<Integer> nodeList = new ArrayList<>();

    public static TreeNode convertToBST(TreeNode root) {
        // Store nodes in the list
        storeNodes(root, nodeList);

        // Sort the list
        Collections.sort(nodeList);

        // Rebuild the BST from the sorted list
        return rebuildBST(nodeList, 0, nodeList.size() - 1);  // complexity: O(n)
    }

    private static void storeNodes(TreeNode node, List<Integer> nodeList) {
        if (node != null) {
            storeNodes(node.left, nodeList);
            nodeList.add(node.data);
            storeNodes(node.right, nodeList);
        }
    }

    private static TreeNode rebuildBST(List<Integer> sortedList, int start, int end) {
        if (start > end) {
            return null;
        }

        int mid = (start + end) / 2;
        TreeNode newNode = new TreeNode(sortedList.get(mid));
        newNode.left = rebuildBST(sortedList, start, mid - 1);
        newNode.right = rebuildBST(sortedList, mid + 1, end);

        return newNode;
    }
}
