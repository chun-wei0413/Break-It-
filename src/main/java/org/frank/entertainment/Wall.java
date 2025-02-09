package org.frank.entertainment;

public class Wall {
    // 定義遊戲邊界
    private int x, y, width, height;

    public Wall() {
        this.x = 0;
        this.y = 0;
        this.width = 800;
        this.height = 600;
    }

    public void checkCollision(Ball ball) {
        if (ball.getX() < x) {
            ball.bounceHorizontal();
        }

        if (ball.getX() > x + width - ball.getX()) {
            ball.bounceHorizontal();
        }

        if (ball.getY() < y) {
            ball.bounceVertical();
        }

        if (ball.getY() > y + height - ball.getY()) {
            ball.bounceVertical();
        }
    }
}
