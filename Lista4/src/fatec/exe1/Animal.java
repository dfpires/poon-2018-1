package fatec.exe1;
public class Animal {
    protected String nome;
    public Animal() {
    }
    public Animal(String nome) {
        this.nome = nome;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String fala(){
        return "Eu não falo";
    }
    @Override
    public String toString() {
        return "Animal{" + "nome=" + nome + '}';
    }
}
