package practike12.shapes;

import java.awt.*;

public class Rectangle extends Shape {

    public Rectangle() {
        color = Color.blue;
        x = y = width = 100;
        height = width*2;
    }

    public Rectangle(Color c, int x, int y) {
        color = c;
        this.x = x;
        this.y = y;

        width = 100;
        height = width*2;
    }

    @Override
    public void execute(Graphics g) {
        g.setColor(color);
        g.fillRect(x, y, width, height);
    }
}
