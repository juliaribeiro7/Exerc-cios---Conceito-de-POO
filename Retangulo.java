/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Atividades;

/**
 *
 * @author musas
 */
public class Retangulo {
    double altura;
    double largura;
    
    Retangulo(double a, double l) {
        altura = a;
        largura = l;
    }
    
    double perimetro() {
        return (altura*2) + (largura*2);
    }
    
    double area() {
        return altura * largura;
    }
    
    void texto() {
        System.out.println("Perimetro: "  + perimetro());
        System.out.println("Area: " + area());
    }
    
    public static void main(String[] args) {
        Retangulo retangulo1 = new Retangulo(5,6);
        retangulo1.texto();
        
        
    }
}
