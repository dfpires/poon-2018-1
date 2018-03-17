package fatecfranca.exe1;
import br.edu.fatecfranca.exe1.Cliente;
public class TestaCliente {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Cliente fulano = new Cliente();
        fulano.setNome("Marcelo");
        fulano.setNroAgencia("2340-3");
        fulano.setNroConta("231320-3");
        fulano.depositar(400);
        fulano.sacar(300);
        Cliente beltrano = new Cliente("2222","334536", "Rodrigo", 0);
        beltrano.depositar(800);
        beltrano.sacar(100);
        System.out.println(fulano.paraString());
        System.out.println(beltrano.paraString());
    }
    
}
