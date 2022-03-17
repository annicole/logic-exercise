/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interview.BinatyTree;

/**
 *
 * @author ANA.ROSAS
 */
public class BinaryTree {
  // Root of Binary Tree 

  Node root;

  BinaryTree() {
    root = null;
  }

  private Node addRecursive(Node current, int value) {
    if (current == null) {
      return new Node(value);
    }

    if (value < current.value) {
      current.left = addRecursive(current.left, value);
    }
    else if (value > current.value) {
      current.right = addRecursive(current.right, value);
    }
    else {
      return current;
    }
    return current;
  }

  public void add(int value) {
    root = addRecursive(root, value);
  }

  private boolean containsNodeRecursive(Node current, int value) {
    if (current == null) {
      return false;
    }

    if (value == current.value) {
      return true;
    }

    return value < current.value
            ? containsNodeRecursive(current.left, value)
            : containsNodeRecursive(current.right, value);
  }

  public boolean containsNode(int value) {
    return containsNodeRecursive(root, value);
  }

  public Node deleteRecursive(Node current, int value) {
    if (current == null) {
      return null;
    }
    if (value == current.value) {
      //a node has no child
      if (current.left == null && current.right == null) {
        return null;
      }

      //a node has one child
      if (current.right == null) {
        return current.left;
      }
      if (current.left == null) {
        return current.right;
      }

      //a node has two children
      int smallesValue = findSmallestValue(current.right);
      current.value = smallesValue;
      current.right = deleteRecursive(current.right, smallesValue);
      return current;
    }

    if (value < current.value) {
      current.left = deleteRecursive(current.left, value);
      return current;
    }
    current.right = deleteRecursive(current.right, value);
    return current;
  }

  public void delete(int value) {
    root = deleteRecursive(root, value);
  }

  private int findSmallestValue(Node root) {
    return root.left == null ? root.value : findSmallestValue(root.left);
  }

  public void traverseInOrder(Node node) {
    if (node != null) {
      traverseInOrder(node.left);
      System.out.print(" " + node.value);
      traverseInOrder(node.right);
    }
  }

  public void traversePreOrder(Node node) {
    if (node != null) {
      System.out.print(" " + node.value);
      traversePreOrder(node.left);
      traversePreOrder(node.right);
    }

  }

  public static void main(String[] args) {
    BinaryTree bt = new BinaryTree();

    bt.add(6);
    bt.add(4);
    bt.add(8);
    bt.add(3);
    bt.add(5);
    bt.add(7);
    bt.add(9);

    bt.traverseInOrder(bt.root);
    System.out.println("");
    bt.traversePreOrder(bt.root);
    // tree.containsNode(6);
    //tree.delete(6);
  }
}
