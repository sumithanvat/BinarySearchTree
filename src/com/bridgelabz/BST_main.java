package com.bridgelabz;

public class BST_main {
    public static void main(String[] args) {
        BinaryTree<Integer> bt = new BinaryTree<>();
        bt.add(56);
        bt.add(30);
        bt.add(22);
        bt.add(11);
        bt.add(3);
        bt.add(16);
        bt.add(40);
        bt.add(70);
        bt.add(60);
        bt.add(95);
        bt.add(65);
        bt.add(63);
        bt.add(67);
        bt.printInOrder();
    }

}
