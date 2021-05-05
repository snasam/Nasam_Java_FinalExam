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
public class InterfaceEx2Student implements InterfaceEx1Course {

    

    @Override
    public String getCourse(String course) {
       return "Course enrolled for student is " + course;
    }
    
    public static void main(String[] args) {
    InterfaceEx2Student stu = new InterfaceEx2Student();
       System.out.println("Answer to Interface Example1");
       System.out.println(stu.getCourse("Java"));
  }
}
    

