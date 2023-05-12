/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula07;

/**
 *
 * @author STADS
 */

// Criar a classe Pessoa com as seguintes características:
// • atributos: idade e dia, mês e ano de nascimento, nome da pessoa
// • métodos:
// o calculaIdade(), que recebe a data atual em dias, mês e anos e calcula e
// armazena no atributo idade a idade atual da pessoa
// o informaIdade(), que retorna o valor da idade
// o informaNome(), que retorna o nome da pessoa
// o ajustaDataDeNascimento(), que recebe dia, mês e ano de nascimento
// como parâmetros e preenche nos atributos correspondentes do objeto.
// • Criar dois objetos da classe Pessoa, um representando Albert Einstein (nascido
// em 14/3/1879) e o outro representando Isaac Newton (nascido em 4/1/1643)
// • Fazer uma classe principal que instancie os objetos, inicialize e mostre quais
// seriam as idades de Einstein e Newton caso estivessem vivos


public class Pessoa {
    private int idade;
    private int dia;
    private int mes;
    private int ano;
    private String nome;
    
    public Pessoa(){}
    
    public void calculaIdade(int d, int m, int a){
        
        double dataNiver = (this.dia/365) + (this.mes/12) + this.ano;
        double dataAtual = (d/365)+(m/12)+a;
        
        double result = dataAtual - dataNiver;
        setIdade((int) Math.round(result));
        
        
    }
    
    public void ajustaDataDeNascimento(int d, int m, int a){
        setDia(d);
        setMes(m);
        setAno(a);
    }
    
    

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    
    
}
