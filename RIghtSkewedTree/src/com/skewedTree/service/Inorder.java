package com.skewedTree.service;

import java.util.*;

import com.skewedTree.model.*;

public class Inorder {
    static Queue<Integer> inorderNodeQueue = new LinkedList<Integer>();
    public static Queue<Integer> getInorder(Node node)
    {
        if(node.left!=null){
            getInorder(node.left);
        }
        inorderNodeQueue.add(node.data);
        if(node.right!=null){
            getInorder(node.right);
        }
        return inorderNodeQueue;
    }
 
}
