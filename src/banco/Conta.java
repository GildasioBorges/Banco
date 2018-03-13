/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banco;

/**
 *
 * @author 05.10871-3
 */
public class Conta {
    int numero;
    String titular;
    double saldo;
    
    public double getSaldo(){
        return this.saldo;
    
    }
    
    public void deposita(double valor){
    this.saldo += valor;
    }
    
    public boolean saca(double valor){
        if (this.saldo > valor){
            this.saldo-= valor;
            return true;
                    } else{
            return false;
        }
    }
    public void transfere (Conta destino, double valor){
        destino.saldo+= valor;
        this.saldo-=valor;
    }
           
    
    
}
