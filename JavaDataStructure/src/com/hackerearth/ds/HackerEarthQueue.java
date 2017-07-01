/**
 * 
 */
package com.hackerearth.ds;

import java.util.Scanner;

/**
 * @author Mrityunjay
 *
 *
 *You have to perform 
N
N operations on a queue of the following types: 

E
 
x
E x : Enqueue 
x
x in the queue and print the new size of the queue.
D
D : Dequeue from the queue and print the element that is deleted and the new size of the queue separated by a space. If there is no element in the queue, then print 
−
1
−1 in place of the deleted element.
Write a program to print the new size of the queue after these operations are performed on the queue.

Input

First line: 
N
N
Next 
N
N lines: One of the above operations
Output

Enqueue operation: Print the new size of the queue
Dequeue operation: Print two integers, the deleted element and the new size of the queue. If the queue is empty, print 
−
1
−1.

Constraints:

1
≤
N
≤
100
1≤N≤100
 1
≤
x
≤
100

SAMPLE INPUT 
5
E 2
D
D
E 3
D

SAMPLE OUTPUT 
1
2 0
-1 0
1
3 0
 */
public class HackerEarthQueue {

	/**
	 * @param args
	 */
	static int[] queue;
	static int front=0;
	static int rear=0;
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int num_of_input = sc.nextInt();
		queue = new int[num_of_input];
		for(int i=0;i<=num_of_input;i++){
			String input = sc.nextLine();
			if(input.equalsIgnoreCase("")){
				continue;
			}
			if(input.equals("D")){
				deque();
			}else{
				enque(Integer.parseInt(input.split(" ")[1]));

			}
		}

	}

	public static void enque(int item){
		if(isFull()){
			System.out.println("Queue is already full");

		}else{
			queue[rear]=item;
			rear = rear +1;
			System.out.println((rear - front));
		}

	}
	public static void deque(){
		if(isEmpty()){
			System.out.println("-1" + " " +(rear - front));	

		}else{
			int temp = queue[front];
			front = front +1;
			System.out.println(temp + " " +(rear - front));	
		}


	}
	private static boolean isFull() {
		if((front == rear) && front >=queue.length){
			return true;
		}
		return false;
	}

	private static boolean isEmpty() {
		if((front == rear)){
			return true;
		}
		return false;
	}
}
