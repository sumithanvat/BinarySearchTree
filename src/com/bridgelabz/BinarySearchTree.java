package com.bridgelabz;

public class BinarySearchTree<K extends Comparable<K>> {
    private INode<K> root;

    // Constructor
    public BinarySearchTree() {
        this.root = null;
    }

    // Method to add a node to the binary search tree
    public void add(K key) {
        this.root = addRecursively(root, key);
    }

    // Recursive helper method to add a node to the binary search tree
    private INode<K> addRecursively(INode<K> current, K key) {
        if (current == null) {
            return new MyBinaryNode<>(key);
        }
        if (key.compareTo(current.getKey()) < 0) {
            current.setLeft(addRecursively(current.getLeft(), key));
        } else if (key.compareTo(current.getKey()) > 0) {
            current.setRight(addRecursively(current.getRight(), key));
        }
        return current;
    }

    // Method to print the nodes of the binary search tree in order
    public void printInOrder() {
        printInOrderRecursively(root);
    }

    // Recursive helper method to print the nodes of the binary search tree in order
    private void printInOrderRecursively(INode<K> current) {
        if (current == null) {
            return;
        }
        printInOrderRecursively(current.getLeft());
        System.out.print(current.getKey() + " ");
        printInOrderRecursively(current.getRight());
    }

}
