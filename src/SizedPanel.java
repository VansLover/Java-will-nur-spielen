import javax.swing.*;
import java.awt.Dimension;

import util.ShowInFrame;

public class SizedPanel extends JPanel {
    int prefferedWidth = 400;
    int prefferedHeight = 300;

@Override public Dimension getPrefferedSize() {
        return new Dimension(prefferedWidth, prefferedHeight);
    }

    public SizedPanel(int w, int h) {
        prefferedWidth = w;
        prefferedHeight = h;
    }

    public SizedPanel() {}

    public static void main(String [] args){
        ShowInFrame.show(new SizedPanel());
    }
}




