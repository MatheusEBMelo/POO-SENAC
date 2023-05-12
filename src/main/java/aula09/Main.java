/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula09;

/**
 *
 * @author STADS
 */
public class Main {
    public static void main (String[] args){
        
        Produto oP = new Produto(10, "batata frita", 6);
        Produto oP1 = new Produto(120, "refrigerante", 6.5);
        
        oP.mostrarProduto();
        oP1.mostrarProduto();
    }
}
