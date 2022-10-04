public class TestTriangle {
    public static void main (String arg[]){
        Vertex v1 = new Vertex(34, 2);

        SimpleTriangle dreieck = new SimpleTriagle(v1, width:100);
        System.out.println(dreieck);
        System.out.println(dreieck.area());

    }
}
