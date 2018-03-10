package br.edu.fatecfranca.dfp;

import javax.swing.JOptionPane;

public class Testa {
    public static void main(String[] args) {
          TimeFutebol timao = new TimeFutebol();
          TimeFutebol bambi = new TimeFutebol();
          TimeFutebol porco = new TimeFutebol();
          
          TimeFutebol francana = new TimeFutebol(3,0);
          
          timao.inaugurar();
          bambi.inaugurar();
          porco.inaugurar();
          
          timao.ganharTitulo();
          timao.ganharTitulo();
          porco.ganharTitulo();
          
          timao.iniciarCampeonato();
          bambi.iniciarCampeonato();
          
          String resp = 
JOptionPane.showInputDialog("Quem ganhou? 1 para timao e 2 para bambi");
          if (resp.equals("1")){
              timao.ganhar();
          }
          else {
              bambi.ganhar();
          }

        JOptionPane.showMessageDialog(null, "Timão " + timao.geraString());
        JOptionPane.showMessageDialog(null, "Bambi " + bambi.geraString());
        JOptionPane.showMessageDialog(null, "Porco " +porco.geraString());
    }
}
             