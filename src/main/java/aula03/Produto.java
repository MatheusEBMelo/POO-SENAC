/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula03;

/**
 *
 * @author STADS
 */
public class Produto {
    String nome;
    double preco;
    int quantidade;
    double valorPago;
    double desconto;
    
    void iniciarValor(String n, double p, int q){
        nome = n;
        preco = p;
        quantidade = q;
    }
    
   
    void calcularDesconto(){
        if(quantidade <= 10){
            desconto = 0; 
        }
        else if(quantidade >=11 && quantidade <=20){
            desconto = 0.10;
            
        }
        
        else if(quantidade >=21 && quantidade <=50){
            desconto = 0.20;
            
        }
        
        
        else if(quantidade >50){
            desconto = 0.25;
            
        }
    }
    
     void calcularValorTotal(){
        valorPago = (quantidade*preco)-((quantidade * preco)*desconto);
    }
    
    
    void mostrarProduto(){
        System.out.println("Produto: "+nome);
        System.out.println("Valor a ser pago: "+valorPago);
    }
    
    
}
