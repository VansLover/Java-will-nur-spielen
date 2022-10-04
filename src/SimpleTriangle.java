public class SimpleTriangle extends GeometricObject{
    public SimpleTriangle(double width, double height, Vertex v);
        super(pos, width, height);
    }

    public SimpleTriangle(double x, double y,double width, double height) {
        super(new Vertex(x, y), width, height);
    }
    @Override public double area() {return}


