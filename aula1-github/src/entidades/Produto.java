/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

/**
 *
 * @author dieis
 */
public class Produto {
    
   public String nome;
   public double preco;
   public int quantidade;
   
   public double totalValorProdutos(){
       return preco * quantidade;
        }
   
   public void addProduto(int quantidade){
       this.quantidade += quantidade;
   }
   public void removerProduto(int quantidade){
       this.quantidade -= quantidade;
   }
   public  String toString(){
       return nome
               + ", R$ "
               + String.format("%.2f", preco)
               + ", "
               + quantidade
               + " unidade(s), Total : R$ "
               + String.format("%.2f",totalValorProdutos());
   }
    
}
