package br.edu.fatecfranca.exe0;
public class ContaCorrente {
    private String agencia, conta;
    private float saldo;

    public ContaCorrente() {
    }

    public ContaCorrente(String agencia, String conta, float saldo) {
        this.agencia = agencia;
        this.conta = conta;
        this.saldo = saldo;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public String getConta() {
        return conta;
    }

    public void setConta(String conta) {
        this.conta = conta;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "ContaCorrente{" + "agencia=" + agencia + ", conta=" + conta + ", saldo=" + saldo + '}';
    }
    
}
