import java.awt.Graphics;
import java.awt.Color;
import java.awt.Container;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 * Square Rose, a recursive algorithm
 */

public class SerpinskisTriangle extends JPanel {
    private int levels;

    public SerpinskisTriangle(int lev) {
        levels = lev;
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g); // Call JPanel's paintComponent method
                                 // to paint the background
        int xCenter = getWidth() / 2;
        int yCenter = getHeight() / 2;

        int x = xCenter - 243;
        int y = yCenter - 243;
        int width = 486;
        int height = 486;

        int[] xcoord = { xCenter - 128, xCenter + 128, xCenter };
        int[] ycoord = { yCenter + 128, yCenter + 128, yCenter - 94 };

        g.setColor(new Color(20, 70, 50));
        drawAndSplit(g, xcoord, ycoord, 1);

    }

    public int[] midpoints(int[] x) {
        int[] m = new int[3];

        m[0] = (x[0] + x[1]) / 2;
        m[1] = (x[1] + x[2]) / 2;
        m[2] = (x[2] + x[0]) / 2;
        return m;
    }

    public void drawAndSplit(Graphics g, int[] x, int[] y, int times) {
        if (times >= levels){
            g.fillPolygon(x, y, 3);
            return;
        }
            
        else {
            g.drawPolygon(x, y, 3);
            int[] x1 = midpoints(x);
            int[] y1 = midpoints(y);
            int[] xA = { x[0], x1[0], x1[2] };
            int[] yA = { y[0], y1[0], y1[2] };

            int[] xB = { x1[0], x[1], x1[1] };
            int[] yB = { y1[0], y[1], y1[1] };

            int[] xC = { x1[2], x1[1], x[2] };
            int[] yC = { y1[2], y1[1], y[2] };
            drawAndSplit(g, xA, yA, times+1);
            drawAndSplit(g, xB, yB, times+1);
            drawAndSplit(g, xC, yC, times+1);
        }

    }

    public static void main(String[] args) {
        JFrame window = new JFrame("Fractals");
        window.setBounds(200, 200, 500, 500);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        SerpinskisTriangle panel = new SerpinskisTriangle(5);
        panel.setBackground(Color.WHITE);
        Container c = window.getContentPane();
        c.add(panel);
        window.setVisible(true);
    }
}