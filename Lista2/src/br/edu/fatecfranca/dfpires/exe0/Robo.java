package br.edu.fatecfranca.dfpires.exe0;
public class Robo {
    private String movimento; 
    private int velocidade;
    
    public Robo(){
        this.movimento = "parado";
        this.velocidade = 0;
    }
    
    public Robo(String movimento, int velocidade){
        this.trataMovimento(movimento);
        this.trataVelocidade(velocidade);
    }
    
    public int getVelocidade(){
        return this.velocidade;
    }
    
    private void trataMovimento(String movimento){
     switch(movimento){
             case "direita": this.movimento = movimento;
                            System.out.println("Movimento válido");
                            break;
             case "esquerda": this.movimento = movimento;
                            System.out.println("Movimento válido");
                            break;
             case "frente": this.movimento = movimento;
                            System.out.println("Movimento válido");
                            break;
             case "tras": this.movimento = movimento;
                            System.out.println("Movimento válido");
                            break;
             case "parado": this.movimento = movimento;
                            System.out.println("Movimento válido");
                            break;
             default: System.out.println("Movimento inválido");
         }
    }
     public void setMovimento(String movimento){
        trataMovimento(movimento);
    }
     public String getMovimento(){
         return this.movimento;
     }
     private void trataVelocidade(int velocidade){
         if ((velocidade >=0) && (velocidade <= 3)){
            this.velocidade = velocidade;
            if (velocidade == 0){
                setMovimento("parado");
            }
            System.out.println("Velocidade alterada");
        }
         else {
             System.out.println("Velocidade não permitida");
         }    
     }
     public void setVelocidade(int velocidade){
         trataVelocidade(velocidade);
     }
}
