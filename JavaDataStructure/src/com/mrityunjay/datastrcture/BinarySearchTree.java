package com.mrityunjay.datastrcture;
/**
 * Inserting/Building a BST
   Finding maximum value node in BST
   Finding minimum value node in BST
   Inorder Traversal of BST
   Preorder Traversal of BST
   Postorder Traversal of BST
 * Reference : http://javabeat.net/binary-search-tree-traversal-java/
 * */

class Node{
	int key;
	Node left,right;
	Node(int key){
		left=right=null;
		this.key=key;
	}
}

public class BinarySearchTree {

	static Node root;
	BinarySearchTree(int key){
		new Node(key);

	}
	BinarySearchTree(){
		root=null;
	}

	public static void main(String[] args) {
		int i=2;
		while(i<8)
		{
			insertnode(i+3);
			i++;
		}
		printInorder();
		System.out.println("Preorder is :");
		printPreOrder();
		System.out.println("\nPostOrder is ");
		printPostOrder();
		System.out.println("\nMin - Max Val");
		System.out.println(findMinimum(root));
		System.out.println(findMaximum(root));
		System.out.println(searchRecord(root,11).key);
	}
	
	public static Node searchRecord(Node currentNode,int item){
		if(currentNode==null || (item==currentNode.key)){
			return currentNode;
		}
		else if(item>currentNode.key){
			return searchRecord(currentNode.right, item);
		}
			return searchRecord(currentNode.left, item);
		
	}
	public static void insertnode(int nodeVal){
		Node node= new Node(nodeVal);
		if(root==null){
			root=node;
			return;
		}
		insertRec(root,node);
	}
	private static void insertRec(Node latestNode, Node node) {
		if(latestNode.key > node.key){
			if(latestNode.left==null){
				latestNode.left=node;
				return;	
			}else{
				insertRec(latestNode.left,node);
			}

		}else{
			if(latestNode.right==null){
				latestNode.right=node;
				return;	
			}else{
				insertRec(latestNode.right,node);
			}

		}
	}


	/**
	 * Printing the contents of the tree in an inorder way.
	 */
	public static void printInorder(){
		printInOrderRec(root);
		System.out.println("");
	}

	/**
	 * Helper method to recursively print the contents in an inorder way
	 */
	private static void printInOrderRec(Node currRoot){
		if ( currRoot == null ){
			return;
		}
		printInOrderRec(currRoot.left);
		System.out.print(currRoot.key+", ");
		printInOrderRec(currRoot.right);
	}

	private static void printPostOrder(){
		printPostOrderRec(root);
		System.out.print("");
	}

	private static void printPostOrderRec(Node currRoot){
		if(currRoot==null){
			return;
		}
		printPostOrderRec(currRoot.left);
		printPostOrderRec(currRoot.right);
		System.out.print(currRoot.key+",");

	}

	private static void printPreOrder(){
		printPreOrderRec(root);
		System.out.print("");
	}

	private static void printPreOrderRec(Node currRoot){
		if(currRoot==null){
			return;
		}
		System.out.print(currRoot.key+",");
		printPostOrderRec(currRoot.left);
		printPostOrderRec(currRoot.right);


	}
	private static int findMinimum(Node cuurentNode){
		if(cuurentNode==null){
			return 0;
		}
		while(cuurentNode.left !=null){
			cuurentNode=cuurentNode.left;
		}
		return cuurentNode.key;

	}

	private static int findMaximum(Node cuurentNode){
		if(cuurentNode==null){
			return 0;
		}
		while(cuurentNode.right!=null){
			cuurentNode=cuurentNode.right;
		}
		return cuurentNode.key;
	}
}
