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
public class Cartao {
    
    boolean cartaoAtivado;
    double limiteCartao;
    String numeroCartao;
    Conta contaAssociada;
    
    public Cartao(Conta contaAssociada){
        
        this.cartaoAtivado = false;
        this.contaAssociada = contaAssociada;
        this.limiteCartao = 1000;
        this.numeroCartao = geradorNumeroCartao();
        
    }

    public boolean isCartaoAtivado() {
        return cartaoAtivado;
    }

    public void setCartaoAtivado(boolean cartaoAtivado) {
        this.cartaoAtivado = cartaoAtivado;
    }

    public double getLimiteCartao() {
        return limiteCartao;
    }

    public void setLimiteCartao(double limiteCartao) {
        this.limiteCartao = limiteCartao;
    }

    public String getNumeroCartao() {
        return numeroCartao;
    }

    public void setNumeroCartao(String numeroCartao) {
        this.numeroCartao = numeroCartao;
    }

    public Conta getContaAssociada() {
        return contaAssociada;
    }

    public void setContaAssociada(Conta contaAssociada) {
        this.contaAssociada = contaAssociada;
    }
    
    final String geradorNumeroCartao(){
        Random random = new Random();
        String numeroConta = "";
        for (int i = 0; i < 16; i++) 
            numeroConta+=random.nextInt(10);
         
        return numeroConta;
    }
    
    
    
}
