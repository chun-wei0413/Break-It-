package org.frank.entertainment;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Round {
    private Score score;
    private Ball ball;
    private Paddle paddle;
    private List<Brick> bricks;
    private List<PowerUp> powerUps;
    private Wall wall;
    private boolean isRunning;

    public Round() {
        this.score = new Score();
        this.ball = new Ball();
        this.paddle = new Paddle();
        this.bricks = new ArrayList<>();
        this.powerUps = new ArrayList<>();
        this.wall = new Wall();
        this.isRunning = false;
    }

    public void start() {
        System.out.println("Game Round Starting...");
        isRunning = true;
        resetGameObjects();
        gameLoop();
    }

    private void resetGameObjects() {
        score.reset();
        ball.reset();
        paddle.reset();
        bricks.clear();
        powerUps.clear();
        generateBricks();
    }

    private void generateBricks() {
        Random rand = new Random();
        int rows = 5;
        int cols = 8;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                bricks.add(new Brick(j * 60, i * 30)); // 假設每個磚塊大小 60x30
            }
        }
        System.out.println("Bricks Generated: " + bricks.size());
    }

    private void gameLoop() {
        while (isRunning) {
            update();
            checkCollisions();
            render();
            try {
                Thread.sleep(16); // 簡單的 60 FPS 延遲
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    private void update() {
        ball.move();
        checkPaddleMovement();
    }

    private void checkCollisions() {
        wall.checkCollision(ball);
        paddle.checkCollision(ball);
        checkCollisionWithBricks();
    }

    private void checkCollisionWithBricks() {
        for (Brick brick : bricks) {
            if (brick.checkCollision(ball)) {
                score.addPoints(1);
            }
        }
    }

    private void checkPaddleMovement() {
        // 這裡可以加入鍵盤輸入邏輯來移動 paddle
    }

    private void render() {
        System.out.println("Rendering game state...");
    }

    public void stop() {
        isRunning = false;
        System.out.println("Game Round Stopped.");
    }
}
