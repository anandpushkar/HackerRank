import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        int a = A.length();
        int b = B.length();
        int sum = a+b;
        int c = A.compareTo(B);
        String s1 = A.substring(0,1).toUpperCase() + A.substring(1);
        String s2 = B.substring(0,1).toUpperCase() + B.substring(1);
        System.out.println(sum);
        if(c>0)
            System.out.println("Yes");
        else if(c<=0)
            System.out.println("No");
        System.out.println(s1+" "+s2);
         
    }
}
