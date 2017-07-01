package com.mrityunjay.datastructure.stack;

import java.util.Scanner;
import java.util.Stack;

/**
 * Created by Mrityunjay on 18-02-2017.
 */

public class ReversePolishNotation {

    public static void main(String g[]){

        Scanner sc = new Scanner(System.in);
        String input=sc.nextLine();

        System.out.print("Result : "  +reversePolishNotationCalculation(input));

    }

    static int reversePolishNotationCalculation(String input){
        String[] inputArray= input.split(",");
        String operators = "+-*/";
        int result=0;
        Stack<String> stack = new Stack<>();
        for (String in: inputArray) {
            if(!operators.contains(in)){
                stack.push(in);

            }else{
                int a= 0;
                        a=Integer.parseInt(stack.pop());
                int b= 0;
                b=Integer.parseInt(stack.pop());
                //int indexOfOperator= operators.indexOf(in);
                switch (in+""){
                    case "+":
                        stack.push(String.valueOf(a+b));
                        break;
                    case "-":
                        stack.push(String.valueOf(a-b));
                        break;
                        case "*":
                            stack.push(String.valueOf(a*b));
                            break;
                        case "/":
                            stack.push(String.valueOf(a/b));
                            break;
                }
            }

        }
        return result=Integer.parseInt(stack.pop());
    }
}
