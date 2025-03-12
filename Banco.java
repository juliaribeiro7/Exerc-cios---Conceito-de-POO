/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Atividades;

/**
 *
 * @author musas
 */
public class Banco {
    Pessoa pessoa;
    int saldo;

    Banco(Pessoa pessoa, int saldo) {
        this.pessoa = pessoa;
        this.saldo = saldo;
    }
    
    
    void depositar(int valor) {
        saldo += valor;
    }
    
    void sacar(int valor) {
        saldo -= valor;
    }
    
    void transferir(Banco destinatario, int valor) {
        saldo -= valor;
        destinatario.saldo += valor;
    }
    
    void texto() {
        System.out.println("--Dados da Conta--");
        System.out.println("Nome: " + pessoa.nome);
        System.out.println("ID: " + pessoa.id);
        System.out.println("Saldo: R$" + saldo);
    }
    
    void texto2() {
        System.out.println("Valor após a trasferencia");
        System.out.println("Nome: " + pessoa.nome);
        System.out.println("Saldo: " + saldo);
    }
    
    
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa("Ana","111");
        Pessoa p2 = new Pessoa("Maria","222");
        
        Banco conta1 = new Banco(p1, 1000);
        Banco conta2 = new Banco(p2, 2000);
        
        conta1.texto();
        conta2.texto();
        
        conta1.transferir(conta2, 100);  //transferencia de 100 reais, conta2 é o destinatario e 100 o valor
        
        conta1.texto2();
        conta2.texto2();
    }   
}

class Pessoa {
    String nome;
    String id;
    
    Pessoa(String nome, String id) {
        this.nome = nome;
        this.id = id;
    }
}
