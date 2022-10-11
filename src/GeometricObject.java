public class GeometricObject {
    Vertex pos;
    double width;
    double height;

public GeometricObject(Vertex pos, double width, double height) {
    this.pos = pos;
    this.width = width;
    this.height = height;

    if (width < 0) {
        this.width = -width;
    }

    if (height < 0) {
        this.height = -height;
    }

    if (pos.x < 0) {
        this.pos.x = pos.x;
    }

    if (pos.y < 0) {
        this.pos.y = -pos.y;
    }
}
    public GeometricObject(double x, double y, double width, double height) {
        this(new Vertex(x, y), width, height);
    }

    public GeometricObject(double width, double height) {
        this(0, 0, width, height);
    }

    public GeometricObject(double length) {
        this(0, 0, length, length);
    }

    public GeometricObject() {
        this(0, 0, 10, 10);
    }
  public double circumference() {
      return 2 * (width + height);
  }

  public double area() {
      return width * height;
  }

  public boolean contains(Vertex v) {
      return v.x >= pos.x && v.x <= this.pos.x+width //x is within
            && v.y >= pos.y && v.y <= pos.y + height; //y is within
    }

  public boolean isLargerThan(GeometricObject g){
      return this.area() >g.area();
  }

  public void moveTo(Vertex v1){
   this.pos=v1;
}
  public void moveTo(double x, double y){
    moveTo(new Vertex(x,y));

 }
  public void move(Vertex v1){
    moveTo(this.pos.add(v1));
}
public Vertex getPos() {
    return pos;
    }
public void setPos(Vertex pos) {
    this.pos = pos;
    }

public double getWidth() {
    return width;
    }

public void setWidth(double width) {
    this.width = width;
    }

public double getHeight() {
    return height;
    }

public void setHeight(double height) {
    this.height = height;
    }

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
        return "width= "+width+", height= "+height+", pos= "+pos;
    }
}