/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula03;

/**
 *
 * @author STADS
 */
public class Equacao2Grau {
    double a;
    double b;
    double c;
    double delta;
    double x1;
    double x2;
    
    void calcularDelta(double pa, double pb, double pc){
        a = pa;
        b = pb;
        c = pc;
        
        delta = Math.pow(-b,2)-4*a*c;
        
        
    }
    
    void calcularRaiz(){
        if(delta >= 0){
            
            x1 = (-b + Math.sqrt(delta))/(2*a);
            x2 = (-b - Math.sqrt(delta))/(2*a);
            
            System.out.println("A raiz x1:"+x1+" e raiz x2:"+x2);
        }else{
            System.out.println("Não existem raizes reais!");
        }
    }
    
    
    
}
