import java.awt.Image;
import java.awt.Toolkit;


public class MyImage {
    private String name; //Speicherung des Dateinamens
    private Image img=null; //Initialisierung mit einer null-Referenz (Objekt ist noch nicht vorhanden, es existiert zwar schon ein Bildobjekt, aber existiert noch nicht) Speicherung der geladenen Bilddatei

public MyImage(String name) {this.name=name;} //Dateiname wird gesetzt, aber das Bildobjekt wird noch nicht geladen

public Image get() {
    if (img == null) //Initialisierung mit einer null-Referenz
        img = Toolkit.getDefaultToolkit().createImage //Toolkit erbittet ein Bild zu erstellen
                (getClass().getClassLoader().getResource(name)); //ruft dazu die Class, den ClassLoader und die jeweilige Resource als Name an
    return img; //Gibt das jeweilige gefundene Bild ab
}
}