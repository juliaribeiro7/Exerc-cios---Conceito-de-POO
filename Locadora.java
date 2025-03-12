/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Atividades;

/**
 *
 * @author musas
 */
public class Locadora {
    String modelo;
    int diaria;
    
    Locadora(String m, int d) {
        modelo = m;
        diaria = d;
    }
    
    double aluguel() {
        return diaria * 30;
    }
    
    void texto() {
        System.out.println("Modelo: " + modelo);
        System.out.println("Valor da diária é: " + diaria);
        System.out.println("O valor do alguel será de: " + aluguel());
    }
    
    
    
    public static void main(String[] args) {
      Locadora cliente = new Locadora("Nome",40);
      cliente.texto();
    }
}