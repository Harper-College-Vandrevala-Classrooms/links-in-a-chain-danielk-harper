package com.csc;

import java.lang.*;

public class Main {
  public static void main(String[] args) {
    ChainLink linkOne = new ChainLink("red");
    Node<ChainLink> nodeOne = new Node<ChainLink>(linkOne);

    ChainLink linkTwo = new ChainLink("blue");
    Node<ChainLink> nodeTwo = new Node<ChainLink>(linkTwo, nodeOne);

    ChainLink linkThree = new ChainLink("green");
    Node<ChainLink> nodeThree = new Node<ChainLink>(linkThree, nodeTwo);
    
    Node<ChainLink> cur_node = nodeOne;
    
    while (cur_node != null) {
      System.out.println(cur_node.data().color);
      cur_node = cur_node.next();
    }
    
    
  }
}