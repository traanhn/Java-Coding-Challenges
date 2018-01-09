/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package movingfigure;

import java.awt.Graphics;

/**
 *
 * @author traanh
 */
public class Square extends Figure {
    private int sideLength;
    public Square(int x, int y, int sideLength){
        super(x,y);
        this.sideLength = sideLength;
        
    }
    
    @Override
    public void draw(Graphics graphics) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        graphics.fillRect(super.getX(), super.getY(), this.sideLength, this.sideLength);
    
    }
    
}
