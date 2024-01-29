package practice;

import java.util.*;
import java.io.*;
import java.math.*;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 *  12
	hey hi!
 * is 'hi'
 * 
 **/
class Solution6 {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        String key = in.nextLine();
        String message = in.nextLine();
        StringBuilder result = new StringBuilder();
        String[] krr = key.split("");
        String[] arr = message.split(" ");
        for(int i = 0; i <key.length(); i++){
            String[] urr = arr[i].split("");
            int index = (Integer.parseInt(krr[i])-1<0) ? 0 : Integer.parseInt(krr[i])-1;
            result.append(urr[index]);
        }

        // Write an answer using System.out.println()
        // To debug: System.err.println("Debug messages...");

        System.out.println(result);
    }
}
