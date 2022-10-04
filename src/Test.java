public class Test {
    public static void main(String[] args) {
        Vertex v1 = new Vertex(1.0, 2.0);
        Vertex v2 = new Vertex(42.0, 37.0);
        Vertex v3 = new Vertex (34,2);
        Vertex v4 = new Vertex(42,23);
        System.out.println(v1.length());

        System.out.println(v2.toString());

        System.out.println(v1);
        v1.skalar(2);
        System.out.println(v1.length());
        v3 = v1.add(v2); //andere Variable
        System.out.println(v3.length());

        System.out.println(v1.skalarMult(0.8));
        System.out.println(v1);

        v1.skalarMultMod(0.8);
        System.out.println(v1)



        Vertex v1 = new Vertex(1.0, 2.0);
        System.out.println(v1.equals(v2));
        System.out.println(v1.equals(v3));
        System.out.println(v1.equals(v4));
        System.out.println(v1.equals(v2));

        GeometricObject g1 = new GeometricObject(v2, width: 30, height: 40);
        GeometricObject g2 = new GeometricObject(v2, width: 30, height: 50);
        GeometricObject jannis = new GeometricObject(x:12, y:56, width:40, height: 60);

        System.out.println(g2);


    }
}

