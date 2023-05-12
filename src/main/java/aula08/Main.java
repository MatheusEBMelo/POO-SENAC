/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula08;

/**
 *
 * @author STADS
 */
public class Main {
    public static void main(String[] args) {
//        Animal animal = new Animal("cachorro","Pluto",6);
//        Animal animal1 = new Animal("Dumbo","Elefante",2);
//        Animal animal2 = new Animal("Gato","Felix",5);
//        Animal animal3 = new Animal("cachorro","Bidu",1);
//        Animal animal4 = new Animal("rato","Jerry",4);
//        Animal animal5 = new Animal("ave","Donald",5);
//        
//        Animal loja[] = new Animal[6];
//        loja[0] = animal;
//        loja[1] = animal1;
//        loja[2] = animal2;
//        loja[3] = animal3;
//        loja[4] = animal4;
//        loja[5] = animal5;
        
//        for(int i = 0; i< loja.length; i++){loja[i].mostrarAnimal();}

     Loja loja = new Loja(3);
     loja.inserirAnimal(0, new Animal("cachorro","Pluto",6));
     loja.inserirAnimal(1, new Animal("elefante","Dumbo",2));
     loja.inserirAnimal(2, new Animal("Gato","Felix",5));
     
//     loja.inserirAnimal(4, new Animal("rato","Jerry",4));
//     loja.inserirAnimal(5, new Animal("ave","Donald",5));
//    loja.mostrarLoja();
//    loja.alterarAnimal(1, new Animal("coelho","Perna Longa",2));
//    loja.mostrarLoja();
     loja.buscarAnimal("Pluto");

    }
}
