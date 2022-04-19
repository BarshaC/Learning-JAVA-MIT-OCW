import java.util.*;
import java.awt.Color;
import java.awt.Graphics;

public class DrawGraphics {
	ArrayList<BouncingBox> boxlist;
	
	/** Initializes this class for drawing. */
	public DrawGraphics() {
		boxlist = new ArrayList<BouncingBox>();
		boxlist.add(new BouncingBox(200,199,Color.GREEN));
		boxlist.add(new BouncingBox(100,50,Color.BLUE));
		boxlist.add(new BouncingBox(50,50,Color.RED));
		boxlist.get(0).setMovementVector(2,3);
		boxlist.get(1).setMovementVector(3,5);
		boxlist.get(2).setMovementVector(5,6);
	}
	/** Draw the contents on the window on surface. Called 20 times per second. */
	public void draw(Graphics surface) {
		surface.drawArc(50,250,250,50,20,90);
		surface.drawOval(200, 250, 50, 50);
		for(int i = 0; i < boxlist.size(); i++) {
			boxlist.get(i).draw(surface);
		}
	}
}
