package br.edu.fatecfranca.exe2;
public class Testa {
    public static void main(String[] args) {
        Passageiro pa1 = new Passageiro("Fulano", 10);
        Passageiro pa2 = new Passageiro("Beltrano", 12);
        
        Onibus on1 = new Onibus();
        on1.setNumero("CM12");
        on1.adicionaPassageiro(pa1);
        on1.adicionaPassageiro(pa2);
        
        System.out.println(on1.toString());
        
        on1.removePassageiro(pa2);
        
        System.out.println(on1.toString());
        
        Passageiro pa3 = new Passageiro("Ciclano", 14);
        
        
        on1.atualizaPassageiro(pa1, pa3);
        
        System.out.println(on1.toString());
        
    }
    
}
