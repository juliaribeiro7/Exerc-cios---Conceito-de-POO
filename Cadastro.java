/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Atividades;

/**
 *
 * @author musas
 */
public class Cadastro {
    //Atributos da classe
    String nome;
    String email;
    String telefone;
    double produto1, produto2, produto3;
    
    //Construtor
    Cadastro(String n, String e, String t, double p1, double p2, double p3) {
        nome = n;
        email = e;
        telefone = t;
        produto1 = p1;
        produto2 = p2;
        produto3 = p3;
    }
    
    //Métodos
    double calcular() {
        return produto1 + produto2 + produto3;
    }
    
    void texto() {
        System.out.println("Nome: " + nome);
        System.out.println("E-mail: " + email);
        System.out.println("Telefone: " + telefone);
        System.out.println("Total produtos: " + calcular());
    }
    
    
    //Teste do Cadastro
    public static void main(String[] args) {
        Cadastro cadastro1 = new Cadastro("Nome","Email.com","111111", 50.0, 20.0, 100.0);
        cadastro1.texto();
    }
}
