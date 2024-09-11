/*
problem statement:
Problem Description

Given a string A and two indices L and R print a substring consisting of all characters in the inclusive range from L to R. You'll find the String class' substring method helpful in completing this challenge.
Problem Constraints
1 <= |A| <= 105
0 <= L, R <= |A| - 1
Input Format:

The first line contains a single string denoting A.
The second line contains two space-separated integers denoting the respective values of L and R.

Output Format:

Print the substring in the inclusive range from L to R.
Example Input
Input 1:
 Rishabh
 0 3
Example Output
Output 1:
 Rish
 */

import java.util.Scanner;
public class InterviewBitStringProb {
    // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output
        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
             System.out.println("Enter the String");
             String A=sc.nextLine();
            System.out.println("enter the integer L");//these statements write =>otherwie on intervitBit compiler its already defined
            int L = sc.nextInt();
            System.out.println("enter the integer R"); //just for proper codee understanding
            int R=sc.nextInt();
            sc.close();
           System.out.println(A.substring(L,R+1));
            }  
        }
    
