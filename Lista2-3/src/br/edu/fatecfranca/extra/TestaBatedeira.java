package br.edu.fatecfranca.extra;
public class TestaBatedeira {
    public static void main(String[] args) {
        Batedeira arno = new Batedeira();
        arno.setStatus(1);
        arno.setVelocidade(10);
        arno.aumentar(5);
        
        Batedeira walita = new Batedeira(1, 5);
        Batedeira lenta = Batedeira.menor(arno, walita);
        System.out.println("Lenta " + lenta.getVelocidade());
        
    }
    
}
