/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Atividades;

/**
 *
 * @author musas
 */
public class Tarefa {
    String nome;
    String descricao;
    String prazo;
    String status;
    
    Tarefa(String n, String d, String p, String s) {
        nome = n;
        descricao = d;
        prazo = p;
        status = s;
    }
    
    void texto() {
        System.out.println("Nome: " + nome);
        System.out.println("Descrição: " + descricao);
        System.out.println("Prazo: " + prazo);
        System.out.println("Status: " + status);
    }
    
    
    
    
    
    public static void main(String[] args) {
        Tarefa atv1 = new Tarefa("Atividade","Descrição da atividade","11/03","Concluída");
        atv1.texto();
    }
}
