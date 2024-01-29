package practice;

import java.util.*;
import java.io.*;
import java.math.*;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 * 
 * 
 * input
4
5
MANHATTAN
 #  ##   ## ##  ### ###  ## # # ###  ## # # #   # # ###  #  ##   #  ##   ## ### # # # # # # # # # # ### ### 
# # # # #   # # #   #   #   # #  #    # # # #   ### # # # # # # # # # # #    #  # # # # # # # # # #   #   # 
### ##  #   # # ##  ##  # # ###  #    # ##  #   ### # # # # ##  # # ##   #   #  # # # # ###  #   #   #   ## 
# # # # #   # # #   #   # # # #  #  # # # # #   # # # # # # #    ## # #   #  #  # # # # ### # #  #  #       
# # ##   ## ##  ### #    ## # # ###  #  # # ### # # # #  #  #     # # # ##   #  ###  #  # # # #  #  ###  #  

ouput
# #  #  ### # #  #  ### ###  #  ###  
### # # # # # # # #  #   #  # # # #  
### ### # # ### ###  #   #  ### # #  
# # # # # # # # # #  #   #  # # # #  
# # # # # # # # # #  #   #  # # # # 
 *
 **/
class Solution8 {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int L = in.nextInt();
        int H = in.nextInt();
        if (in.hasNextLine()) {
            in.nextLine();
        }
        String T = in.nextLine();
        String[] arr = T.split("");
        for (int i = 0; i < H; i++) {

            String ROW = in.nextLine();
            String[] aRow = ROW.split("");
            StringBuilder result = new StringBuilder();

            for(int j = 0; j <arr.length; j++){
                int current = ((int)Character.toUpperCase(arr[j].charAt(0)))-65;
                int rowStart = (current>25||current<0) ? 104 :current*L;

                for(int k = rowStart; k<rowStart+L; k++){
                    result.append(aRow[k]);
                }
            }
            System.out.println(result.toString());
        }

        // Write an answer using System.out.println()
        // To debug: System.err.println("Debug messages...");

        
    }
}
