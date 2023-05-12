/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula10Heranca;

/**
 *
 * @author STADS
 */
public abstract  class Funcionario {
    
    protected int matricula;
    protected String nome;
    protected double salario;

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    
    
    public abstract double calculcarSalario();
    
    public void mostrarFuncionario(){
        System.out.println("Matricula: " + getMatricula() );
        System.out.println("Nome: " + getNome() );
        System.out.println("Salário: " + getSalario() );
    }
        
        
        
    
}
