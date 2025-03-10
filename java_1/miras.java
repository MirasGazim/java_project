package java_1;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;

import java_1.gazim;

public class miras {
    public static void main(String[] args){
        gazim bmw = new gazim();
        bmw.setvalues(250, 2500, "black", new byte[] {0, 0, 0});
        
        String res = bmw.getValues(); 
        System.out.println(res);

        gazim intt = new gazim();
        intt.vark();

        gazim mers = new gazim();
        mers.speed = 260f;
        mers.weight = 2500;
        mers.color = "black";
        mers.coordinate = new byte[] {0, 0, 0};

        String res2 = mers.getValues();
        System.out.println(res2);
        
        // System.out.println("bmw speed: " + mers.speed + ". " + );
        // System.out.println(Arrays.toString(mers.coordinate));

        
    
        // switch(mers.color){
        //     case "black":
        //         System.out.println("it is black");
        //         break;
        //     case "yellow":
        //         System.out.println("it is yellow");
        //         break;
        //     case "white":
        //         System.out.println("it is white");
        //         break;
        // }
        
    }  

    
    
}
