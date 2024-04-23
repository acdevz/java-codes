package Assignments;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class P09b {
    public static void main(String[] args) {
        String message = "ABRACADABRA";
        HuffmanCoding huffmanCoding = new HuffmanCoding();
        for (char c : message.toCharArray()) {
            huffmanCoding.freqMap.put(c, huffmanCoding.freqMap.getOrDefault(c, 0) + 1);
        }
        HuffmanNode root = huffmanCoding.buildHuffmanTree(huffmanCoding.freqMap);
        huffmanCoding.printHuffmanCodes(root, "");
    }
}

class HuffmanNode{
    int data;
    char c;
    HuffmanNode left;
    HuffmanNode right;

    HuffmanNode(char c, int data) {
        this.c = c;
        this.data = data;
    }
}

class HuffmanCoding {
    Map<Character, Integer> freqMap = new HashMap<>();

    class MinHeapComparator implements Comparator<HuffmanNode> {
        public int compare(HuffmanNode x, HuffmanNode y){
            return x.data - y.data;
        }
    }

    HuffmanNode buildHuffmanTree(Map<Character, Integer> freqMap) {
        PriorityQueue<HuffmanNode> minHeap = new PriorityQueue<>(new MinHeapComparator());

        for (Map.Entry<Character, Integer> entry : freqMap.entrySet()) {
            minHeap.add(new HuffmanNode(entry.getKey(), entry.getValue()));
        }

        while (minHeap.size() > 1) {
            HuffmanNode left = minHeap.poll();
            HuffmanNode right = minHeap.poll();

            HuffmanNode newNode = new HuffmanNode('$', left.data + right.data);
            newNode.left = left;
            newNode.right = right;

            minHeap.add(newNode);
        }

        return minHeap.poll();
    }

    void printHuffmanCodes(HuffmanNode root, String code) {
        if (root == null)
            return;

        if (root.c != '$') {
            System.out.println(root.c + ": " + code);
        }

        printHuffmanCodes(root.left, code + "0");
        printHuffmanCodes(root.right, code + "1");
    }
}


