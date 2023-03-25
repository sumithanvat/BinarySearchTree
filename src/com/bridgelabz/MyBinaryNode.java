package com.bridgelabz;

public class MyBinaryNode<K extends Comparable<K>> implements INode<K>{
    private K key;
    private INode<K> left;
    private INode<K> right;

    // Constructor
    public MyBinaryNode(K key) {
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

    public INode<K> getLeft() {
        return left;
    }

    public void setLeft(INode<K> left) {
        this.left = left;
    }

    public INode<K> getRight() {
        return right;
    }

    public void setRight(INode<K> right) {
        this.right = right;
    }
}
