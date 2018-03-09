package br.edu.fatecfranca.dfpires.exe3;
public class TestaProduto {
    public static void main(String[] args) {
        Produto prod1 = new Produto();
        prod1.descricao = "bola de basquete";
        prod1.id = 10;
        prod1.qtde = 3;
        prod1.valor = 46.50f;
        prod1.comprar(5);
        prod1.vender(3);
        prod1.subir(32);
        prod1.descer(13);
        
        Produto prod2 = new Produto(11, 5, 8.5f, "peteca");
        prod2.comprar(4);
        prod2.vender(2);
        prod2.subir(10);
        prod2.descer(5);
        
        System.out.println("Produto 1 " + prod1.paraString());
        System.out.println("Produto 2 " + prod2.paraString());
    }
    
}
