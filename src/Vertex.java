public class Vertex {

    public double x; //Felddefinition für x (double typ)
    public double y; //Felddefinition für y (double typ)

    public Vertex(double x, double y) { //Konstruktor zur Erzeugung von Objekten einer Klasse aus den Teilinformationen
        this.x = x;
        this.y = y;
    }


    public double length() {
        return Math.sqrt(x * x + y * y); //Berechnung der Länge (Rückgabewert)
    }


    @Override
    public String toString() {
        return "(" + x + ", " + y + ")"; //textuelle Darstellung als Rückgabe der Werte als "x" und "y"
    }

    public Vertex skalarMult(double s) { //mit Ergebnisrückgabe und Objektveränderung
        return new Vertex(x * s, y * s); //Multiplikation der Koordinaten mit double s, um ein Vertex als Ergebnistyp zu erhalten
    }


    public void skalarMultMod(double s) { //Methode ohne Rückgabe aufgrund "void" und Objektveränderung
        this.x = x * s; //Definition einer Variante der Multiplikation mit einem Skalar ohne neue Vertex-Objekt Erzeugung
        this.y = y * s;
    }

    public Vertex add(Vertex v2) { //Addition mit Rückgabe eines neuen Vertex
        return new Vertex(x + v2.x, y + v2.y); //Addition zweier Punkte für "x" und "y"
    }


    public void addMod(Vertex v2) { //Methode ist vor dem Aufrufen einer mod-Methode nicht mehr dasselbe wie nachdem dem Aufruf
        this.x = x + v2.x;
        }
    public double getX() {return x;} //Objekt sollte selbst die Werte aufrufen können, deshalb nichts in die Paramter_Klammern
    public double getY() {return y;}

    public void setX(double x){
            this.x = x;
    }
    public void setY(double y){
            this.y = y;
        }
    }


    //dasselbe-Werte
    public boolean equals(Object thatObject) { //Überprüft, ob Object mit thatObject übereinstimmt
        if (thatObject instanceof Vertex) { //Vergleich, ob thatObject einem Vertex entspricht
            Vertex that = (Vertex) thatObject; //Casten von Variablen, damit es ein Vertex wird
            return this.x == that.x && this.y == that.y; //Vergleich der this.x und this.y (ist ein primitiver Datentyp)
        }
        return false;
    }
    public void Vertex sub(Vertex that) {
        return new Vertex (x - v2.x, y - v2.y); }

    public double distance(Vertex v2) {
        double a = v2.x - this.x;
        double b = v2.y - this.y;

        return Math.sqrt //Fortsetzung

    public Vertex add(Vertex v2) {
    }
}
