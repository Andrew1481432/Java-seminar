package practike3.movable;

import java.util.Objects;

public class MovablePoint implements Movable{
    int x,y,xSpeed, ySpeed;
    public MovablePoint(int x, int y, int xSpeed, int ySpeed){
        this.x=x;
        this.y=y;
        this.xSpeed = Math.abs(xSpeed);
        this.ySpeed = Math.abs(ySpeed);
    }

    @Override
    public void moveUp() {
        y+=ySpeed;
    }

    @Override
    public void moveDown() {
        y-=ySpeed;
    }

    @Override
    public void moveLeft() {
        x-=xSpeed;
    }

    @Override
    public void moveRight() {
        x+=xSpeed;
    }

    @Override

    public String toString() {
        return "MovablePoint{" +
                "x=" + x +
                ", y=" + y +
                ", xSpeed=" + xSpeed +
                ", ySpeed=" + ySpeed +
                '}';
    }
    @Override
    public boolean equals(Object o){
        if (this==o) return true;
        if (o==null||getClass()!=o.getClass()) return false;
        MovablePoint that = (MovablePoint) o;
        return xSpeed == that.xSpeed &&
                ySpeed == that.ySpeed;
    }
    @Override
    public int hashCode(){
        return Objects.hash(xSpeed,ySpeed);
    }

}
