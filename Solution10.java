package practice;
import java.util.*;
import java.io.*;
import java.math.*;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/
class Solution10 {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt(); // Number of elements which make up the association table.
        int Q = in.nextInt(); // Number Q of file names to be analyzed.
        String[] fileE = new String[N];
        String[] MIME = new String[N];
        String[] fName = new String[Q];
        
        for (int i = 0; i < N; i++) {
            String EXT = in.next(); // file extension
            String MT = in.next(); // MIME type.
            fileE[i] = EXT;
            MIME[i] = MT;
        }
        
        in.nextLine();
        for (int i = 0; i < Q; i++) {
            String FNAME = in.nextLine(); // One file name per line.
            fName[i] = FNAME;
        }
        
        System.out.println(fileE[0] + " " + fileE[1] + " " + fileE[2]);
        System.out.println(MIME[0] + " " + MIME[1] + " " + MIME[2]);
        System.out.println(fName[0] + " " + fName[1] + " " + fName[2]);
        
        for(String values : fName){
        	boolean found = false;
            int lastDotIndex = values.lastIndexOf('.');
            if (lastDotIndex != -1 && lastDotIndex < values.length() - 1){
                String fileExtension = values.substring(lastDotIndex + 1);
                for(int j = 0; j<fileE.length; j++){
                	//System.out.println(fileE[j]+" "+fileExtension);
                    if(fileE[j].toLowerCase().equals(fileExtension.toLowerCase())){
                        System.out.println(MIME[j]);
                        found = true;
                    }
                }
            }
            if(!found) {
            	System.out.println("UNKNOWN");
            }
        }
    }
}
