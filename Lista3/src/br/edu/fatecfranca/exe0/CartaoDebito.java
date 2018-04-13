package br.edu.fatecfranca.exe0;
public class CartaoDebito {
    private int numero, cvv;
    private String validade, nome, bandeira;
    private ContaCorrente contaCorrente; // associação

    public CartaoDebito(int numero, int cvv, String validade, 
            String nome, String bandeira, ContaCorrente contaCorrente) {
        this.numero = numero;
        this.cvv = cvv;
        this.validade = validade;
        this.nome = nome;
        this.bandeira = bandeira;
        this.contaCorrente = contaCorrente; // agregação
    }

    public CartaoDebito() {
    }

    
    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getCvv() {
        return cvv;
    }

    public void setCvv(int cvv) {
        this.cvv = cvv;
    }

    public String getValidade() {
        return validade;
    }

    public void setValidade(String validade) {
        this.validade = validade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getBandeira() {
        return bandeira;
    }

    public void setBandeira(String bandeira) {
        this.bandeira = bandeira;
    }

    public ContaCorrente getContaCorrente() {
        return contaCorrente;
    }

    public void setContaCorrente(ContaCorrente contaCorrente) {
        this.contaCorrente = contaCorrente;
    }

    @Override
    public String toString() {
        return "CartaoDebito{" + "numero=" + numero + ", cvv=" + 
                cvv + ", validade=" + validade + ", nome=" + nome + 
                ", bandeira=" + bandeira + 
                ", contaCorrente=" + contaCorrente + '}';
    }
    
}
