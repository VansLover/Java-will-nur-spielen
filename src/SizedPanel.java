import javax.swing.*;
import java.awt.*;

public class SizedPanel extends JPanel { //SizedPanel wird als Unterklasse von JPanel definiert
    int preferredWidth = 400; //die bevorzugte Breite entspricht 400
    int preferredHeight = 300; //die bevorzugte Höhe entspricht 300

    public SizedPanel(int w, int h) { //SizedPanel beinhaltet "W" und "H"
        this.preferredWidth = w; //bevorzugte Breite = W
        this.preferredHeight = h; //bevorzugte Höhe = H
    }

    public SizedPanel() { //Standardkonstruktor zur Initialisierung der bevorzugten Größen
    }

    @Override
    public Dimension getPreferredSize() { //Gibt die bevorzugte Größe an, die entsprechenden initialisierten Werte werden implementiert
        return new Dimension(preferredWidth, preferredHeight);
    }
}
