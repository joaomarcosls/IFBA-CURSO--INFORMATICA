import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Desenho extends Applet implements MouseListener {

    private int[] x, y;
    private int clicks;

    @Override
    public void init() {
        clicks = 0;
        x = new int[100];
        y = new int[100];
        addMouseListener(this);
    }

    @Override
    public void paint(Graphics g) {
        if (clicks != 0) {
            if (estaDentro(x[clicks - 1], y[clicks - 1])) {
                g.setColor(Color.blue);
                for (int i = 0; i < clicks - 2; i = i + 1) {
                    g.drawLine(x[i], y[i], x[i + 1], y[i + 1]);
                }
                g.drawLine(x[clicks - 2], y[clicks - 2], x[0], y[0]);
            } else {
                desenhaQuadrado(x[0], y[0], g);
                g.setColor(Color.blue);
                for (int i = 0; i < clicks - 1; i = i + 1) {
                    g.drawLine(x[i], y[i], x[i + 1], y[i + 1]);
                }
            }
        }
    }

    public void desenhaQuadrado(int x, int y, Graphics g) {
        g.setColor(Color.blue);
        g.drawLine(x, y, x, y);
        g.setColor(Color.green);
        g.drawLine(x - 25, y - 25, x + 25, y - 25);
        g.drawLine(x - 25, y - 25, x - 25, y + 25);
        g.drawLine(x - 25, y + 25, x + 25, y + 25);
        g.drawLine(x + 25, y - 25, x + 25, y + 25);
    }

    public boolean estaDentro(int x, int y) {
        if ((Math.abs(x - this.x[0]) <= 25)
                && (Math.abs(y - this.y[0]) <= 25)) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public void mouseClicked(MouseEvent me) {
        x[clicks] = me.getX();
        y[clicks] = me.getY();
        clicks++;
        repaint();
    }

    @Override
    public void mousePressed(MouseEvent me) {
        System.out.println("Entrou em mousePressed");
    }

    @Override
    public void mouseReleased(MouseEvent me) {
        System.out.println("Entrou em mouseReleased");
    }

    @Override
    public void mouseEntered(MouseEvent me) {
        System.out.println("Entrou em mouseEntered");
    }

    @Override
    public void mouseExited(MouseEvent me) {
        System.out.println("Entrou em mouseExited");
    }
}