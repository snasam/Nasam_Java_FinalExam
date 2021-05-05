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
public class TestInterfaceEx2 implements Interface1Ex2 {

    @Override
    public void display() {
        System.out.println("Test");
        
    }
    public static void main (String[] args)
    {
        TestInterfaceEx2 t = new TestInterfaceEx2();
        System.out.println("Answer to interface example2:Shital Nasam");
        t.display();
        System.out.println(a);
    }
    
}
