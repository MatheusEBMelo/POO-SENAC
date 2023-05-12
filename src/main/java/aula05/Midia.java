/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula05;

import static java.lang.Double.parseDouble;
import static java.lang.Integer.parseInt;
import java.util.Scanner;

/**
 *
 * @author STADS
 */
public class Midia {
    private int codigo;
    private double preco;
    private String nome;
    
    public Midia(){}
    public Midia(int c, double p, String n){
      this.codigo = c;
      this.preco = p;
      this.nome = n;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    
    
    public String getTipo(){
        
        return "Midia";
    }
    
    public String getDetalhe(){
        return "Codigo: "+getCodigo() + " Preco: "+getPreco()+" Nome: "+getNome();
    }
    
    public void printDado(){
        System.out.println(getDetalhe());
    }
    
    public void inserirDado(){
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Digite o codigo: ");
        setCodigo(entrada.nextInt());
        
        
        System.out.println("Digite o preço: ");
        setPreco(entrada.nextDouble());
        
        System.out.println("Digite o nome: ");
        setNome(entrada.next());
        
        
        
        
        
    }

    
    
    
    
}
