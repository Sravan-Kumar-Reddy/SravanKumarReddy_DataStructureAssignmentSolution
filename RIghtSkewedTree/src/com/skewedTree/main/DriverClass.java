package com.skewedTree.main;

import java.util.*;
 
import com.skewedTree.service.*;
import com.skewedTree.model.*;

public class DriverClass {
	public static void main(String[] args) {
		Node tree = new Node(50);
		tree.left = new Node(30);
		tree.right = new Node(60);
		tree.left.left = new Node(10);
		tree.right.left = new Node(55);

		SkewTree skewedTree = new SkewTree();
		skewedTree.buildRightTree(tree);
		
		Queue<Integer> inorderNodeList = new LinkedList<Integer>();
		try {
			inorderNodeList = Inorder.getInorder(tree);
		} catch (Exception e) {
			e.printStackTrace();
		}
//		System.out.println("Inorder for New Tree :"+inorderNodeList);
		System.out.println(inorderNodeList);

	}
}
