package com.mrityunjay.Basic;

import java.util.Scanner;

/**
 * Created by Mrityunjay on 18-02-2017.
 *
 * Given an input string, reverse the string word by word. A word is defined as a sequence of non-space characters.
 */
public class ReverseString {
    public static void main(String g[]){

        Scanner sc=new Scanner(System.in);
        rotateWordApproach1(sc.nextLine());
      //  rotateArray(input,k);

    }

    static void rotateWordApproach1(String sentence){
        if(sentence==null)
        {
            return;
        }
      String[] wordArray =  sentence.split(" ");

        for(int i=0;i<wordArray.length/2;i++){
            String temp;
            temp=wordArray[i];
            wordArray[i]=wordArray[wordArray.length-1-i];
            wordArray[wordArray.length-1-i]=temp;
        }
        for(int i=0;i<wordArray.length;i++){
            System.out.print(wordArray[i]);
        }
    }

    void rotateWordApproach2(String sentence){

    }
}
