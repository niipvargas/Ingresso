package atividade1;

public class VIP extends Ingresso {
    
    public void mostrarIngresso(double ingressoVIP){
        double preco = ingressoVIP + 50;
        System.out.println("O Preço do Ingresso VIP é: " + preco);
    } 
}
