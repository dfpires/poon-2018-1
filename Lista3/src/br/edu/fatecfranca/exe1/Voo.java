package br.edu.fatecfranca.exe1;
public class Voo {
    private String numero, destino;

    public Voo() {
         this.numero = "não informado";
        this.destino = "não informado";
    }

    public Voo(String numero, String destino) {
        this.numero = numero;
        this.destino = destino;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    @Override
    public String toString() {
        return "Voo{" + "numero=" + numero + ", destino=" + destino + '}';
    }
    
}
