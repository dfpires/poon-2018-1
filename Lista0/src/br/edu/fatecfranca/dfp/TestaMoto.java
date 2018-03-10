package br.edu.fatecfranca.dfp;

import javax.swing.JOptionPane;

public class TestaMoto {
    public static void main(String[] args) {

           Moto obj1 = new Moto();
           Moto obj2 = new Moto("vermelha", "XLR", 0, false);
           obj2.ligar();
           Moto obj3 = new Moto("branca", "XLR", 0, false);
           obj3.ligar();
           obj2.acelerar(30);
           obj3.acelerar(60);
           JOptionPane.showMessageDialog(null, " Obj3 " + obj3.geraString());
           JOptionPane.showMessageDialog(null, " Obj2 " +  obj2.geraString());
           JOptionPane.showMessageDialog(null, " Obj1 " + obj1.geraString());
           
    }
}
