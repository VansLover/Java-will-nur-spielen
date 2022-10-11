import javax.swing.*;
import java.awt.*;
public class FirstPanel {
    @Override
    protected void paintComponent(Graphics g) {
        g.fillRect(30,50,45,80);
    }

    public static void main(String[] args) {
        JFrame f=new JFrame();
        f.add(new FirstPanel());
        f.setVisible(true);
    }
}
