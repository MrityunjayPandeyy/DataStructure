/**
 * 
 */
package com.mrityunjay.stack;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author mpandey
 * {@link} http://www.java2blog.com/2016/09/data-structure-and-algorithm-interview-questions-in-java.html#Question_1_Implement_a_stack_using_array
 *
 */
public class StackUsingArray {
	int size;
	int[] arr;
	int topIndex;
	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int len =  sc.nextInt();
		StackUsingArray st = new StackUsingArray(len);
		while(sc.hasNext()){
			if(!st.push(sc.nextInt())){
				break;
			}
			System.out.println("Cuurent Stack : "+Arrays.toString(st.arr));
		}
		//POP the elements
		System.out.println(st.pop());
		System.out.println("Cuurent Stack : "+Arrays.toString(st.arr));


	}

	public StackUsingArray(int size){
		this.size=size;
		this.arr= new int[size];
		this.topIndex = -1;

	}

	public boolean push(int item){
		//Check for overflow 
		if(!isFull()){
			topIndex=topIndex+1;
			this.arr[topIndex] = item;
			return true;
		}else{
			System.out.println("-- StackOverflow --");
			return false;
		}

	}
	public int pop(){
		if(!isEmpty()){
			int popItemindex = topIndex;
			topIndex = topIndex -1;
			return this.arr[popItemindex];
		}else{
			System.out.println("Stack is Empty "+Arrays.toString(this.arr));
			return 0;
		}
	}


	//Support Methods
	public boolean isFull(){
		return (size-1 == topIndex);
	}
	public boolean isEmpty(){
		return (topIndex == -1);
	}

	public int peak(){
		return this.arr[topIndex];
	}


}
