/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aulas_udemy;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author dieis
 */
public class Aulas_Udemy {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        
        System.out.println("Digite o primeiro numero?");
        int a = sc.nextInt();
         System.out.println("Digite o segundo numero?");
        int b = sc.nextInt();
         System.out.println("Digite o terceiro numero?");
        int c = sc.nextInt();
        
        if (a > b && a> c ){
            System.out.println("O numero " +  a + " é maior ");
        }
            else if (b > a && b > c ){
            System.out.println("O numero " +  b + " é maior ");
        }
            else{
                    System.out.println("O numero " +  c + " é maior ");
                    }
            
                    sc.close();
            
            
        }
        }
                
         
         
        
       
    
    

