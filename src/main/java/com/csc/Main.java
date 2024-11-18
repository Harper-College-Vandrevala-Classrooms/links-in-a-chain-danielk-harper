package com.csc;

import java.lang.*;

public class Main {
  public static void main(String[] args) {
    ChainLink linkOne = new ChainLink("red");
    Node nodeOne = new Node(linkOne);

    ChainLink linkTwo = new ChainLink("blue");
    Node nodeTwo = new Node(linkTwo, nodeOne);

    ChainLink linkThree = new ChainLink("green");
    Node nodeThree = new Node(linkThree, nodeTwo);
    
    Node cur_node = nodeOne;
    
    while (cur_node != null) {
      System.out.println(cur_node.data().color);
      cur_node = cur_node.next();
    }
    
    
  }
}