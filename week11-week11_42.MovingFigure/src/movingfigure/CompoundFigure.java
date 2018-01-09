/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package movingfigure;

import java.awt.Graphics;
import java.util.ArrayList;

/**
 *
 * @author traanh
 */
public class CompoundFigure extends Figure {
    
    private ArrayList<Figure> figures;
    
    public CompoundFigure(){
        this.figures = new ArrayList<Figure>();
    }
    public void add(Figure f){
        this.figures.add(f);
        
    }
    
    
    @Override
    public void draw(Graphics graphics) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        for(Figure f : this.figures){
            f.draw(graphics);
        }
    
    }
    
    @Override
    public void move(int dx, int dy){
        for(Figure f : this.figures){
            f.move(dx, dy);
        }
    }
    
    
    
}
