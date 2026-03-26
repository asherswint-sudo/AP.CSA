import java.awt.Graphics;
import java.awt.Color;
import java.awt.Container;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *  Square Rose, a recursive algorithm
 */

public class BoxFractal extends JPanel
{
	private int levels;
	public BoxFractal(int lev)
	{
		levels = lev;
	}
  public void paintComponent(Graphics g)
  {
    super.paintComponent(g);  // Call JPanel's paintComponent method
                              //   to paint the background
    int xCenter = getWidth() / 2;
    int yCenter = getHeight() / 2;
    
    
    int x = xCenter - 243;
    int y = yCenter - 243;
    int width = 486;
    int height = 486;
    
    g.setColor(new Color(20, 70, 50));
    drawAndSplit(g, xCenter, yCenter, 1, width, height);
    
  }
  
  public int [] midpoints(int [] x)
  {
	  int [] m = new int [4];
	  
	  m[0] = (x[0] + x[1])/2;
	  m[1] = (x[1] + x[2])/2;
	  m[2] = (x[2] + x[3])/2;
	  m[3] = (x[3] + x[0])/2;
	  
	  return m;
  }

public void drawAndSplit(Graphics g, int xCenter, int yCenter, int times, int width, int height)
  {
    if (times >= levels || width <= 0 || height <= 0) return;


    int x = xCenter - width/2;
    int y = yCenter - height/2;
    g.fillRect(x, y, width, height);


    int childW = Math.max(1, width / 2);
    int childH = Math.max(1, height / 2);
    int offsetX = width / 4;   
    int offsetY = height / 4;
    drawAndSplit(g, xCenter,yCenter,times + 1, childW, childH);
	
    

	
	
  }
  public static void main(String[] args)
  {
    JFrame window = new JFrame("Fractals");
    window.setBounds(200, 200, 500, 500);
    window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    BoxFractal panel = new BoxFractal(5);
    panel.setBackground(Color.WHITE);
    Container c = window.getContentPane();
    c.add(panel);
    window.setVisible(true);
  }
}