package br.edu.fatecfranca.exe1;
public class Cliente {
    private String nroConta, nroAgencia, nome;
    private float saldo;
    public Cliente(){
        this.nome = "sem nome"; this.nroAgencia = "0000-0";
        this.nroConta = "000000-0";this.saldo = 0;
    }
    public Cliente(String nroConta, String nroAgencia, String nome,
            float saldo){
        trataNome(nome);
        this.saldo = saldo;
        trataNroConta(nroConta);
        trataNroAgencia(nroAgencia);
    }
    private void trataNroConta(String nroConta){
        if ((nroConta.length() == 8) && (nroConta.charAt(6) == '-')){
            this.nroConta = nroConta;
        }
        else System.out.println("Conta inválida " + this.nome);
    }
    public void setNroConta(String nroConta){
        trataNroConta(nroConta);
    }
    private void trataNroAgencia(String nroAgencia){
        if ((nroAgencia.length() == 6) && (nroAgencia.charAt(4) == '-')){
            this.nroAgencia = nroAgencia;
        }
        else System.out.println("agência inválida " + this.nome);
    }
    public void setNroAgencia(String nroAgencia){
        trataNroAgencia(nroAgencia);
    }
    private void trataNome(String nome){
        if ((nome.length() < 30)){
            this.nome = nome;
        }
        else System.out.println("Nome inválido");
    }
    public void setNome(String nome){
        trataNome(nome);
    }
    public String getNroConta(){
        return this.nroConta;
    }
    public String getNroAgencia(){
        return this.nroAgencia;
    }
    public String getNome(){
        return this.nome;
    }
    public float getSaldo(){
        return this.saldo;
    }
    public void setSaldo(float saldo){
        this.saldo = saldo;
    }
    public void depositar(float x){
        this.saldo += x; // this.saldo = this.saldo + x; 
    }
    public void sacar(float x){
        this.saldo -= x; // this.saldo = this.saldo - x; 
    }
    public String paraString(){
        return "Nome: " + this.nome + " Agência: " + this.nroAgencia + 
               " Conta: " +  this.nroConta + " Saldo: " + this.saldo;
    }
}
