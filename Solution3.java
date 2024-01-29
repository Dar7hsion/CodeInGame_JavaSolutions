package practice;
import java.util.*;
import java.io.*;
import java.math.*;

/**
Bus problem, including your self, who is left, n is stops
n
on off
on off
 **/
class Solution3 {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int nbPeople = 1;
        for (int i = 0; i < n; i++) {
            int getIn = in.nextInt();
            int getOff = in.nextInt();
            nbPeople = nbPeople + getIn -getOff;
        }

        // Write an answer using System.out.println()
        // To debug: System.err.println("Debug messages...");

        System.out.println(nbPeople);
    }
}
