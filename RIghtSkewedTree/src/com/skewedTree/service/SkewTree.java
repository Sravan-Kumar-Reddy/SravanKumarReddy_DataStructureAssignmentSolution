package com.skewedTree.service;

import java.util.*;

import com.skewedTree.model.*;

public class SkewTree {
	Inorder inorder = new Inorder();
	public void buildRightTree(Node root) {
		Node currentRoot = null;
		Node tempRoot = null;
		Queue<Integer> inorderNodeQueue = Inorder.getInorder(root);
		
//		System.out.println("Inorder for Tree :"+inorderNodeQueue);
		currentRoot = new Node(inorderNodeQueue.remove());
//		System.out.println("Current Root :"+currentRoot.data);
		while(!inorderNodeQueue.isEmpty()){
			tempRoot = currentRoot;
			currentRoot = new Node(inorderNodeQueue.remove());
			tempRoot.right = currentRoot;

		}
	}
}
