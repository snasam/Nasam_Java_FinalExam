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
public class example2driver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
    Example2Vehicle vehicle= new Example2Vehicle("honda","4wheeler",5000);
    System.out.println("Answer to question 3 Example 2: Shital Nasam");
    Car c=new Car("Green","2015","honda","4wheeler",5000);
    vehicle=c;
    c=(Car)vehicle;
    System.out.println(c);
    
     }
    
}
