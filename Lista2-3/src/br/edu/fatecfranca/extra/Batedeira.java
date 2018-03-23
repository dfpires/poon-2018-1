package br.edu.fatecfranca.extra;
public class Batedeira {
    private int status, velocidade; // variável de instância
    private static String marca; // variável de classe
    // construtores
    public Batedeira(){
        this.status = 0;
        this.velocidade = 0;
    }
    public Batedeira(int status, int velocidade){
        this.trataStatus(status);
        this.trataVelocidade(velocidade);
    }
    // métodos de instância
    private void trataStatus(int status){
        switch(status){
            case 0: this.status = 0; break;
            case 1: this.status = 1; break;
            default: System.out.println("Status inválido");
        }
    }
    public void setStatus(int status){
        this.trataStatus(status);
    }
    private void trataVelocidade(int velocidade){
          switch(velocidade){
            case 0: this.velocidade = 0; break;
            case 5: this.velocidade = 5; break;
            case 10: this.velocidade = 10; break;
            case 15: this.velocidade = 15; break;
            case 20: this.velocidade = 20; break;
            default: System.out.println("Velocidade inválida");
        }
    }
    public void setVelocidade(int velocidade){
        this.trataVelocidade(velocidade);
    }
    public void desligar(){
        if (this.velocidade == 0){
            this.status = 0;
        }
        else {
            System.out.println("Batedeira não pode ser desligada");
        }
    }
    public void aumentar(int x){
        this.trataVelocidade(this.velocidade + x);
    }
    public int getVelocidade(){
        return this.velocidade;
    }    
    // métodos de classe
    public static Batedeira menor(Batedeira x, Batedeira y){
        if (x.velocidade <= y.velocidade){
            return x;
        }
        else return y;
    }
    
}
