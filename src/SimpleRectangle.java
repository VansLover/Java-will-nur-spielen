public class SimpleRectangle extends GeometricObject { //Vererbung der GeometricObject

    public SimpleRectangle(Vertex v, double width, double height){
        super(pos, width, height); //Überladen des Konstruktors (super Überladen Elternklasse)
    }
    public SimpleRectangle(double x, double y, double width, double height){
        super(new Vertex(x, y), width, height); //Überladen des Konstruktors (this Überladen eigen Klasse)
    }
}
