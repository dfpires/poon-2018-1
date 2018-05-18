package fatec.exe0;
public class ContaEspecial extends ContaCorrente{
    private float limite;
    public ContaEspecial(){
        super();
        this.limite = 0;
    }
    public ContaEspecial(String nome, int nro, float saldo, float limite){
        super(nome, nro, saldo);
        this.limite = limite;
    }
    public float getLimite() {
        return limite;
    }
    public void setLimite(float limite) {
        this.limite = limite;
    }
    @Override
    public String toString() {
        return super.toString() + "ContaEspecial{" + "limite=" + limite + '}';
    }
    public boolean saque(float x){
        if ((this.saldo + this.limite - x) >= 0){
            this.saldo = this.saldo - x;
            return true;
        }
        else return false;
    }






    
}
