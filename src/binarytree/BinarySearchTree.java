package binarytree;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

/*
In BST, left node is smaller than root, and right node is larger than root
 */
public class BinarySearchTree {

    static class Node {
        int data;
        Node left, right;
        Node(Node left, Node right,int data) {
            this.left = left;
            this.right=right;
            this.data = data;
        }
    }

    public static boolean search (Node node, int data) {
        if(node == null) return false;
        if(node.data == data ) return true;
        return (node.data < data) ? search(node.right, data) : search(node.left, data);
    }


    public static void insert(Node node, int data) {
        if(null == node) {
            node = new Node(null, null, data);
        }
        Map<Integer, Integer> m = new HashMap();
        m.entrySet().stream()
                .map(x->x.getValue())
                .max(Comparator.naturalOrder()).get();
    }



    public static void main(String[] args) {

    }
}
