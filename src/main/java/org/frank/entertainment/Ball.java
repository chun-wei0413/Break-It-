package org.frank.entertainment;

public class Ball {
    private int x, y;
    private int velocityX, velocityY;

    public Ball() {
        this.x = 0;
        this.y = 0;
        this.velocityX = 1;
        this.velocityY = 1;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void reset() {
        x = 0;
        y = 0;
        velocityX = 1;
        velocityY = 1;
    }

    public void move() {
        x += velocityX;
        y += velocityY;
    }

    public void bounceHorizontal() {
        velocityX = -velocityX;
    }

    public void bounceVertical() {
        velocityY = -velocityY;
    }
}
