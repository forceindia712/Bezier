import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.ArrayList;

import javax.swing.JPanel;

public class Bezier extends JPanel {
	
	private ArrayList<Integer> x = new ArrayList<>();
	private ArrayList<Integer> y = new ArrayList<>();
	
	public Bezier(ArrayList<Integer> x, ArrayList<Integer> y)
	{
		this.x = x;
		this.y = y;
	}
	
	protected void paintComponent(Graphics g) 
	{
		super.paintComponent(g);
		Graphics2D g2d = (Graphics2D) g;

		for(double t=0; t<1; t+=0.001)
		{
			double xt = Math.pow((1-t),3)*x.get(0)+3*t*Math.pow((1-t), 2)*x.get(1)+3*Math.pow(t, 2)*(1-t)*x.get(2)+Math.pow(t, 3)*x.get(3);
			double yt = Math.pow((1-t),3)*y.get(0)+3*t*Math.pow((1-t), 2)*y.get(1)+3*Math.pow(t, 2)*(1-t)*y.get(2)+Math.pow(t, 3)*y.get(3);
			int xtt = (int) xt;
			int ytt = (int) yt;
			g2d.drawRect(xtt, ytt, 1, 1);
		}
	
	}
}
