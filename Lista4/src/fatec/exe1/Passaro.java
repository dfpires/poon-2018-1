package fatec.exe1;

public class Passaro extends Animal{
    public Passaro(){
        super();
    }
    public Passaro(String nome){
        super(nome);
    }
    @Override
    public String fala(){
        return "PIU, PIU";
    }
}
