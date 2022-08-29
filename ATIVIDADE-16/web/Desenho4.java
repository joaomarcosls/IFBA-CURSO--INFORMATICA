import java.applet.Applet;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;


public class Desenho4 extends Applet implements MouseMotionListener {

    private int[] x, y;
    private int clicks;

    public void init() {
        clicks = 0;
        x = new int[10000];
        y = new int[10000];
        addMouseListener(this);
    }

    public void paint(Graphics g) {
        for (int i = 0; i < clicks; i++) {
            g.drawLine(x[i], y[i], x[i++], y[i]);
        }
    }

    public void mouseClicked(MouseEvent me) {
       System.out.println("Entrou em mouseClicked");
    }

    public void mousePressed(MouseEvent me) {
        x[clicks] = me.getX();
        y[clicks] = me.getY();
        clicks++;
        repaint();
        System.out.println("Entrou em mousePressed");
    }

    public void mouseReleased(MouseEvent me) {
        System.out.println("Entrou em mouseReleased");
    }

    public void mouseEntered(MouseEvent me) {
        System.out.println("Entrou em mouseEntered");
    }

    public void mouseExited(MouseEvent me) {
        System.out.println("Entrou em mouseExited");
    }
}