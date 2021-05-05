/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question7;
import java.util.Scanner;

/**
 *
 * @author S541997
 */
public class Array {
        public static void main(String[] args) {
        System.out.println("Answer to Question 7: Shital Nasam");
        
        int[] in = new int[100];
        Scanner sc = new Scanner(System.in);
        int i = 0;

        while (i < in.length) {
            in[i] = (int) (Math.random() * 100) + 1;
            i++;
        }
        System.out.print("Enter the index of the array: ");
        int a = in[sc.nextInt()];

        try {
            System.out.println("The corresponding element is " + a);
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("Out of Bound Exception");
        }
    }}


