public class Vertex {

    public double x;
    public double y;

    public Vertex(double x, double y) {
        this.x = x;
        this.y = y;
    }


    public double length() {
        return Math.sqrt(x * x + y * y);
    }


    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }

    public Vertex skalarMult(double s) {
        return new Vertex(x * s, y * s);
    }


    public void skalarMultMod(double s) {
        this.x = x * s;
        this.y = y * s;
    }

    public Vertex add(Vertex v2) {
        return new Vertex(x + v2.x, y + v2.y);
    }


    public void addMod(Vertex v2) {
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
    //dasselbe Werte
    public boolean equals(Object thatObject) {
        if (thatObject instanceof Vertex) {
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
