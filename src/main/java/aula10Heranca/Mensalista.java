/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula10Heranca;

/**
 *
 * @author STADS
 */
public class Mensalista extends Funcionario{
    
    private double salarioFixo;

    public double getSalarioFixo() {
        return salarioFixo;
    }

    public void setSalarioFixo(double salarioFixo) {
        this.salarioFixo = salarioFixo;
    }
    
    
    
    public double calculcarSalario(){
        return getSalarioFixo();
        
    }
    
}
