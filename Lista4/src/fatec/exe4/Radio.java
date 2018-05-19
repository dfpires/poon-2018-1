package fatec.exe4;
public class Radio extends Produto {
    private String banda;
    private float estacao;
    public Radio() {
        super();
        this.banda = "não definida";
        this.estacao = 0;
    }
    public Radio(int volume, int serie, String banda, float estacao) {
        super(volume, serie);
        this.banda = banda;
        this.estacao = estacao;
    }
    public String getBanda() {
        return banda;
    }
    public void setBanda(String banda) {
        this.banda = banda;
    }
    public float getEstacao() {
        return estacao;
    }
    public void setEstacao(float estacao) {
        this.estacao = estacao;
    }
    @Override
    public String toString() {
        return "Radio{" + "banda=" + banda + ", estacao=" + estacao + 
                super.toString() + '}';
    }
}
