package br.edu.fatecfranca.exe1;
public class Testa {
    public static void main(String[] args) {
        Voo v1 = new Voo("Curitiba", "PF");
        Reserva r1 = new Reserva(13, v1);
        System.out.println(r1.toString());
        
        Voo v2 = new Voo();
        v2.setDestino("Curitiba");
        v2.setNumero("PF");
        Reserva r2 = new Reserva();
        r2.setCodigo(13);
        r2.setVoo(v2);
        System.out.println(r2.toString());
        
        Passageiro p1 = new Passageiro("Lula", r1);
        System.out.println(p1.toString());
        
        Passageiro p2 = new Passageiro();
        p2.setNome("Lula");
        p2.setReserva(r2);
        System.out.println(p2.toString());
     
        Passageiro p3 = new Passageiro();
        p3.setNome("Lula");
        p3.setVoo(v2);
        System.out.println(p3.toString());
        
        Passageiro p4 = new Passageiro();
        p4.setNome("Lula");
        p4.setVoo(r2, v2);
        System.out.println(p4.toString());
    }
}
