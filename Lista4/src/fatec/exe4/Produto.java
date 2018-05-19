package fatec.exe4;

import java.util.Random;

public class Produto {
    protected int serial, volume;
    protected String teste;
    public Produto() {
        this.serial = 0;
        this.volume = 0;
        this.teste = "não testado";
    }
    public Produto(int serial, int volume) {
        this.serial = serial;
        this.volume = volume;
        this.teste = "não testado";
    }
    public int getSerial() {
        return serial;
    }
    public void setSerial(int serial) {
        this.serial = serial;
    }
    public int getVolume() {
        return volume;
    }
    public void setVolume(int volume) {
        this.volume = volume;
    }
    public String getTeste() {
        return teste;
    }
    public void setTeste(String teste) {
        this.teste = teste;
    }
    @Override
    public String toString() {
        return "Produto{" + "serial=" + serial + ", volume=" + volume + ", teste=" + teste + '}';
    }
    public boolean testaUnidade(){
        if (this.teste.equals("não testado")){
            Random random = new Random();
            int x = random.nextInt(10);
            if (x < 9){
                this.teste = "aprovado";
                return true;
            }
            else {
                this.teste = "reprovado";
                return false;
            }
        }
        else return false;
    }
}
