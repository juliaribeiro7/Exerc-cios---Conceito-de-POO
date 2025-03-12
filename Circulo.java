/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Atividades;

/**
 *
 * @author musas
 */
public class Circulo {
    double raio;
    
    Circulo(double r) {
        raio = r;
    }
    
    
    double perimetro() {
        return 3.14 * raio * raio;
    }
    
    double area() {
        return 2 * 3.14 * raio;
    }
    
    void texto() {
        System.out.println("O perímetro do círculo é: " + perimetro());
        System.out.println("A área do círculo é: " + area());
    }
    
    
    public static void main(String[] args) {
        Circulo circulo1 = new Circulo(5);
        circulo1.texto();
    }
}
