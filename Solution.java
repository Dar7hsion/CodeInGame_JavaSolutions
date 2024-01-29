package practice;
import java.util.*;
import java.io.*;
import java.math.*;

///upper case letters, input AAAbbb, output AAA
		class Solution {

		    public static void main(String[] args) {
		        Scanner in = new Scanner(System.in);
		        String s = in.nextLine();
		        char[] arr = s.toCharArray();
		        StringBuilder result = new StringBuilder();
		        for(int i=0; i<arr.length; i++){
		            if(Character.isUpperCase((char)arr[i])){
		                result.append(arr[i]);

		            }
		        }
		        if(result.length() ==0){
		            System.out.println("none");
		        }
		        else {
		        	System.out.println(result);
		        }
		    }
	}


