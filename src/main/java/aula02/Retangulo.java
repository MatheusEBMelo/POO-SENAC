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
public class Retangulo {
    double base, altura, area;
    
    void entrarBaseAltura(){
        Scanner oT = new Scanner(System.in);
        System.out.println("Base: ");
        base = oT.nextDouble();
        System.out.println("Altura: ");
        altura = oT.nextDouble();
    }
    
    void calcularArea(){
        entrarBaseAltura();
        area = base * altura;
                System.out.println("Area: "+area);

    }
}
