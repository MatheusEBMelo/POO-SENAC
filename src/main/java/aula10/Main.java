/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula10;

/**
 *
 * @author STADS
 */
public class Main {
    public static void main (String[] args){
        
        Produto op1 = new Produto(1,"Batata Frita",6);
        Produto op2 = new Produto(200,"Sprite Limão",6.50);
        Produto op3 = new Produto(2,"Fanta Laranja",6.50);
        Produto op4 = new Produto(3,"Bauru",18.50);
        Produto op5 = new Produto(450,"Misto Quente",12.50);
        
        Pedido oPed1 = new Pedido();
        oPed1.setNumPedido(32);
        oPed1.setClientePedido(new Cliente(134, "Ricardo"));
        
        oPed1.incluirItem(1, op1, 5);
        oPed1.incluirItem(2, op2, 1);
        oPed1.incluirItem(3, op3, 2);
        oPed1.incluirItem(4, op4, 1);
        oPed1.incluirItem(5, op5, 2);
        
        oPed1.gerarPedido();
    }
}
