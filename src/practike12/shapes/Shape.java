package practike12.shapes;

import java.awt.*;

abstract public class Shape {
    protected int width;
    protected int height;

    protected int x;
    protected int y;

    protected Color color;

    public abstract void execute(Graphics g);
}
