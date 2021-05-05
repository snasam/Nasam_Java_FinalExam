/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question6;

/**
 *
 * @author S541997
 */
public class UncheckedException {
    public static void main(String args[])
   {
       try{
       int num1=10;
	int num2=0;
	/*dividing an integer with 0
	 * it should throw ArithmeticException
         */
	int res=num1/num2;
	System.out.println(res);
   }
       
       catch(ArithmeticException e)
       {
           System.out.println("Answer to question 6 Example2:Shital Nasam");
           System.out.println("Division with zero is not allowed");
       }
}
}
