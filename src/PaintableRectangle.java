import java.awt.*;
import java.awt.*;
public class PaintableRectangle extends SimpleRectangle implements Paintable {

    public PaintableRectangle(Vertex pos, double width, double height) {

        super(new Vertex(v.x, v.y), width, height);
    }

    public PaintableRectangle(double width, double height, double x, double y) {
        this(new Vertex(x, y), width, height);
    }

    public void paintTo(java.awt.Graphics g) {
        g.setColor(color);
        g.fillRect((int) pos.x, (int) pos.y, (int) width, (int) height);
    }
}
