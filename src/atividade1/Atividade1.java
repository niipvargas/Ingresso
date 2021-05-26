package atividade1;

public class Atividade1 {

    public static void main(String[] args) {
        
        Normal n = new Normal();
        n.imprimeValor(25.00);
        
        VIP v = new VIP();
        v.mostrarIngresso(25.00);
        
        CamaroteINF ci = new CamaroteINF();
        ci.mostrarIngresso();
        
        CamaroteSUP cp = new CamaroteSUP();
        cp.mostrarIngresso(75.00);
        
       
    }
    
}
