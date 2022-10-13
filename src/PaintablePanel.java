import java.awt.*;

public class PaintablePanel extends SizedPanel {
    Paintable pa;

    public PaintablePanel(Paintable pa) { //Befüllen mit dem, was ich der Methode übergebe
        this.pa = pa;
    }

    @Override
    protected void paintComponent(Graphics g) {
        pa.paintTo(g);
    }
}

