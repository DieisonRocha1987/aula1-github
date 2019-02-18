/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aulas_udemy;

import java.util.Locale;
import java.util.Scanner;
import entidades.Produto;
/**
 *
 * @author dieis
 */
public class ProgramaEstoque {
    
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        Produto produto = new Produto();
        System.out.println("Entre com Nome do Produto");
        System.out.print("Nome: ");
        produto.nome = sc.nextLine();
        System.out.print("Preço: ");
        produto.preco = sc.nextDouble();
        System.out.print("Quantidade no Estoque:  ");
        produto.quantidade = sc.nextInt();
        
        System.out.println();
        System.out.println("Produto é" + produto);
        
        System.out.println();
        System.out.print("Entre com a quantidade para entrada do estoque: ");
        int quantidade = sc.nextInt();
        produto.addProduto(quantidade);
        
        System.out.println();
        System.out.println("Quantidade atualizada é " + produto);
        
        System.out.println();
        System.out.print("Entre com a quantidade de saída do estoque: ");
        quantidade = sc.nextInt();
        produto.removerProduto(quantidade);
        
        System.out.println();
        System.out.println("Quantidade atualizada é " + produto);
        
        sc.close();
        
        
    }
    
}
