/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package headfirstconditionalbranchingexercise;

/**
 *
 * @author caolanohagan
 */
public class MyApp {
   public static void main (String [] args){
       int x = 4;
       if (x == 3) {
           System.out.println("x must be 3");
       }else {
           System.out.println("x is NOT 3");
       }
       System.out.println("This runs regardless");
   }
}
