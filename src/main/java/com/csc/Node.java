package com.csc;

class Node<T> {
  private T link;
  private Node<T> nextNode;
  
  public Node(T link) {
    this.link = link;
    nextNode = null;
  }
  
  public Node(T link, Node<T> previousNode) {
    this.link = link;
    previousNode.nextNode = this;
    nextNode = null;
  }
  
  // returns the length of the singly linked list (from this node).
  // recursion might not work well for large linked lists.
  public int length() {
    Node<T> cur_node = this;
    int length = 0;
    while(cur_node != null) {
      cur_node = cur_node.next();
      length++;
    }
    
    return length;
  }
  
  public int size() {
    return length();
  }
  
  // gets a T from a certain index.
  public T get(int index) {
    Node<T> cur_node = this;
    while(cur_node != null && index > 0) {
      cur_node = cur_node.next();
      index -= 1;
    }
    
    return cur_node.data();
  }
  
  public T data() {
    return link;
  }
  
  public Node<T> next() {
    return nextNode;
  }
};