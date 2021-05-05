/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question5;

/**
 *
 * @author Shital Nasam
 */
public class Driver {
    
public static void main(String[] args) {
        ComparableCircle c1 = new ComparableCircle(5.0);
        ComparableCircle c2 = new ComparableCircle(3.0);
        int compare = c1.compareTo(c2);
        System.out.println("Answer to Question 5: Shital Nasam");
        if (compare == 1) {
            System.out.println("Circle c1 is larger");
        } else if (compare == -1) {
            System.out.println("Circle c2 is larger");
        } else {
            System.out.println("Both Circles are of equal area.");
        }

    }

}


