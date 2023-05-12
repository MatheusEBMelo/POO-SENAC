/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula02;

import java.util.Scanner;

/**
 *
 * @author STADS
 */
public class Quadrado {
    double lado, area;
    
    void entrarLado(){
        Scanner oT = new Scanner(System.in);
        
        System.out.println("Lado: ");
        lado = oT.nextDouble();
    }
    
    void calcularArea(){
        entrarLado();
        area = lado * lado;
                System.out.println("Area: "+area);

    }
}
