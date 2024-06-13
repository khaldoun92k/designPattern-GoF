package gof.structural.flyweight;

import java.awt.*;
//Flyweight Interface
public interface Shape {
    public void draw(Graphics g, int x, int y, int width, int height,
                     Color color);
}
