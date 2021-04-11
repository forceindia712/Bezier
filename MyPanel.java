import java.awt.*;
import java.util.ArrayList;

import javax.swing.JPanel;

public class MyPanel extends JPanel {
	public MyPanel() {
		setPreferredSize(new Dimension(1000, 1000));
	}

	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		Graphics2D g2d = (Graphics2D) g;

		

		ArrayList<Integer> x = new ArrayList<>();
		ArrayList<Integer> y = new ArrayList<>();
			
		x.add(150);
		x.add(150);
		x.add(400);
		x.add(400);
		y.add(500);
		y.add(100);
		y.add(100);
		y.add(500);
		
		Bezier A = new Bezier(x,y);
		A.paintComponent(g2d);
		
		x.set(0, 166);
		x.set(1, 166);
		x.set(2, 385);
		x.set(3, 385);
		y.set(0, 345);
		y.set(1, 350);
		y.set(2, 350);
		y.set(3, 345);
		
		Bezier B = new Bezier(x,y);
		B.paintComponent(g2d);
		
		x.set(0, 700);
		x.set(1, 950);
		x.set(2, 950);
		x.set(3, 700);
		y.set(0, 500);
		y.set(1, 500);
		y.set(2, 350);
		y.set(3, 350);
		
		Bezier C = new Bezier(x,y);
		C.paintComponent(g2d);
		
		x.set(0, 700);
		x.set(1, 900);
		x.set(2, 900);
		x.set(3, 700);
		y.set(0, 200);
		y.set(1, 200);
		y.set(2, 350);
		y.set(3, 350);
		
		Bezier D = new Bezier(x,y);
		D.paintComponent(g2d);
		
		x.set(0, 700);
		x.set(1, 700);
		x.set(2, 700);
		x.set(3, 700);
		y.set(0, 200);
		y.set(1, 200);
		y.set(2, 500);
		y.set(3, 500);
		
		Bezier E = new Bezier(x,y);
		E.paintComponent(g2d);
	}
}