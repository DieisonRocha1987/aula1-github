package aulas_udemy;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dieis
 */
public class ExerciciosSplit {
    
     public static void main(String[] args) {
         
         String s = "Batata Limao Tomate Laranja";
         String [] vect = s.split(" ");
         
         System.out.println(vect[0]);
         System.out.println(vect[1]);
         System.out.println(vect[2]);
         System.out.println(vect[3]);
         
     }
    
}
