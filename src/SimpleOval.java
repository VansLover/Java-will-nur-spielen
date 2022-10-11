public class SimpleOval extends GeometricObject{
    public SimpleOval(Vertex pos, double width, double height) {
        super(pos,width, height);
    }
    public SimpleOval(double x, double y,double width, double height) {
        super(new Vertex(x, y), width, height);
    }
    @Override
    public double area() {
        return Math.PI * width * height / 4;} //Annotation, Compiler überprüft, ob tatsächlich die geerbte Methode überschrieben wurde
    @Override
    public String toString() { //Überprüfung, ob die überschriebene geerbte Methode erledigt, was von der neuen Version verlangt wird
        return "SimpleOval("+super.toString()+")"; //Bezeichnung der Eigenschaft der Oberklasse, super.toString Ergebnis asu der geerbten toString
    }
    @Override
    public  boolean equals(Object thatObject) { //Überschreibung der SimpleOval Methode
        return (thatObject instanceof SimpleOval) && super.equals(thatObject);
    }
}
