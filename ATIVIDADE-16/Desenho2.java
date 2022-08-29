import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

public class Desenho2 extends Applet implements MouseMotionListener {

    private int[] x, y, cor;
    private int clicks;

    @Override
    public void init() {
        clicks = 0;
        x = new int[10000];
        y = new int[10000];
        cor = new int[10000];
        addMouseMotionListener(this);
    }

    @Override
    public void paint(Graphics g) {
        for (int i = 0; i < clicks; i++) {
            g.drawLine(x[i], y[i], x[i++], y[i]);
            if (cor[i] ==0){
                g.setColor(Color.blue);
            }
            else{
                g.setColor(Color.red);
            }
                
        }
    }

    @Override
    public void mouseDragged(MouseEvent e) {
      
        x[clicks] = e.getX();
        y[clicks] = e .getY();
        cor[clicks]=0;
        clicks++;
        repaint();
    }

    @Override
    public void mouseMoved(MouseEvent e) {
       
        x[clicks] = e.getX();
        y[clicks] = e .getY();
          cor[clicks]=1;
        clicks++;
        repaint();
    }
}