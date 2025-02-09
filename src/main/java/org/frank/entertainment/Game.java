package org.frank.entertainment;

import java.util.ArrayList;
import java.util.List;

public class Game {
    private List<Round> rounds;
    private int currentRoundIndex;

    public Game() {
        this.rounds = new ArrayList<>();
        this.currentRoundIndex = 0;
    }

    public void start() {
        rounds.get(currentRoundIndex).start();
    }

    public void nextRound() {
        if (currentRoundIndex < rounds.size() - 1) {
            currentRoundIndex++;
            rounds.get(currentRoundIndex).start();
        }
    }

    public void addRound(Round round) {
        rounds.add(round);
    }
}
