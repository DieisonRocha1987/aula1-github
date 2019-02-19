/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aulas_udemy;

import java.util.Locale;
import java.util.Scanner;
import entidades.Triangulo;

/**
 *
 * @author dieis
 */
public class CalculandoArea3 {
    
     public static void main(String[] args) {
         
          Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        Triangulo x, y;
        x = new Triangulo();
        y = new Triangulo();
        
         System.out.println("Digite as medidas do triangulo X");
           x.a = sc.nextDouble();
           x.b= sc.nextDouble();
           x.c = sc.nextDouble();
         System.out.println("Digite as medidas do triangulo Y");
           y.a = sc.nextDouble();
           y.b = sc.nextDouble();
           y.c = sc.nextDouble();
           
         double areaX = x.area();
          double areaY = y.area();
        
         System.out.printf("Triangulo X area é: %.4f%n", areaX);
         System.out.printf("Triangulo Y area é: %.4f%n", areaY);
         
         if(areaX > areaY){
             System.out.println("Área do triangulo X é maior ");
     }
         else{
             System.out.printf("Área do triangulo Y é maior ");
             
         }
         sc.close();
         
     }
    
         
}
