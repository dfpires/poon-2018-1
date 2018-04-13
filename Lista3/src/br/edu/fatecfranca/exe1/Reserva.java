package br.edu.fatecfranca.exe1;
public class Reserva {
    private int codigo;
    private Voo voo; // associação

    public Reserva() {
        this.codigo = 0;
        this.voo = new Voo();
    }

    public Reserva(int codigo, Voo voo) {
        this.codigo = codigo;
        this.voo = voo;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public Voo getVoo() {
        return voo;
    }

    public void setVoo(Voo voo) {
        this.voo = voo;
    }

    @Override
    public String toString() {
        return "Reserva{" + "codigo=" + codigo + 
                ", voo=" + voo.toString() + '}';
    }
    
}
