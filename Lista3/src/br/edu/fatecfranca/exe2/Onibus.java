package br.edu.fatecfranca.exe2;
import java.util.ArrayList;
public class Onibus {
    private String numero;
    private ArrayList<Passageiro> passageiros;

    public Onibus() {
        this.numero = "não definido";
        this.passageiros = new ArrayList();
    }

    public Onibus(String numero, ArrayList<Passageiro> passageiros) {
        this.numero = numero;
        this.passageiros = passageiros;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public ArrayList<Passageiro> getPassageiros() {
        return passageiros;
    }

    public void setPassageiros(ArrayList<Passageiro> passageiros) {
        this.passageiros = passageiros;
    }

    @Override
    public String toString() {
        return "Onibus{" + "numero=" + numero + ", passageiros=" + passageiros + '}';
    }
    public boolean adicionaPassageiro(Passageiro passageiro){
        return this.passageiros.add(passageiro);
    }
    public boolean removePassageiro(Passageiro passageiro){
        return this.passageiros.remove(passageiro);
    }
    public boolean atualizaPassageiro(Passageiro atual, 
            Passageiro novo){
        
        int posicao = this.passageiros.indexOf(atual);
        if (posicao != -1){
            this.passageiros.set(posicao, novo);
            return true;
        }
        else return false;
    }
    public boolean buscaPassageiro(Passageiro passageiro){
        return this.passageiros.contains(passageiro);
    }
    public int buscaPassageiro(int poltrona){
        
    }
}















