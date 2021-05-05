/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question11;

import java.util.Scanner;

/**
 *
 * @author S541997
 */
public class Hashcode1 {
 
    public static void main(String[] args) {  
      //Create integer object  
      System.out.println("Answer to question 11 example4:Shital Nasam");
      System.out.print("Enter the desired input value: ");  
      Scanner readInput = new Scanner(System.in);         
        Integer i = readInput.nextInt();  
        readInput.close();  
        // Returned hash code value for this object   
        int hashValue = i.hashCode();  
        System.out.println("Hash code Value for object is: " + hashValue);  
        }  
}  

