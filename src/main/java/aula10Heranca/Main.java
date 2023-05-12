/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula10Heranca;

/**
 *
 * @author STADS
 */
public class Main {
    public static void main (String[] args){
    
        Horista oH = new Horista();
        
        oH.matricula = 1234;
        oH.nome = "Vanusia Palmeiras";
        oH.setValorHora(82);
        oH.setQuantHora(120);
        oH.salario = oH.calculcarSalario();
        
        oH.mostrarFuncionario();
        
        System.out.println("-----------------------------------");
        
        Mensalista oM = new Mensalista();
        oM.matricula = 345;
        oM.nome = "Marcos Palmeiras";
        oM.setSalarioFixo(12000);
        oM.salario = oM.calculcarSalario();
        oM.mostrarFuncionario();
        
    }
}
