import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print 
        output to STDOUT. Your class should be named Solution. */
    Scanner sc=new Scanner(System.in);
    int q=sc.nextInt();
    for (int j=0;j<q;j++){
    int a=sc.nextInt();
    int b=sc.nextInt();
    int n=sc.nextInt();
    
    int sum=a;
    for(int i=0;i<n;i++){
        sum=sum+(1<<i)*b;
        System.out.print(sum+" ");
    }
    
   System.out.println(); 
    }
}}


// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna