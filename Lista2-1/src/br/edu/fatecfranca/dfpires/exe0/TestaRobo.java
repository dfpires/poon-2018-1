
package br.edu.fatecfranca.dfpires.exe0;

public class TestaRobo {

    public static void main(String[] args) {
        Robo robo1 = new Robo();
        robo1.setVelocidade(1);
        robo1.setMovimento("frente");
        robo1.setMovimento("direita");
        robo1.setVelocidade(2);
        robo1.setVelocidade(3);
        robo1.setMovimento("tras");
        robo1.setVelocidade(0);
        robo1.setMovimento("diagonal");
         robo1.setVelocidade(5);
        System.out.println("Robo 1 - Velocidade" + robo1.getVelocidade() +
                "Movimento " + robo1.getMovimento());
        
        
        Robo robo2 =  new Robo("diagonal", 7);
        
    }
    
}
