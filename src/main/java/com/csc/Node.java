package com.csc;

import com.csc.ChainLink;

class Node {
  private ChainLink link;
  private Node nextNode;
  
  public Node(ChainLink link) {
    this.link = link;
    nextNode = null;
  }
  
  public Node(ChainLink link, Node previousNode) {
    this.link = link;
    previousNode.nextNode = this;
    nextNode = null;
  }
  
  // returns the length of the singly linked list (from this node).
  // recursion might not work well for large linked lists.
  public int length() {
    Node cur_node = this;
    int length = 0;
    while(cur_node != null) {
      cur_node = cur_node.next();
      length++;
    }
    
    return length;
  }
  
  // gets a chainlink from a certain index.
  public ChainLink get(int index) {
    Node cur_node = this;
    while(cur_node != null && index > 0) {
      cur_node = cur_node.next();
      index -= 1;
    }
    
    return cur_node.data();
  }
  
  public ChainLink data() {
    return link;
  }
  
  public Node next() {
    return nextNode;
  }
};