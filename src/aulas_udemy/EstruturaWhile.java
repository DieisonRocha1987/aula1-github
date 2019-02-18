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
public class EstruturaWhile {
    
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite um numero");
        double n = sc.nextDouble();
        
        while (n > 0.0){
            double sr = Math.sqrt(n);
            System.out.printf("%.3f%n", sr);
            System.out.println("Entre com novo numero");
            n = sc.nextDouble();
        }
        System.out.println("Numero negativo");
            
        
        sc.close();
    }
}

