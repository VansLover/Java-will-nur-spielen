package util;

import javax.swing.*;
public class ShowInFrame {
    public static void show(String title, JComponent c) {
        JFrame f = new JFrame(title); //Erstellt einen neuen JFrame mit Title
        f.add(c); //fügt ein JFrame hinzu
        f.pack(); //Berechnung der idealen Größe
        f.setVisible(true); //wird sichtbar gemacht
    }
}
