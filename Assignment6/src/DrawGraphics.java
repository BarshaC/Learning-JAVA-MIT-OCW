import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;

public class DrawGraphics {
    ArrayList<Mover> bouncers = new ArrayList<Mover>();

    /** Initializes this class for drawing. */
    public DrawGraphics() {
    	bouncers.add(new Bouncer(100,170, new Rectangle(15,20,Color.RED)));
    	bouncers.get(0).setMovementVector(3,1);
    	bouncers.add(new Bouncer(100,170, new Rectangle2(10, 20, Color.BLUE)));
    	bouncers.get(1).setMovementVector(1,4);
    	bouncers.add(new Bouncer(120, 100, new Oval(17,19, Color.YELLOW)));
    	bouncers.get(2).setMovementVector(5, 8);
    	//bouncers.add(new Bouncer(10, 170, new String(12,13,Color.PINK)));
    	//bouncers.get(3).setMovementVector(2, 3);
    	bouncers.add(new StraightMover(12,10, new Oval(17,19,Color.PINK)));
    	bouncers.get(3).setMovementVector(3, 5);
    	bouncers.add(new StraightMover(8,10, new Rectangle2(10, 20, Color.BLACK)));
    	bouncers.get(4).setMovementVector(2,3);
    	
        
    }

    /** Draw the contents of the window on surface. */
    public void draw(Graphics surface) {
        for (Mover shape: bouncers){
        	shape.draw(surface);
        }
        	
        	
    }
}
