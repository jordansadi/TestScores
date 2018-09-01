package edu.wctc.jsadi;

/**
 * This class defines a TestScores array
 * Created by jsadi on 9/1/2018
 * @author Jordan Sadi
 * @version 2018 0822 .3
 */
public class TestScores {
    double[] scores;

    /**
     * The TestScores constructor creates an instance of the TestScores class using an array of scores
     * @param scores double array of test scores
     * @throws IllegalArgumentException if a test score below 0 or over 100 is found
     * @return instance of the TestScores class
     */
    public TestScores(double[] scores) {
        this.scores = scores;
        for (double score : scores) {
            if (score < 0 || score > 100) {
                // throw new IllegalArgumentException("Invalid test score.");
                throw new InvalidTestScore("Test score below zero or over 100.");
            }
        }
    }

    /**
     * This method returns an average of all test scores in the array
     * @return double indicating the average test score of the array
     */
    public double avgScore() {
        double total = 0, avg = 0;

        for (double score : scores)
            total += score;

        avg = total / scores.length;

        return avg;
    }
}