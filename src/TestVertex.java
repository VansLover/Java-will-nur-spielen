import javax.swing.*;

public class TestVertex {
    public static void main(String[] args) {
        Vertex v1 = new Vertex(17.0, 4.0); //Erstellen eines Vertex V1 mit gegebenen Koordinaten
        Vertex v2 = new Vertex(42.0, 37.0); //Erstellen eines Vertex V2 mit gegebenen Koordinaten
        Vertex v3 = new Vertex (34.0,2.0); //Erstellen eines Vertex V3 mit gegebenen Koordinaten
        Vertex v4 = new Vertex(42,23); //Erstellen eines Vertex V4 mit gegebenen Koordinaten
        System.out.println(v1.length()); //Ausgabe der Vertex-Länge von V1

        System.out.println(v2.toString()); //Ausgabe von V2 als toString (textuelle Darstellung mit Koordinaten)

        System.out.println(v1); //Ausgabe des Vertex V1
        v1.skalarMult(2); //Ausgabe von V1 um den Faktor S=2 multipliziert
        System.out.println(v1.length()); //Ausgabe der Vertex-Länge von V1
        v3 = v1.add(v2); //Erzeugung von V3 aus der Addition von V1 und V2
        System.out.println(v3.length()); //Ausgabe der Vertex-Länge von V3

        System.out.println(v1.skalarMult(0.8)); //Ausgabe von V1 um den Faktor S=0.8 multipliziert
        System.out.println(v1); //Ausgabe des Vertex V1

        v1.skalarMultMod(0.8); //Ausgabe von V1 um den Faktor S=0.8 multipliziert (ohne Ausgabewert - Erzeugung eines neuen Vertex)
        System.out.println(v1); //Ausgabe des Vertex V1



        v1 = new Vertex(1.0, 2.0); //Erstellen eines Vertex V1 mit gegebenen Koordinaten
        System.out.println(v1.equals(v2)); //Ausgabe, ob V1 mit V2 übereinstimmt
        System.out.println(v1.equals(v3)); //Ausgabe, ob V1 mit V3 übereinstimmt
        System.out.println(v1.equals(v4)); //Ausgabe, ob V1 mit V4 übereinstimmt
        System.out.println(v1.equals(v2)); //Ausgabe, ob V1 mit V2 übereinstimmt

        GeometricObject g1 = new GeometricObject(v2, 30, 40); //Erstellen eines GeometricObject g1 mit gegebenen Parameter "width" und "height"
        GeometricObject g2 = new GeometricObject(v2, 30,50); //Erstellen eines GeometricObject g2 mit gegebenen Parameter "width" und "height"
        GeometricObject jannis = new GeometricObject(12,56,40,60); //Erstellen eines GeometricObject jannis mit gegebenen Parameter "width" und "height"

        System.out.println(g2); //Ausgabe des GeometricObject G2

        JFrame f=new JFrame();
        f.add(new FirstPanel());
        f.setVisible(true);
    }
}

