/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bancofreitasmartins;

/**
 *
 * @author Jessica
 */
public class BancoFreitasMartins {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Conta conta = new Conta("Jessica Pires de Freitas");
        System.out.println("Conta criada em nome de: "+conta.nomeTitular);
        
        
        conta.depositarValor(500); 
        System.out.println("Conta criada em nome de: "+conta.saldoConta);
        
        Cartao cartao = new Cartao(conta);
        System.out.println("Cartao número " + cartao.numeroCartao + " criado com sucesso!");
        
        
    }
    
    
}


