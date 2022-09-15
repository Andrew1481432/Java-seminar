package practice2;

import practice1.Dog;

public class Ball {

    private double x;
    private double y;

    Ball(double x, double y) {
        this.setXY(x, y);
    }

    Ball() {
        this.setXY(0.0, 0.0);
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public void setXY(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public void move(double xDisp, double yDisp) {
        this.x += xDisp;
        this.y += yDisp;
    }


    @Override
    public String toString() {
        return "Ball@{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
