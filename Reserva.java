/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Atividades;

/**
 *
 * @author musas
 */
public class Reserva {
    String nome;
    int dia;
    String quarto;
    double valor;
    
    Reserva(String n, int d, String q, double v){
        nome = n;
        dia = d;
        quarto = q;
        valor = v;
    }
    
    double valorReserva() {
        return dia*valor;
    }
    
    void texto() {
        System.out.println("Nome: " + nome);
        System.out.println("Dias: " + dia);
        System.out.println("Serviço escolhido: " + quarto);
        System.out.println("Valor total da estadia: " + valorReserva());
        System.out.println("Volte sempre!");
    }
    
    //Teste de Reserva
    public static void main(String[] args) {
        Reserva cliente1 = new Reserva("Nome",5,"VIP",250.0);
        cliente1.texto();
    }
}
