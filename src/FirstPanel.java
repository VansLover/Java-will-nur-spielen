import javax.swing.*;
import java.awt.color.*;
import java.awt.*;

public class FirstPanel extends JPanel {
    @Override
    protected void paintComponent(Graphics g) {
        g.fillRect(30,50,45,80);
    }

    public static void main(String[] args) {
        /*ShowGraphics graphics = new ShowGraphics();*/
        JFrame f=new JFrame();
        f.add(new FirstPanel());
        f.setVisible(true);
        f.setSize(400,400);
       /* f.add(graphics);*/
    }
    /*static class ShowGraphics extends Color {
        public void paint(Graphics)
    }*/
}
