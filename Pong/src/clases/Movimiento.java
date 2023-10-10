package clases;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Movimiento extends KeyAdapter{
	static boolean L, R;
	
	public void keyPressed(KeyEvent e)
	{
	int id = e.getKeyCode();
	if(id == KeyEvent.VK_LEFT)
	{
		L = true;
	}
	if(id == KeyEvent.VK_RIGHT)
	{
		R = true;
	}
	}
	public void keyReleased(KeyEvent e)
	{
	int id = e.getKeyCode();
	if(id == KeyEvent.VK_LEFT)
	{
		L = false;
	}
	if(id == KeyEvent.VK_RIGHT)
	{
		R = false;
	}
	}

}
