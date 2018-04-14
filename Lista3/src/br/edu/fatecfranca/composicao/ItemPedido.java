package br.edu.fatecfranca.composicao;
public class ItemPedido {
    private String descricao;
    private int qtde;
    private float valor;

    public ItemPedido() {
    }

    public ItemPedido(String descricao, int qtde, float valor) {
        this.descricao = descricao;
        this.qtde = qtde;
        this.valor = valor;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getQtde() {
        return qtde;
    }

    public void setQtde(int qtde) {
        this.qtde = qtde;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "ItemPedido{" + "descricao=" + descricao + ", qtde=" + qtde + ", valor=" + valor + '}';
    }
    
}
