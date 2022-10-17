import java.awt.*;

public class SimpleOval extends GeometricObject{ //SimpleOval wird von der Klasse GeometricObject als Unterklasse definiert
    public SimpleOval(Vertex pos, double width, double height,Color color) {
        super(pos,width, height,color); //Konstruktor der Unterklasse (Definition der koordinierten Weise)
    }
    public SimpleOval(Vertex pos, double width, double height) {
        super(pos, width, height);
    }
    public SimpleOval(double x, double y,double width, double height,Color color) {
        super(new Vertex(x, y), width, height,color);
    }
    public SimpleOval(double x, double y, double width, double height) {
        super(new Vertex(x, y), width, height);
    }
    @Override
    public double area() { //Berechnung der Fläche
        return Math.PI * width * height / 4;} //Annotation, Compiler überprüft, ob tatsächlich die geerbte Methode überschrieben wurde
    @Override
    public String toString() { //Überprüfung, ob die überschriebene geerbte Methode erledigt, was von der neuen Version verlangt wird
        return "SimpleOval:" + super.toString(); //Bezeichnung der Eigenschaft der Oberklasse, super.toString Ergebnis asu der geerbten toString
    }
    @Override
    public  boolean equals(Object thatObject) { //Überschreibung der SimpleOval Methode
        return (thatObject instanceof SimpleOval) && super.equals(thatObject); //Überprüft, ob thatOval SimpleOval entspricht und ob es sich gleicht
    }
}
