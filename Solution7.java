package practice;

import java.util.*;
import java.io.*;
import java.math.*;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/
class Solution7 {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        String sentence = in.nextLine();

        String[] arr = sentence.split(" ");
        StringBuilder result = new StringBuilder();
        for(int i = arr.length-1; i>=0; i--){
            if(result.length()==0){
               result.append(arr[i]); 
            }
            else{
                result.append(" ");
                result.append(arr[i]); 
            }
        }

        // Write an answer using System.out.println()
        // To debug: System.err.println("Debug messages...");

        System.out.println(result);
    }
}

//import java.util.*;
//import java.io.*;
//import java.math.*;

///**
// * Auto-generated code below aims at helping you parse
// * the standard input according to the problem statement.
// **/
//class Solution {
//
//    public static void main(String args[]) {
//        Scanner in = new Scanner(System.in);
//        String sentence = in.nextLine();
//        String[] arr=sentence.split(" ");
//        for(int i=arr.length-1; i>=0;i--)
//        {
//            System.out.print(arr[i]);
//            if(i!=0)
//            System.out.print(" ");
//        }
//        // Write an answer using System.out.println()
//        // To debug: System.err.println("Debug messages...");
//
//        
//    }
//}