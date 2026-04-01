import java.awt.Graphics;
import java.awt.Color;
import java.awt.Container;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class BoxFractal extends JPanel
{
    private int levels;
    public BoxFractal(int lev)
    {
        levels = lev;
    }
  public void paintComponent(Graphics g)
  {
    super.paintComponent(g);

    int xCenter = getWidth() / 2;
    int yCenter = getHeight() / 2;
    
   
    int x = xCenter - 243;
    int y = yCenter - 243;
    int width = 486;
    int height = 486;

    g.setColor(new Color(20, 70, 50));
    drawAndSplit(g, x, y, width, height, 1);  
  }
  

  public void drawAndSplit(Graphics g, int x, int y, int width, int height, int times)
  {
    
    if (times >= levels) {
      g.fillRect(x, y, width, height);
      return;
    }

    int w = width / 3;
    int h = height / 3;

    drawAndSplit(g, x, y, w, h, times + 1);                  
    drawAndSplit(g, x + 2 * w, y, w, h, times + 1);         
    drawAndSplit(g, x, y + 2 * h, w, h, times + 1);         
    drawAndSplit(g, x + 2 * w, y + 2 * h, w, h, times + 1); 
    drawAndSplit(g, x + w, y + h, w, h, times + 1);         
  }
  public static void main(String[] args)
  {
    JFrame window = new JFrame("Fractals");
    window.setBounds(200, 200, 500, 500);
    window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    BoxFractal panel = new BoxFractal(3);
    panel.setBackground(Color.WHITE);
    Container c = window.getContentPane();
    c.add(panel);
    window.setVisible(true);
  }
}