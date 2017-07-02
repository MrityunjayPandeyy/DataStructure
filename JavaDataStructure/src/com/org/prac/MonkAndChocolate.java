package com.org.prac;

/* IMPORTANT: Multiple classes and nested static classes are supported */

/*
 * uncomment this if you want to read input.
//imports for BufferedReader
import java.io.BufferedReader;
import java.io.InputStreamReader;

//import for Scanner and other utility classes*/
import java.util.*;


class MonkAndChocolate {
    public static void main(String args[] ) throws Exception {
    	Scanner sc = new Scanner(System.in);

    	String testCase= sc.nextLine();
    	for(int k= 0;k<Integer.parseInt(testCase);k++){
    		String input = sc.nextLine();
    		int length =Integer.parseInt(input.split(" ")[0]);
    		int move = Integer.parseInt(input.split(" ")[1]);;
    		int count=1;		
    		String inputString = sc.nextLine();
    		char arr[] = inputString.toCharArray();
    		for(int i=0; i<move;i++){
    			for(int s=1;s<length;i++){
    				if(arr[s-1]==(arr[s])){
    					continue;

    				}else{
    					arr[s]=arr[s-1];
    					break;
    				}
    			}
    		}
    		for(int s=0;s<inputString.length()-1;s++){
    			if(arr[s]==(arr[s+1])){
    				count++;
    			}else{
    				break;
    			}
    		}
    		System.out.println(count);
    	}


    }
    
}
