/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aulas_udemy;
import java.util.Scanner;

/**
 *
 * @author dieis
 */
public class EstruturaFor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Quantos numero vc ira digitar?");
        int n = sc.nextInt();
        
        int soma = 0;
        for(int i = 1; i <= n; i++){
        System.out.print("Value #" + i + " : ");
        int x = sc.nextInt();
        soma += x;
    }
        System.out.println("Soma = " + soma);
        
        sc.close();
        
    }
    
}
