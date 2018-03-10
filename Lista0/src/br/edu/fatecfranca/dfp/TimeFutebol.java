package br.edu.fatecfranca.dfp;

public class TimeFutebol {
    // variáveis
    int qtdeT;
    int qtdePontos;
    // métodos construtores
    public TimeFutebol(){
    
    }
    public TimeFutebol(int qtdeT, int qtdePontos){
        this.qtdeT= qtdeT;
        this.qtdePontos = qtdePontos;
    }
    // métodos
    public void inaugurar(){
        this.qtdeT = 0;
    }
    public void iniciarCampeonato(){
        this.qtdePontos = 0;
    }
    public void ganhar(){
        this.qtdePontos += 3; // this.qtdePontos = this.qtdePontos + 3
    }
    public void empatar(){
        this.qtdePontos++;
    }
    public void ganharTitulo(){
        this.qtdeT++;
    }
    public String geraString(){
        return "Total de pontos " + this.qtdePontos + 
                  " Total de títulos" + this.qtdeT;
    }
}
