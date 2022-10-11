import javax.swing.*;

public class Test {
    public static void main(String[] args) {
        Vertex v1 = new Vertex(1.0, 2.0);
        Vertex v2 = new Vertex(42.0, 37.0);
        Vertex v3 = new Vertex (34,2);
        Vertex v4 = new Vertex(42,23);
        System.out.println(v1.length());

        System.out.println(v2.toString());

        System.out.println(v1);
        v1.skalarMult(2);
        System.out.println(v1.length());
        v3 = v1.add(v2); //andere Variable
        System.out.println(v3.length());

        System.out.println(v1.skalarMult(0.8));
        System.out.println(v1);

        v1.skalarMultMod(0.8);
        System.out.println(v1);



        v1 = new Vertex(1.0, 2.0);
        System.out.println(v1.equals(v2));
        System.out.println(v1.equals(v3));
        System.out.println(v1.equals(v4));
        System.out.println(v1.equals(v2));

        GeometricObject g1 = new GeometricObject(v2, 30, 40);
        GeometricObject g2 = new GeometricObject(v2, 30,50);
        GeometricObject jannis = new GeometricObject(12,56,40,60);

        System.out.println(g2);

        JFrame f=new JFrame();
        f.add(new FirstPanel());
        f.setVisible(true);
    }
}

