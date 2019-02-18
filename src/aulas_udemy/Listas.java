/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aulas_udemy;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author dieis
 */
public class Listas {
    
    public static void main(String[] args) {
        
        List<String> list = new ArrayList<>();
        
        list.add("Maria");
        list.add("Alex");
        list.add("Bob");
        list.add("Ana");
        list.add(2, "Marcos");
        
        System.out.println(list.size());
        
       
        
        for(String x :list){
            System.out.println(x);
        }
        System.out.println("---------------------");
      
        list.removeIf(x -> x.charAt(0)== 'M');
        for(String x :list){
            System.out.println(x);
        }
            System.out.println("---------------------");
            System.out.println("Posição de Bob é : " + list.indexOf("Bob"));
            System.out.println("---------------------");
            List<String> result = list.stream().filter(x -> x.charAt(0)== 'A').collect(Collectors.toList());
            for(String x :result){
            System.out.println(x);
        }
             System.out.println("---------------------");
             String name = list.stream().filter(x -> x.charAt(0) == 'A').findFirst().orElse(null);
             System.out.println(name);
    }
    
    }

