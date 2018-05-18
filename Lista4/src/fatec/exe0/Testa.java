package fatec.exe0;
public class Testa {
    public static void main(String[] args) {
        ContaCorrente cc1 = new ContaCorrente();
        cc1.setNome("Abreu");
        cc1.setNro(123);
        cc1.setSaldo(2000);
         System.out.println(cc1.toString());
         
        ContaEspecial ce1 = new ContaEspecial();
        ce1.setLimite(3000);
        ce1.setNome("Marcos");
        ce1.setNro(456);
        ce1.setSaldo(400);
        ce1.saque(2000);
        System.out.println(ce1.toString());
        

        ContaPoupanca cp1 = new ContaPoupanca();
        cp1.setRendimento(0.43f);
        cp1.setNome("Pedro");
        cp1.setNro(987);
        cp1.setSaldo(200);
        cp1.render();
        System.out.println(cp1.toString());

        
    }
    
}
