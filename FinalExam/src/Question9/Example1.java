/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question9;

/**
 *
 * @author S541997
 */
public class Example1 {
    static void checkEligibilty(int age, int weight){ 
      try
      {if(age<12 && weight<40) {
         throw new ArithmeticException("Student is not eligible for registration"); 
      }
      else {
         System.out.println("Student Entry is Valid!!"); 
      }
      }
      catch(ArithmeticException e){
              System.out.println("Arithmetic Exception:Student is not eligible for registration");
              }
      
   } 

   public static void main(String args[]){ 
       System.out.println("Answer to question 9 Example1:Shital Nasam");
     System.out.println("Welcome to the Registration process!!");
     checkEligibilty(10, 39); 
     System.out.println("Have a nice day.."); 
 } 

}
