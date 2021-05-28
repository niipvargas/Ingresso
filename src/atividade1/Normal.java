package atividade1;

public class Normal extends Ingresso {
    
    public void mostrarIngresso(double ingressoNormal){
        System.out.println("Ingresso Normal");
        
    }
    
    @Override
    public void imprimeValor (double ingressoNormal) {
        System.out.println("O Preço do Ingresso Normal é: " + ingressoNormal);
    }
    
}
