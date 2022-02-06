package com.skewedTree.service;

import java.util.*;

import com.skewedTree.model.*;

public class SkewTree {
	Inorder inorder = new Inorder();
	public void buildRightTree(Node root) {
		Node currentRoot = null;
		Node tempRoot = null;
		Queue<Integer> inorderNodeQueue = Inorder.getInorder(root);

		currentRoot = new Node(inorderNodeQueue.remove());
		while(!inorderNodeQueue.isEmpty()){
			tempRoot = currentRoot;
			currentRoot = new Node(inorderNodeQueue.remove());
			tempRoot.left = currentRoot;
		}
	}
}
