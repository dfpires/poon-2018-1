package fatec.exe1;
public class Brasileiro extends Pessoa implements Cidadao, Contribuinte {
    private String rg;
    public Brasileiro() {
        super();
        this.rg = "não definido";
    }
    public Brasileiro(String rg, int idade) {
        super(idade);
        this.rg = rg;
    }
    public String getRg() {
        return rg;
    }
    public void setRg(String rg) {
        this.rg = rg;
    }
    @Override
    public String toString() {
        return "Brasileiro{" + "rg=" + rg + super.toString() + '}';
    }
    @Override
    public String tiraIdentidade() {
        return "Brasileiro tirou o RG no PoupaTempo " + this.rg;
    }
    @Override
    public String vota() {
        if (this.idade >= 16){
            return "Brasileiro votou na urna eletrônica";
        }
        else {
            return "Brasileiro não pode votar";
        }
    }

    @Override
    public String declaraIR() {
        return "Brasileiro declara IR até 30/04 de cada ano";
    }

    @Override
    public String pagaIR() {
        return "Brasileiro paga IR alto e não recebe serviço de qualidade";
    }
}
