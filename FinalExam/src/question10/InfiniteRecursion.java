/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question10;

import java.util.Scanner;

/**
 *
 * @author Shital Nasam
 */
public class InfiniteRecursion {
    public static double harmonical(int n) {
    
       System.out.println("The valueof n is "+n);
        return harmonical(n-1) + 1.0/n;
    } 

    public static void main(String[] args) {
        System.out.println("Answer to question 10 Example 2: Shital Nasam");
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the value of n");
        int a=scan.nextInt();
        System.out.println(harmonical(a));
    }

}

