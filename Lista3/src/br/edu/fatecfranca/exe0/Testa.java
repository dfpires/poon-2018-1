package br.edu.fatecfranca.exe0;
public class Testa {
    public static void main(String[] args) {
        ContaCorrente joao = new ContaCorrente("58-2", "99197-x", 2000);
        
        CartaoDebito joaoVisa = new 
        CartaoDebito(1234, 244, "03/24", "João", "Visa", joao);
        
        System.out.println(joaoVisa.getNome());
        
        System.out.println(joaoVisa.getNumero());
        
        System.out.println(joaoVisa.getContaCorrente().getSaldo());
        
        joaoVisa.getContaCorrente().setConta("3329-4");
        
        System.out.println(joaoVisa.toString());
        
    }
}
