
package fatec.exe1;


public class Testa {

    public static void mensagem(Animal camaleao){
        System.out.println(camaleao.fala()); // polimorfismo
    }
    public static void main(String[] args) {
       Vaca vaca = new Vaca("Mimosa");
       mensagem(vaca);
       
       Cachorro cachorro = new Cachorro(true, "Totó");
       mensagem(cachorro);
       
       Papagaio papagaio = new Papagaio("Loro", "Palmeiras não tem mundial");
       mensagem(papagaio);
       
       BemTeVi bemtevi = new BemTeVi("Mimosa");
       mensagem(bemtevi);
       
    }
    
}
