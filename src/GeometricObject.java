import java.awt.color.*;
import java.awt.*;
public class GeometricObject {
    public Vertex pos; //Position des GeometricObject als Vertex
    public double width; //Width des GeometricObject als double
    public double height; //Height des GeometricObject als double
    public Color color;

public GeometricObject(Vertex pos, double width, double height, Color color) { //Konstruktor zur Erzeugung von Objekten einer Klasse aus den Teilinformationen
    this.pos = pos; //Normalisierung der Daten (damit es keine negativen Startwerte gab)
    this.width = width; //Normalisierung der Daten (damit es keine negativen Startwerte gab)
    this.height = height; //Normalisierung der Daten (damit es keine negativen Startwerte gab)
    this.color=color;

    if (width < 0) { //wenn die Width weniger 0 entspricht, dann als -Parameter
        this.width = -width;
    }

    if (height < 0) { //wenn die Height weniger 0 entspricht, dann als -Parameter
        this.height = -height;
    }

    if (pos.x < 0) { //wenn die Pos.x weniger 0 entspricht, dann als -Parameter
        this.pos.x = -pos.x;
    }

    if (pos.y < 0) { //wenn die Pos.y weniger 0 entspricht, dann als -Parameter
        this.pos.y = -pos.y;
    }
}
    public GeometricObject(Vertex pos, double width, double height) {
        this(pos, width, height, new Color(150,0,128));
    }
    public GeometricObject(double x, double y, double width, double height) {
        this(new Vertex(x, y), width, height); //Überladen des Konstruktors, damit Objekte am Ursprung geladen werden und nicht jeweils per newVertex(0,0) geladen werden müssen
    }

    public GeometricObject(double width, double height) {
        this(0, 0, width, height); //Überladen des Konstruktors, damit Objekte am Ursprung geladen werden und nicht jeweils per newVertex(0,0) geladen werden müssen
    }

    public GeometricObject(double length) {
        this(0, 0, length, length); //Überladen des Konstruktors, damit Objekte am Ursprung geladen werden und nicht jeweils per newVertex(0,0) geladen werden müssen
    }

    public GeometricObject() {
        this(0, 0, 10, 10); //Überladen des Konstruktors, damit Objekte am Ursprung geladen werden und nicht jeweils per newVertex(0,0) geladen werden müssen
    }
  public double circumference() { //Berechnung des Umfangs
      return 2 * (width + height); //Rückgabe 2 * (Breite+Höhe)
  }

  public double area() { //Berechnung des Flächeninhalts
      return width * height; //Rückgabe Breite * Höhe
  }

  public boolean contains(Vertex v) { //Überprüfen, ob das Vertex V sich im GeometricObject befindet
      return v.x >= pos.x && v.x <= this.pos.x+width //Rückgabe: Vertex.v größer/gleich die X-Position UND ob diese kleiner gleich der X-Position + Breite entspricht, x is within
            && v.y >= pos.y && v.y <= pos.y + height; //Rückgabe: Vertex.v größer/gleich die Y-Position UND ob diese kleiner gleich der Y-Position + Höhe entspricht, y is within
    }

  public boolean isLargerThan(GeometricObject g){ //True or False, ob das Object einen größeren Flächeninhalt als das übergebene Objekt hat
      return this.area() >g.area(); //Rückgabe: Flächeninhalt des Objects kleiner die des übergebenen Objects
  }

  public void moveTo(Vertex v1){ //Verschiebung des Eckpunkts
   this.pos=v1;
}
  public void moveTo(double x, double y){ //Überladen der moveTo-Methode mit Koordinaten des neuen Eckpunkts
    moveTo(new Vertex(x,y)); //Verschiebe das Object um die Koordinaten als Vertex

 }
  public void move(Vertex v1){ //Keine absolute ,sondern relative Verschiebung des Objects
    moveTo(this.pos.add(v1)); //Berechnung des neuen Eckpunkts
}
public Vertex getPos() { //Ruft den Wert der Position auf
    return pos;
    } //Objekt sollte selbst die Werte aufrufen können, deshalb kommt nichts in die Parameter-Klammern
public void setPos(Vertex pos) { //Setzt den Wert der Position
    this.pos = pos;
    } //Objekt sollte selbst die Werte aufrufen können, deshalb kommt nichts in die Parameter-Klammern

public double getWidth() { //Ruft den Wert der Breite auf
    return width;
    } //Objekt sollte selbst die Werte aufrufen können, deshalb kommt nichts in die Parameter-Klammern

public void setWidth(double width) { //Setzt den Wert der Breite
    this.width = width;
    } //Objekt sollte selbst die Werte aufrufen können, deshalb kommt nichts in die Parameter-Klammern

public double getHeight() { //Ruft den Wert der Höhe auf
    return height;
    } //Objekt sollte selbst die Werte aufrufen können, deshalb kommt nichts in die Parameter-Klammern

public void setHeight(double height) { //Setzt den Wert der Höhe
    this.height = height;
    } //Objekt sollte selbst die Werte aufrufen können, deshalb kommt nichts in die Parameter-Klammern

  public boolean equals(Object thatObject){
    if (thatObject instanceof GeometricObject) {
     GeometricObject that = (GeometricObject) thatObject;
     return that.width==this.width  && this.height==that.height
      && this.pos.equals(that.pos);
     }
    return false;
    }
  public boolean contains(GeometricObject g) {
     return g.pos.x <= pos.x + width && g.pos.x + g.width >= pos.x && g.pos.y <= pos.y + height
              && g.pos.y + g.height >= pos.y;
      }
  public String toString(){
     return "width= "+width+", height= "+height+", pos= "+pos; //textuelle Darstellung als Rückgabe der Werte als "width" und "height" und "pos"
    }


}