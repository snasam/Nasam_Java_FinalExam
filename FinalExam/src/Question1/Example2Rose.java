/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question1;

/**
 *
 * @author S541997
 */
public class Example2Rose extends Example2Flower {

    @Override
    public void colour() {
        System.out.println("The colour is red");
    }
    
    public static void main(String args[]){
    Example2Flower f= new Example2Rose();
    System.out.println("Answer to first question example2: Shital Nasam");
    f.colour();
    
    }
   
    
    
}
    

