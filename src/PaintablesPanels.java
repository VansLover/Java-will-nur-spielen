import util.ShowInFrame;
import java.awt.*;
import java.util.*; //* - als Platzhalter
import java.util.List;

public class PaintablesPanels extends SizedPanel {
    List<Paintable> pas;//Spitze-Klammern als genauere Übergabe der Methoden
public PaintablesPanels(List<Paintable> pas) {
    this.pas = pas; //Übergabe der List in den Konstruktor
}
public void paintComponent(java.awt.Graphics g){ //wird alles in einem Fenster ausgeführt (
    for(Paintable pa : pas)//Vor dem Doppelpunkt Variable: PaintablesPanels - pas: alle Variablen
        pa.paintTo(g); //Listenübergabe auf die Pa-Methode paintTo - paintTo als Ausgabe einer Liste; pa. : muss die Methode beinhalten und für die Methode für die Variable aus
}

public static void main(String[] args) {
    List<Paintable> ps = new ArrayList<Paintable>(); //Listenübergabe in der Hauptmethode, Anlegen einer neuen ArrayList
    ps.add(new PaintableOval(100,500,30,50));
    ps.add(new PaintableRectangle(100,50,130,150));

    /*ShowInFrame.show(title:"hello", new PaintablesPanels(pa));*/
}
}
