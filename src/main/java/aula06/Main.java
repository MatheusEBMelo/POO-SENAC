/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula06;

/**
 *
 * @author STADS
 */


public class Main {
    
    //Codigo para exibir as iniciais de um nome completo, sem as preposições (da, dos, do, etc...).
    
     public static void main(String[] args) {
         Literal literal = new Literal();
//         String nome = "Vinicis de Souza Araujo";
//         
//         System.out.println(literal.mostrarIniciais(nome));
                
         boolean valor = literal.verificarPalindromo("vinicius");
           if(valor == true){
              System.out.println("É palindromo!"); 
           }else{System.out.println("Não é palindromo!"); }
         }
     }

