package com.mrityunjay.datastrcture.tree;

import javax.swing.tree.TreeNode;
import java.util.Scanner;

/**
 * Created by Mrityunjay on 21-02-2017.
 */
class Node{
    int value;
    Node left;
    Node right;
    public Node(int value){
        this.value=value;
        left=right=null;

    }
}

public class BinaryTreeFromArray
{

    public static void main(String g[]){
        Scanner sc = new Scanner(System.in);
        String[] input = sc.nextLine().split(",");
        arrayToTree(input);
    }

    public static Node arrayToTree(String[] input){
        Node root =  createNode(input,1);
        printTree(root);
        return root;
    }

    public static Node createNode(String[] input,int index){
        if(index<=input.length){
            Integer value = Integer.parseInt(input[index -1 ]);
           if(value!=null) {
               Node node = new Node(value);
               node.left = createNode(input, 2 * index);
               node.right = createNode(input, index * 2 + 1);
               return node;
           }
        }
        return null;

    }

    public static void printTree(Node node){
        if(node!=null){
            System.out.print(node.value+", ");
            if(node.left!=null){
                printTree(node.left);
            }
            if(node.right!=null){
                printTree(node.right);
            }

        }else{
            System.out.print("-");
        }

    }
}
