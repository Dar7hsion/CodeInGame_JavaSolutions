package practice;
import java.util.*;
import java.io.*;
import java.math.*;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 * input C
 * output 0 0 00 0000 0 00
 * 
 * 
 **/
class Solution9 {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        String MESSAGE = in.nextLine();
        StringBuilder binary = new StringBuilder();
        
        char[] crr = MESSAGE.toCharArray();
        
        for(char values :crr){
            String binaryString = String.format("%7s", 
            Integer.toBinaryString(values)).replace(' ', '0');
            binary.append(binaryString);
        }
        
        String[] arr = binary.toString().split("");
        
        String digit = arr[0];
        int num = 1;
        StringBuilder build = new StringBuilder();
        for(int i = 0; i<arr.length; i++){
        	if(i==arr.length-1){
                String result = (digit.equals("1")) ? "0":"00";
                build.append(result +" ");
                for (int j = 0; j<num; j++){
                    build.append("0");
                }
                break;
        	}
            if(digit.equals(arr[i+1])){
                num++;
            }
            else{
                String result = (digit.equals("1")) ? "0":"00";
                build.append(result +" ");
                for (int j = 0; j<num; j++){
                    build.append("0");
                }
                build.append(" ");
                num=1;
                digit = arr[i+1];
            }
        }
        System.out.println(build);
    }
}
