public class TestTriangle {
    public static void main (String[] args) {
        Vertex v1 = new Vertex(34, 2);

        SimpleTriangle dreieck = new SimpleTriangle(100, v1);
        System.out.println(dreieck);
        System.out.println(dreieck.area());

    }
}
