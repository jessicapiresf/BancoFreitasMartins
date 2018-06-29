/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bancofreitasmartins;

import java.util.Random;

/**
 *
 * @author Jessica
 */
public final class Conta {
    
    double saldoConta;
    String numeroAgencia;
    String numeroConta;
    String nomeTitular;
    
    
    //CONSTRUTOR DA CLASSE
    public Conta(String nomeTitular){
        
        //fazer operações basicas, como gerar numero da conta, atribuir saldo, etc..
        this.nomeTitular = nomeTitular;
        this.numeroAgencia = "1203";
        this.numeroConta = geradorNumeroConta();
        this.saldoConta = 0;
        
    }
    

    //GETS E SETS
    public double getSaldoConta() {
        return saldoConta;
    }

    public void setSaldoConta(double saldoConta) {
        this.saldoConta = saldoConta;
    }

    public String getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(String numeroConta) {
        this.numeroConta = numeroConta;
    }

    public String getNomeTitular() {
        return nomeTitular;
    }

    public void setNomeTitular(String nomeTitular) {
        this.nomeTitular = nomeTitular;
    }
    
    
    //METODOS DA CLASSE
    public void depositarValor(double valor){
        this.saldoConta += valor;
        
    }
    
    
    final String geradorNumeroConta(){
        Random random = new Random();
        String numeroConta = "";
        for (int i = 0; i < 7; i++) 
            numeroConta+=random.nextInt(10);
         
        return numeroConta;
    }
   
    
}
