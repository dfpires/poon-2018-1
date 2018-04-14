package br.edu.fatecfranca.composicao;
import java.util.ArrayList;
public class Pedido {
    private String data;
    private float total;
    private int numero;
    private ArrayList<ItemPedido> itens;

    public Pedido() {
        this.itens = new ArrayList();
    }

    public Pedido(String data, float total, int numero) {
        this.data = data;
        this.total = total;
        this.numero = numero;
        this.itens = new ArrayList();
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public float getTotal() {
        return total;
    }

    public void setTotal() {
        this.total = 0;
        this.itens.stream().forEach((x) -> {
            this.total = this.total + x.getQtde()*x.getValor();
        });
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public ArrayList<ItemPedido> getItens() {
        return itens;
    }

    @Override
    public String toString() {
        setTotal();
        return "Pedido{" + "data=" + data + ", total=" + total + ", numero=" + numero + ", itens=" + itens + '}';
    }
    
    public boolean adicionaItem(String descricao, int qtde, float valor){
        return this.itens.add(new ItemPedido(descricao, qtde, valor));
    }
    
    
}
