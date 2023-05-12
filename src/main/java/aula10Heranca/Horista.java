/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula10Heranca;

/**
 *
 * @author STADS
 */
public class Horista extends Funcionario{
    
    private double valorHora;
    private double quantHora;

    public double getValorHora() {
        return valorHora;
    }

    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }

    public double getQuantHora() {
        return quantHora;
    }

    public void setQuantHora(double quantHora) {
        this.quantHora = quantHora;
    }
    
    
    
    
    public double calculcarSalario(){
        return getQuantHora() * getValorHora();
        
    }
    
    
}
