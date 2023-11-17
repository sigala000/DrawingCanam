package drawGraphics;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;

public class Rectanglar extends Shape {
	
	private static final long serialVersionUID = 42L;
	
	public Rectanglar(Rectangle rect, Color color, boolean isSolid) {
		super(rect, color, isSolid);
	}
	
	public void draw (Graphics g) {
		g.setColor(color);
		int x = super.x;
		int y = super.y;
		int width = super.width;
		int height = super.height;
		if (getSolid())
			g.fillRect(x, y, width, height);
		else 
			g.drawRect(x, y, width, height);
	}

}
