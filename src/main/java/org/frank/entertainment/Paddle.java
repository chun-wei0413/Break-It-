package org.frank.entertainment;

public class Paddle {
    private int x, width;

    public Paddle() {
        this.x = 50;
        this.width = 100;
    }

    public void reset() {
        x = 50;
    }

    public void checkCollision(Ball ball) {
        if (ball.getX() < x) {
            ball.bounceHorizontal();
        }

        if (ball.getX() > x + width - ball.getX()) {
            ball.bounceHorizontal();
        }
    }

    public void moveLeft() {
        x -= 10;
    }

    public void moveRight() {
        x += 10;
    }
}
