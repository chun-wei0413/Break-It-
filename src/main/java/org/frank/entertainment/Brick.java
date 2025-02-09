package org.frank.entertainment;

public class Brick {
    private int x, y;
    private boolean isDestroyed;

    public Brick(int x, int y) {
        this.x = x;
        this.y = y;
        this.isDestroyed = false;
    }

    public boolean checkCollision(Ball ball) {
        if (ball.getX() < x || ball.getX() > x + 60) {
            ball.bounceHorizontal();
            destroy();
            return true;
        }

        if (ball.getY() < y || ball.getY() > y + 30) {
            ball.bounceVertical();
            destroy();
            return true;
        }

        return false;
    }

    public void destroy() {
        isDestroyed = true;
    }

    public boolean isDestroyed() {
        return isDestroyed;
    }
}
