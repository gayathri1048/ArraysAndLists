// Question 4: Java Subarray

// Skill Mapping: Basic

// Description: Solve the HackerRank Problem given as a link below -

// https://www.hackerrank.com/challenges/java-negative-subarray/problem

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sum=0;
        int negsum=0;
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            sum=0;
            for(int j=i;j<n;j++)
            {
                sum=sum+arr[j];
                if(sum<0)
                {
                    negsum++;
                }
            }
            
        }
        System.out.println(negsum);
    }
}
