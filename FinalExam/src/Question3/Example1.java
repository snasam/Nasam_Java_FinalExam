/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question3;

/**
 *
 * @author S541997
 */
public class Example1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int num1=10;
        double num2=15.5;
        System.out.println("Answer to question3 example 1:Shital Nasam");
        System.out.println("The integer value: " + num1);
 // convert into double type(Widening type casting)
    double data = num1;
    System.out.println("The double value: " + data);
    System.out.println("-------------------------");
    
     System.out.println("The double value is: " + num2);
 // convert into int type(Narrow type casting)
    int data1 = (int)num2;
    System.out.println("The integer value: " + data1);
    
    
        
        
    }
    
}
