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
public class EstruturadoWhile {
     public static void main(String[] args) {
         
         
         Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        char resposta;
        do{
            System.out.println("Digite um numero");
            double n = sc.nextDouble();
            double sq = Math.sqrt(n);
            System.out.printf("%.3f%n", sq);
            
            System.out.print("Repetir (S/N)?");
            resposta = sc.next().charAt(0);
        } while(resposta != 'N');
        
     sc.close();
     }
    
}
