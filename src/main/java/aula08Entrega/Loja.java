/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula08Entrega;

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
    
    public boolean verificarExistenciaIndice(int posicao){
        
        if(posicao >= store.length){
            System.out.print("Posição inválida!");
            return false;
        }
        return true;
        
    }
    
    public boolean verificarOcupacaoIndice(int posicao){
        if(store[posicao] != null){
            return false;
        }
        return true;
    }
    
    public void inserirAnimal(int posicao, Animal animal){
        if(verificarExistenciaIndice(posicao) == true){
            if(verificarOcupacaoIndice(posicao) == true){
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
        if(verificarExistenciaIndice(posicao) == true){
            if(verificarOcupacaoIndice(posicao) == false){
                 store[posicao]=null;
                System.out.print("Excluido!");
            }
        }
    }
    
    
    public void alterarAnimal(int posicao, Animal animal){
        if(verificarExistenciaIndice(posicao) == true){
            if(verificarOcupacaoIndice(posicao) == false){
                store[posicao]=animal;
                System.out.print("Alterado!");
            }
        }
    }
    
    public void buscarAnimal(String nome){
        for(int i = 0; i<store.length;i++){
            if(store[i] != null && store[i].getNome().equals(nome)){
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

