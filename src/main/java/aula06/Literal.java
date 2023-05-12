/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula06;

/**
 *
 * @author STADS
 */
public class Literal {
    public String mostrarIniciais(String nome){
         String inicial ="";
         nome = nome.toUpperCase().replace(" DA "," "); //o metodo toUpperCase deixa todos os caracteres maiusculo.
                                                        //o metodo replace troca os caracteres de uma string por outros
                                                        //nesse caso o espaço em branco.
        nome = nome.toUpperCase().replace(" DAS "," ");
        nome = nome.toUpperCase().replace(" DO "," ");
        nome = nome.toUpperCase().replace(" DOS "," ");
        nome = nome.toUpperCase().replace(" DE "," ");
        nome = nome.toUpperCase().replace(" DES "," ");
         
         
         System.out.println(nome);
         String nomeQuebrado[] = nome.split(" "); //o metodo split quebra a string baseado no caracter passado,
                                                  //nesse caso o espaço em branco.
         
         for(int i = 0; i<nomeQuebrado.length;i++){
            inicial = inicial + nomeQuebrado[i].charAt(0);// o metodo charAt pega o caracter da String na posição
                                                           // que passarmos

         }
         return inicial;
    }
    
    
    // metodo para verificar se uma palavra de trás pra frente é igual.
    public boolean verificarPalindromo(String palavra){
        
        String contrario = "";
        for(int i = palavra.length() - 1; i >= 0;i--){
            contrario = contrario + palavra.charAt(i);// o metodo charAt pega o caracter da String na posição
                                                      // que passarmos
         }
        
        if(contrario.equals(palavra)){
            return true;
        }
        return false;
    }
}
