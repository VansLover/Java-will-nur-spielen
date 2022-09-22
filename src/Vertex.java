public class Vertex {

    public double x;
    public double y; //um von außen daraufzugrifen zu können


    public Vertex(double x, double y) {
        this.x = x; //Operatoren für die Vertex-Klasse (Konstruktor)
        this.y = y;
    }


    public double length() {
        return Math.sqrt(x * x + y * y);
    }


    @Override //Methode gilt als Überschrieben
    public String toString() { //Überschreiben der To-String Methode (mit Return-Wert für x und y)
        return "(" + x + ", " + y + ")";

    public Vertex skalarMult(double s) { //Methodename wird klein geschrieben, wenn mehr wie n Wort, dann weitere Wörter mit Großbuchstabe
        return new Vertex(x*s,y*s);} //double wird genutzt, da man x und y multiplizieren muss (x und y sind schon double) (int kann auch zu einem double conventiert werden)


    public void skalarMultMod(double s) {//void damit es kein Rückgabewert gibt
        this.x=x*s;
        this.y=y*s;
    }

    }
}
