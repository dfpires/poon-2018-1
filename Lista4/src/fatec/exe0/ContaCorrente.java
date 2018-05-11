package fatec.exe0;
public class ContaCorrente {
    // visibilidade das variáveis
    // protected -> privada e pública ao mesmo tempo
    // privada (demais classes) pública (subclasses)
    protected String nome;
    protected int nro;
    protected float saldo;
    public ContaCorrente(String nome, int nro, float saldo) {
        this.nome = nome;
        this.nro = nro;
        this.saldo = saldo;
    }
    public ContaCorrente() {
        this.nome = "não definido";
        this.nro = 0;
        this.saldo = 0;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getNro() {
        return nro;
    }
    public void setNro(int nro) {
        this.nro = nro;
    }
    public float getSaldo() {
        return saldo;
    }
    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }
    @Override
    public String toString() {
        return "ContaCorrente{" + "nome=" + nome + ", nro=" + nro + ", saldo=" + saldo + '}';
    }
    
}
