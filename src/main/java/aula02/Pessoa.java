/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula02;

import java.util.Scanner;

/**
 *
 * @author STADS
 */
public class Pessoa {
    String nome;
    int idade, result;
    
    void entrarNomeIdade(){
        Scanner oT = new Scanner(System.in);
        System.out.println("Nome: ");
        nome = oT.nextLine();
        System.out.println("Idade: ");
        idade = oT.nextInt();
    }
    
    void converterIdadeDias(){
        entrarNomeIdade();
        result = idade * 360;
        System.out.println(nome+" sua idade de "+idade+" em dias é "+result+" dias");
        
    }
}
