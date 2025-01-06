package ExtraProgram;

import java.util.Scanner;

/*1.
Given an array of strings patterns and a string word, return the number of strings in patterns that exist as a substring in word.
A substring is a contiguous sequence of characters within a string.

Example 1:
Input: patterns = ["a","abc","bc","d"], word = "abc"
Output: 3
Explanation:
- "a" appears as a substring in "abc".
- "abc" appears as a substring in "abc".
- "bc" appears as a substring in "abc".
- "d" does not appear as a substring in "abc".
3 of the strings in patterns appear as a substring in word
*/
public class StringPatterns {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int count=0;
       int n = sc.nextInt();
       String s1[]=new String[n];
       for(int i=0;i<n;i++)
       {
           s1[i]=sc.next();
       }
       String s2 = sc.nextLine();
       for (int i = 0; i < n; i++) {
               if(s2.contains(s1[i]))
               {
                   count++;
                   System.out.print(s1[i]+" ");
               }
           }
       System.out.println(count);
    }
}
