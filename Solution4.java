package practice;
import java.util.*;
import java.io.*;
import java.math.*;

/**
n is number of colors, how many to be sure to get a match, 
each color has 2 socks to 2*n, but we only need half that 
so (n*2)/2 or just n, having one more with make 
sure we have a match
**/
class Solution4 {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        // Write an answer using System.out.println()
        int total = ((n*2)/2)+1;
        // To debug: System.err.println("Debug messages...");

        System.out.println(total);
    }
}
