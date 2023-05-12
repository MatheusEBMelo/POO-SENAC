/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula08Entrega;

import java.util.Scanner;

/**
 *
 * @author STADS
 */
public class Main {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    String opcao = "0", nomeAnimal, especie;
    int vetorTamanho, posicao, idade;
    boolean validarCase = true;
    
    System.out.println("--------------------------");
    System.out.println("    LOJA DE ANIMAIS    ");
    System.out.println("--------------------------");
    
    while(true){
    try{
    System.out.println("");
    System.out.println("Antes de começar digite um tamanho para");
    System.out.println("a quantidade de animais que o sistema irá trabalhar: ");
    vetorTamanho = input.nextInt();
    input.nextLine();
    System.out.println("");
    
    
        break;
    }catch(Exception e){
        System.out.println("Entrada inválida. Digite um número inteiro.");
        input.nextLine();
        
    }
    
    }
    Loja loja = new Loja(vetorTamanho);
    
    
    while(!opcao.equals("6")){
        
    System.out.println("");
    System.out.println("Oque deseja fazer?");
    System.out.println("");
    System.out.println("1 - Cadastrar animal");
    System.out.println("2 - Mostrar todos os animais");
    System.out.println("3 - Excluir animal");
    System.out.println("4 - Alterar dados do animal");
    System.out.println("5 - Buscar um animal em específico pelo nome");
    System.out.println("6 - Sair");
    System.out.println("");
    
    
    opcao = input.nextLine();
    System.out.println("");
    
    switch (opcao) {
        
        case "1":
                while(true){
                    try{
                        System.out.println("Digite a posição");
                        posicao = input.nextInt();
                        System.out.println("");
                        input.nextLine();
                        break;
                    }catch(Exception e){
                        System.out.println("Entrada inválida. Digite um número inteiro.");
                        input.nextLine();
                    }
                }
                        
                        
                        
                        System.out.println("Digite o nome do animal: ");
                        nomeAnimal = input.nextLine();
                        System.out.println("");
                        
                        
                        
                        System.out.println("Digite o nome da espécie: ");
                        especie = input.nextLine();
                        
                        System.out.println("");
                        
                       
                        while(true){
                    try{
                        System.out.println("Digite a idade");
                        idade = input.nextInt();
                        System.out.println("");
                        input.nextLine();
                        break;
                    }catch(Exception e){
                        System.out.println("Entrada inválida. Digite um número inteiro.");
                        input.nextLine();
                    }
                }

                loja.inserirAnimal(posicao, new Animal(especie,nomeAnimal,idade));
                
            break;
            
            case "2":
                loja.mostrarLoja();
            break;
            
            case "3":
                while(true){
                    try{
                        System.out.println("Digite a posição");
                        posicao = input.nextInt();
                        System.out.println("");
                        input.nextLine();
                        break;
                    }catch(Exception e){
                        System.out.println("Entrada inválida. Digite um número inteiro.");
                        input.nextLine();
                    }
                }
                loja.excluirAnimal(posicao);
            break;
            
            case "4":
                
                while(true){
                    try{
                        System.out.println("Digite a posição");
                        posicao = input.nextInt();
                        System.out.println("");
                        input.nextLine();
                        break;
                    }catch(Exception e){
                        System.out.println("Entrada inválida. Digite um número inteiro.");
                        input.nextLine();
                    }
                }
                        
                        
                        
                        System.out.println("Digite o novo nome do animal: ");
                        nomeAnimal = input.nextLine();
                        System.out.println("");
                        
                        
                        
                        System.out.println("Digite o nome da nova da espécie: ");
                        especie = input.nextLine();
                        
                        System.out.println("");
                        
                       
                        while(true){
                    try{
                        System.out.println("Digite a nova idade");
                        idade = input.nextInt();
                        System.out.println("");
                        input.nextLine();
                        break;
                    }catch(Exception e){
                        System.out.println("Entrada inválida. Digite um número inteiro.");
                        input.nextLine();
                    }
                }

                loja.alterarAnimal(posicao, new Animal(especie,nomeAnimal,idade));
            
            break;
            
            case "5":
                System.out.println("Digite o nome do animal: ");
                nomeAnimal = input.nextLine();
                System.out.println("");
                loja.buscarAnimal(nomeAnimal);
            break;
            
            case "6":
                System.out.println("Até mais!");
                break;
            
            
            default:
                System.out.println("Opção inválida!");
                
               
    }
    }
    }
}
