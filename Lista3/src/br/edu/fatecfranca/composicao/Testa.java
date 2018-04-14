
package br.edu.fatecfranca.composicao;


public class Testa {

   
    public static void main(String[] args) {
        Pedido pedido1 = new Pedido();
        pedido1.setData("13/04/2018");
        pedido1.setNumero(1234);
        pedido1.adicionaItem("xbox one", 1, 1300);
        pedido1.adicionaItem("ps4", 1, 1800);
        pedido1.adicionaItem("TV LED 45", 1, 2500);
        System.out.println(pedido1.toString());
    }
    
}
