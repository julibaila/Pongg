package clases;

import java.awt.Rectangle;
import java.awt.geom.Rectangle2D;

public class Paleta {
	private int x, y;
	static final int Ancho=100, Alto=20;
	
	public Paleta(int x, int y)
	{
		this.x=x;
		this.y=y;
	}
	public Rectangle2D getPaleta()
	{
		return new Rectangle2D.Double(x,y,Ancho,Alto);
	}
	public void mover_raqueta(Rectangle limites)
	{
	    if (Movimiento.R && x < limites.getMaxX() - Ancho) {
	        x++;
	    }
	    if (Movimiento.L && x > limites.getMinX()) {
	        x--;
	    }
	}

}
