/*We define the following:
A subarray of an n-element array is an array composed from a contiguous block of the original array's elements. For example, if array=[1,2,3], then the subarrays are [1], [2], [3], [1,2], [2,3], and [1,2,3]. Something like [1,3] would not be a subarray as it's not a contiguous subsection of the original array.
The sum of an array is the total sum of its elements.
An array's sum is negative if the total sum of its elements is negative.
An array's sum is positive if the total sum of its elements is positive.
Given an array of n integers, find and print its number of negative subarrays on a new line. */


import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Subarray {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print 
        output to STDOUT. Your class should be named Solution. */
        
        Scanner scan = new Scanner (System.in);
        
        int n = scan.nextInt();
        int arr [] = new int [n];
        
        for (int i = 0; i < n; i++ ){
            arr[i] = scan.nextInt();
        }
        
        int count = 0;
        
        for(int i = 0; i < n; i++){
            int sum = 0;
            for(int j = i; j < n; j++){
                sum = sum + arr[j];
                if(sum < 0){
                    count++;
                }
            }
        }
        System.out.println(count);
        scan.close();
    }
    
}
