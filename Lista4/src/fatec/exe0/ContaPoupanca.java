package fatec.exe0;
public class ContaPoupanca extends ContaCorrente{
    private float rendimento;
    public ContaPoupanca(){
        super();
        this.rendimento = 0;
    }
    public ContaPoupanca(String nome, int nro, float saldo, float rendimento){
        super(nome, nro, saldo);
        this.rendimento = rendimento;
    }
    public float getRendimento() {
        return rendimento;
    }
    public void setRendimento(float rendimento) {
        this.rendimento = rendimento;
    }
    @Override
    public String toString() {
        return super.toString() + "ContaPoupanca{" + 
                "rendimento=" + rendimento + '}';
    }    
    public void render(){
        this.saldo = this.saldo + (this.saldo*this.rendimento)/100;
    }
}