public class SimpleTriangle extends GeometricObject{
    public SimpleTriangle(double width, Vertex v);
        super(pos, width, Math.sqrt(a:3)/2*width);
    }

    public SimpleTriangle(double x, double y,double width, double height) {
        super(new Vertex(x, y), width, height);
    }
    @Override public double area() {
        return width * height/2;
    }
}

