package com.bridgelabz;

public class BinaryNode<K>{
    private K key;
    private BinaryNode<K> left;
    private BinaryNode<K> right;

    // Constructor
    public BinaryNode(K key) {
        this.key = key;
        this.left = null;
        this.right = null;
    }

    // Getter and setter methods
    public K getKey() {
        return key;
    }

    public void setKey(K key) {
        this.key = key;
    }

    public BinaryNode<K> getLeft() {
        return left;
    }

    public void setLeft(BinaryNode<K> left) {
        this.left = left;
    }

    public BinaryNode<K> getRight() {
        return right;
    }

    public void setRight(BinaryNode<K> right) {
        this.right = right;
    }
}

