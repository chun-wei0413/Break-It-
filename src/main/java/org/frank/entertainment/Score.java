package org.frank.entertainment;

public class Score {
    private int points;

    public Score() {
        this.points = 0;
    }

    public void reset() {
        points = 0;
    }

    public void addPoints(int amount) {
        points += amount;
    }

    public int getPoints() {
        return points;
    }
}
