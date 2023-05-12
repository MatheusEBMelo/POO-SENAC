/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula08;

/**
 *
 * @author STADS
 */
public class Loja {
    
    private Animal store[];

    public Loja() {}
    public Loja(int quantidade) {
        store = new Animal[quantidade];
    }
    
    
    public void inserirAnimal(int posicao, Animal animal){
        if(posicao >= store.length){
            System.out.print("Posição inválida!");
        }else{
            if(store[posicao] == null){
                store[posicao] = animal;
                
            }else{System.out.print("Posição ocupada!");}
        }
    }   
    
    public void mostrarLoja(){
        for(int i = 0;i<store.length; i++ ){
            if(store[i] != null){store[i].mostrarAnimal();}
            
        }
    }
    
    public void excluirAnimal(int posicao){
        if(posicao >= store.length){
            System.out.print("Posição inválida!");
        }else{
            if(store[posicao] != null){
                store[posicao]=null;
                System.out.print("Excluido!");
            }
        }
    }
    
    
    public void alterarAnimal(int posicao, Animal animal){
        if(posicao >= store.length){
            System.out.print("Posição inválida!");
        }else{
            if(store[posicao] != null){
                store[posicao]=animal;
                
            }
        }
    }
    
    public void buscarAnimal(String nome){
        for(int i = 0; i<store.length;i++){
            if(store[i].getNome().equals(nome)){
                store[i].mostrarAnimal();
                }
        }
    }
    
    
    public Animal[] getStore() {
        return store;
    }
    public void setStore(Animal[] store) {
        this.store = store;
    }
    
    
    
    
    
    
    
}
