/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question9;

import java.io.IOException;

/**
 *
 * @author S541997
 */
public class Example2 {
  static void checkAge(int age) throws ArithmeticException {
  try
  {
      if (age < 18) {
      throw new ArithmeticException("Access denied - You must be at least 18 years old.");
    }
    else {
      System.out.println("Access granted - You are old enough!");
    }
  }
  catch( ArithmeticException e)
  {
     System.out.println("Answer to question 9 example2:Shital Nasam");
     System.out.println("Arithemtic Exception:Access denied - You must be at least 18 years old");
  }
  }

  public static void main(String[] args) {
    checkAge(15); // Set age to 15 (which is below 18...)
  }
}

