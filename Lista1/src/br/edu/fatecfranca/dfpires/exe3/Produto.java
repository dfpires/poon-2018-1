package br.edu.fatecfranca.dfpires.exe3;
public class Produto {
    public int id, qtde;
    public String descricao;
    public float valor;
    // construtor
    public Produto(){
        this.id = 0;
        this.descricao = "sem descrição";
        this.valor = 0;
        this.qtde = 0;
    }
     public Produto(int id, int qtde, float valor, String descricao){
        this.id = id;
        this.descricao = descricao;
        this.valor = valor;
        this.qtde = qtde;
    }
    public Produto(int id, int qtde, String descricao){
        this.id = id;
        this.descricao = descricao;
        this.valor = 0;
        this.qtde = qtde;
    } 
    public void comprar(int x){
        this.qtde = this.qtde + x;
    }
    public void vender(int x){
        this.qtde = this.qtde - x;
    }
    public void subir(float x){
        this.valor = this.valor + x;
    }
    public void descer(float x){
        this.valor = this.valor - x;
    }
    public String paraString(){
        return " Id " + this.id + " Descrição " + 
                this.descricao + " Qtde " + this.qtde + 
                " Valor " +  this.valor;
    }
}
