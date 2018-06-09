package fatec.exe1;
public class Americano extends Pessoa implements Cidadao, Contribuinte{
    private String ssn;
    public Americano(){
        super();
        this.ssn = "não definido";
    }
    public Americano(String ssn, int idade){
        super(idade);
        this.ssn = ssn;
    }
    public String getSsn() {
        return ssn;
    }
    public void setSsn(String ssn) {
        this.ssn = ssn;
    }
    @Override
    public String toString() {
        return "Americano{" + "ssn=" + ssn + super.toString() + '}';
    }
    @Override
    public String tiraIdentidade() {
        return "Americano tirou o SSN no Public Department " + this.ssn;
    }
    @Override
    public String vota() {
        if (this.idade >= 18){
            return "Americano votou na urna manual";
        }
        else {
            return "Americano não pode votar";
        }
    }
    @Override
    public String declaraIR() {
        return "Americano declara IR até 18/04 de cada ano";
    }

    @Override
    public String pagaIR() {
        return "Americano paga IR alto e recebe serviço de qualidade";
    }
}
