import util.ShowInFrame;
import java.awt.*;

public class PaintablePanel extends SizedPanel {
    Paintable pa;

    public PaintablePanel(Paintable pa){
        this.pa=pa;
    };//Befüllen mit dem, was ich übergebe

public void paintComponenent(Graphics g) {

    pa.paintTo(g);
}

public static void main(String[] args) {
    ShowInFrame.show(new PaintablePanel(new PaintableOval(100,50,30,50)));

}
}

