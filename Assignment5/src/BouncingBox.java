import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

public class BouncingBox {
	int x;
	int y;
	Color color;
	int xDirection = 0;
	int yDirection = 0;
	
	final int SIZE = 10;
	/** 
	 * Initialize a new box with its center located at (startX, startY) filled 
	 * with startColor.
	 */
	public BouncingBox(int startX, int startY, Color startColor) {
		x = startX;
		y = startY;
		color = startColor;			
	}
	
	/**Draws the box at its current position on to surface. */
	public void draw(Graphics surface) {
		//Draw object
		surface.setColor(color);
		surface.fillRect(x - SIZE/2, y - SIZE/2, SIZE, SIZE);
		
		//Move the center of the object each time we draw it
		y += xDirection;
		x += yDirection;
		
		// If you have hit the edge and are moving in the wrong direction, reverse direction
		// We check the direction because if a box is placed near the wall, we would get "stuck"
		//rather than moving in the right direction
		
		if ((x - SIZE/2 <= 0 || y-SIZE/2 <= 0 && xDirection <0) || (x + SIZE/2 >= SimpleDraw.WIDTH || y+ SIZE/2 >= SimpleDraw.HEIGHT && xDirection >0)) {
			xDirection = -xDirection;
		}
		if ((x<=0 && xDirection <0) || (x + SIZE/2 >= SimpleDraw.WIDTH || x+ SIZE/2 >= SimpleDraw.HEIGHT && yDirection >0)) {
			yDirection = -yDirection;
		}
		
		//if ((x - SIZE/2 <= 0 || y-SIZE/2 <= 0  && xDirection < 0) || (x+ SIZE/2 >= SimpleDraw.WIDTH || y+SIZE/2 >=SimpleDraw.HEIGHT && xDirection > 0)) {
		//	xDirection = -xDirection;
//			yDirection = -yDirection;
		//}
		//if ((x - SIZE/2 <= 0 || y-SIZE/2 <= 0 && yDirection < 0) || (x+ SIZE/2 >= SimpleDraw.WIDTH || y+ SIZE/2 >= SimpleDraw.HEIGHT && yDirection > 0)) {
//			xDirection = -xDirection;
		//	yDirection = -yDirection;
		//}
	}
	
	public void setMovementVector(int xIncrement, int yIncrement) {
		xDirection = xIncrement;
		yDirection = xIncrement;
	}

}
