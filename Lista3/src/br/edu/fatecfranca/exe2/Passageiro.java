package br.edu.fatecfranca.exe2;
public class Passageiro {
    private String nome;
    private int poltrona;

    public Passageiro() {
        this.nome = "não definido";
        this.poltrona = 0;
    }

    public Passageiro(String nome, int poltrona) {
        this.nome = nome;
        this.poltrona = poltrona;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getPoltrona() {
        return poltrona;
    }

    public void setPoltrona(int poltrona) {
        this.poltrona = poltrona;
    }

    @Override
    public String toString() {
        return "Passageiro{" + "nome=" + nome + ", poltrona=" + poltrona + '}';
    }
    
}
