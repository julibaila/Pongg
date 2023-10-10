/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

import java.awt.Rectangle;
import java.awt.geom.Rectangle2D;

/**
 *
 * @author Alumno
 */
public class Balon {
    private int x;
    private int y;
    private final int Ancho=15, Alto=15;
    private double dx=1, dy=1;
    
public Balon(int x, int y) {
    this.x = x;
    this.y = y;
}

public Rectangle2D getBalon() {
    return new Rectangle2D.Double(x, y, Ancho, Alto);
}


public void mover(Rectangle limites, boolean colisionp1) {
    x += dx;
    y += dy;
    
    if(colisionp1)
    {
    	dy=-dy;
    	y=400;
    }
    if (x > limites.getMaxX()) {
        dx = -dx;
    }
    if (y > limites.getMaxY()) {
        dy = -dy;
    }
    if (x < 0) {
        dx = -dx;
    }
    if (y < 0) {
        dy = -dy;
    }
}
public void aumentarVelocidad() {
    dx = 1.1;
    dy = 1.1;
}
}
