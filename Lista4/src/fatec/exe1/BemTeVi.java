package fatec.exe1;
public class BemTeVi extends Passaro{
    public BemTeVi(){
        super();
    }
    public BemTeVi(String nome){
        super(nome);
    }
    @Override
    public String fala(){
        return "Bem-Te-Vi";
    }
}
