import javax.swing.*;
import java.awt.color.*;
import java.awt.*;

public class FirstPanel extends JPanel { //FirstPanel wird als Unterklasse von JPanel definiert
    @Override
    protected void paintComponent(Graphics g) {
        g.fillRect(30,50,45,80); //FirstPanel füllt das Component mit den jeweiligen Koordinaten
    }

    public static void main(String[] args) {
        /*ShowGraphics graphics = new ShowGraphics();*/
        JFrame f=new JFrame(); //der JFrame wird immer neu erstellt
        f.add(new FirstPanel()); //JFrame wird zum FirstPanel hinzugefügt
        f.setVisible(true); //macht das FirstPanel sichtbar
        f.setSize(400,400); //setzt eine Größe für das FirstPanel
       /* f.add(graphics);*/
    }
    /*static class ShowGraphics extends Color {
        public void paint(Graphics)
    }*/
}
