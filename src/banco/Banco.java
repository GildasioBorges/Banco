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
public class Banco {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Conta GGBConta = new Conta();
        
        GGBConta.numero = 123456789;
        GGBConta.titular = "GGB";
        GGBConta.deposita(52000000);
                
        
        System.out.println("numero da conta:" + GGBConta.numero);
        System.out.println("Titular da conta:" + GGBConta.titular);
        System.out.println("saldo da conta" + GGBConta.saldo);
    
     Conta GildasioConta = new Conta();
        
        GildasioConta.numero = 987456321;
        GildasioConta.titular = "Gildasio";
       if (GildasioConta.saca (5000)){
           System.out.println ("Consegui Sacar 5000 reais");
       }
       
       GildasioConta.transfere(GGBConta, 5000);
        
        System.out.println("numero da conta:" + GildasioConta.numero);
        System.out.println("Titular da conta:" + GildasioConta.titular);
        System.out.println("Saldo da conta:" + GildasioConta.saldo);
    
    
    }
    
    
}
