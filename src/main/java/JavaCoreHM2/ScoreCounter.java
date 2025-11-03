package JavaCoreHM2;

public class ScoreCounter {
    public int addScore (int currentScore, int amount) {
        currentScore += amount;
        return currentScore;
    }

    public int twiceScore (int currentScore) {
        currentScore *= 2;
        return currentScore;
    }

    static void main(String[] args) {
        ScoreCounter scoreCounter = new ScoreCounter();

        // Should be 15
        System.out.println("scoreCounter.addScore(10, 5) = " + scoreCounter.addScore(10, 5));
        // Should be 14
        System.out.println("scoreCounter.twiceScore(7) = " + scoreCounter.twiceScore(7));
    }
}
