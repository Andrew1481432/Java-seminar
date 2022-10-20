package practike12.shapes;

import java.awt.*;

public class Round extends Shape{

    public Round() {
        width = height = 100;
        x = 20;
        y = 50;
        color = Color.red;
    }

    public Round(Color c, int x, int y) {
        width = height = 100;
        color = c;
        this.x = x;
        this.y = y;
    }

    @Override
    public void execute(Graphics g) {
        g.setColor(color);
        g.fillOval(x, y, width, height);
    }
}
