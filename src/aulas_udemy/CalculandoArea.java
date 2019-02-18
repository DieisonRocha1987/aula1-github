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
public class CalculandoArea {
    
     public static void main(String[] args) {
         
          Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        double xA,xB,xC,yA,yB,yC;
        
         System.out.println("Digite as medidas do triangulo X");
           xA = sc.nextDouble();
           xB = sc.nextDouble();
           xC = sc.nextDouble();
         System.out.println("Digite as medidas do triangulo Y");
           yA = sc.nextDouble();
           yB = sc.nextDouble();
           yC = sc.nextDouble();
           
         double p = (xA+xB+xC) / 2.0;
         double areaX = Math.sqrt(p*(p-xA)*(p-xB)*(p-xC));
         
         p = (yA+yB+yC) / 2.0;
         double areaY = Math.sqrt(p*(p-yA)*(p-yB)*(p-yC));
        
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
