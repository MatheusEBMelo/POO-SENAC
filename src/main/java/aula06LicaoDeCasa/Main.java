/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula06LicaoDeCasa;

/**
 *
 * @author STADS
 */
public class Main {
    public static void main(String[] args) {
        MetodosLiterais ML = new MetodosLiterais();
        System.out.println(ML.retornarReferenciaBibliografica("Ricardo Luiz da Silva Passos"));
        
        System.out.println("Palavra escolhida aparece "+ML.contarPalavra("ANA COME BANANA","ANA") + " vezes na frase");
        
       
    }
}
