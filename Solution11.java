package practice;
import java.util.*;
import java.io.*;
import java.math.*;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
3
3
html text/html
png image/png
gif image/gif
animated.gif
portrait.png
index.html
 * 
 * 
 * 
 **/
class Solution11 {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt(); // Number of elements which make up the association table.
        int Q = in.nextInt(); // Number Q of file names to be analyzed.
        
        // Use a HashMap to store the association between file extensions and MIME types
        Map<String, String> fileExtensionToMIME = new HashMap<>();

        for (int i = 0; i < N; i++) {
            String EXT = in.next(); // file extension
            String MT = in.next(); // MIME type.
            fileExtensionToMIME.put(EXT.toLowerCase(), MT);
        }

        in.nextLine();
        for (int i = 0; i < Q; i++) {
            String FNAME = in.nextLine(); // One file name per line.
            int lastDotIndex = FNAME.lastIndexOf('.');
            if (lastDotIndex != -1 && lastDotIndex < FNAME.length() - 1) {
                String fileExtension = FNAME.substring(lastDotIndex + 1).toLowerCase();
                String mimeType = fileExtensionToMIME.getOrDefault(fileExtension, "UNKNOWN");
                System.out.println(mimeType);
            } else {
                System.out.println("UNKNOWN");
            }
        }
    }
}
