package com.bridgelabz;

public class BinaryTree<K>{
    private BinaryNode<K> root;

    // Constructor
    public BinaryTree() {
        this.root = null;
    }

    // Method to add a node to the binary tree
    public void add(K key) {
        BinaryNode<K> newNode = new BinaryNode<>(key);
        if (root == null) {
            root = newNode;
        } else {
            addRecursively(root, newNode);
        }
    }

    // Recursive helper method to add a node to the binary tree
    private void addRecursively(BinaryNode<K> current, BinaryNode<K> newNode) {
        if (current.getLeft() == null) {
            current.setLeft(newNode);
        } else if (current.getRight() == null) {
            current.setRight(newNode);
        } else {
            addRecursively(current.getLeft(), newNode);
        }
    }

    // Method to print the nodes of the binary tree in order
    public void printInOrder() {
        printInOrderRecursively(root);
    }

    // Recursive helper method to print the nodes of the binary tree in order
    private void printInOrderRecursively(BinaryNode<K> current) {
        if (current == null) {
            return;
        }
        printInOrderRecursively(current.getLeft());
        System.out.print(current.getKey() + " ");
        printInOrderRecursively(current.getRight());
    }

}
