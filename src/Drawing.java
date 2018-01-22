//package com.burdbrain.frames;4
//import com.burdbrain.drawings.Drawing;
import java.awt.Graphics;
import javax.swing.JFrame;

public class Drawing {
    public int x = 40, y = 40, width = 40, height = 40;
    
    public void paint(Graphics g) {
        g.drawOval(x, y, width, height);
        
    }
    
}
