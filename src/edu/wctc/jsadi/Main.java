package edu.wctc.jsadi;

/**
 * This is the driver class for the TestScores package
 * Created by jsadi on 9/1/2018
 * @author Jordan Sadi
 * @version 2018 0822 .3
 */
public class Main {

    public static void main(String[] args) {
	// write your code here
        double[] scores = new double[] {100, 50, 75};
        TestScores newTS = new TestScores(scores);
        System.out.println("The average score is " + newTS.avgScore());
    }
}
