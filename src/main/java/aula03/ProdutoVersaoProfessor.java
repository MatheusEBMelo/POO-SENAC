/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula03;

/**
 *
 * @author STADS
 */
public class ProdutoVersaoProfessor {
    double preco, desconto, total;
    int quantidade;
    String nome;
    
    void iniciarValor(String n, double p, int q){
        nome = n;
        quantidade = q;
        preco = p;
    }
    
    void calcularValorTotal(){
        total = preco * quantidade;
    }
    
    void calcularDesconto(){
      if(quantidade >= 11 && quantidade <= 20){
          desconto =  total *0.10;
      }
      else if(quantidade >=20 && quantidade <=50){
          desconto =  total *0.20;
      }
      else{
          desconto =  total *0.25;
      }
    }
    
    void mostrarProduto(){
        calcularValorTotal();
        calcularDesconto();
        System.out.println(nome);
        System.out.println(desconto);
        System.out.println(total);
        System.out.println(total-desconto);
    }
}
