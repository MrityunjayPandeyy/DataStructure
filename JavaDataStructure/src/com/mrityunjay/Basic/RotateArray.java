package com.mrityunjay.Basic;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by Mrityunjay on 18-02-2017.
 */
public class RotateArray {

    public static void main(String g[]){

        Scanner sc=new Scanner(System.in);
        int inputArrayLength=sc.nextInt();
        int k=sc.nextInt();
        int[] input = new int[inputArrayLength];
        for(int i=0;i<inputArrayLength;i++){
            input[i] = sc.nextInt();
        }
        rotateArray(input,k);

    }
    //Rotate Array from a givenIndex
    public static void rotateArray(int[] input,int k){
        //if length is greater the rotation
        if(k>input.length){
            k=k%input.length;
        }
        //Create result array
        int[] result= new int[input.length];
        for(int i=0;i<k;i++){
            result[i] = input[input.length-k+i];
        }
        int l=0;
        for(int j=k;j<input.length;j++){
            result[j]=input[l];
            l++;
        }

        for(int i=0;i<input.length;i++){
            System.out.print(input[i]);
        }
        System.out.print(" --> ");
        for(int j=0;j<result.length;j++){
            System.out.print(result[j]);
        }
    }
}
