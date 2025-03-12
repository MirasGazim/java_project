package java_1;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;

import java_1.gazim;

public class miras {
    public static void main(String[] args){
        
        
        gazim sss = new gazim(234f, 2000, "black", new byte[] {12, 12, 23});
        System.out.println(sss.getValues());
        gazim rrr = new gazim(345, new byte[] {12,  34, 45});
        
        int[] num = {1, 1, 2, 1, 4, 4, 1, 4, 3, 3, 4, 2, 3, 2, 3};
        int unique = 0;
        for(int i : num)
            unique ^= i;
        
        System.out.println(unique);
    
    }  

    
    
}
