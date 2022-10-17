import java.awt.*;


public class PaintableOval extends SimpleOval implements Paintable{


    public PaintableOval(double x, double y, double width, double height,Color color) {
        super(x, y, width, height,color);
    }
    public PaintableOval(double x, double y, double width, double height) {
        super(x, y, width, height);
    }


    @Override
    public void paintTo(java.awt.Graphics g) { //Anforderung an die Schnittstelle
        g.setColor(color);
        g.fillOval((int) pos.x, (int) pos.y, (int) width, (int) height); //int in () aufgrund fillOval, da pos und height/width Typ double sind (Casten)
    }
}
