package br.edu.fatecfranca.dfp;
public class Moto {
    String cor;
    String modelo;
    float velocidade;
    boolean motor; // ligada ou desligada
    public Moto(){
        this.cor = "";
        this.modelo = "";
        this.velocidade = 0;
        this.motor = false;
    }
    public Moto(String cor, String modelo, float velocidade, boolean motor){
        this.cor = cor;
        this.modelo = modelo;
        this.velocidade = velocidade;
        this.motor = motor;
    }
    public void ligar(){
        this.motor = true;
    }
    public void acelerar(float x){
        this.velocidade += x;
    }
    public String geraString(){
        return "Cor " + this.cor + " Modelo: " + this.modelo +
                " Velocidade " + this.velocidade + 
                " Motor " + this.motor;
    }
}
