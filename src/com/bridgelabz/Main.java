package com.bridgelabz;

public class Main {
    // Main method
    public static void main(String[] args) {
        BinarySearchTree<Integer> bst = new BinarySearchTree<>();
        bst.add(56);
        bst.add(30);
        bst.add(70);
        bst.printInOrder();
    }
}

interface INode<K extends Comparable<K>> {
    K getKey();
    void setKey(K key);
    INode<K> getLeft();
    void setLeft(INode<K> left);
    INode<K> getRight();
    void setRight(INode<K> right);
}

