package edu.wctc.jsadi;

/**
 * This class creates an Exception for invalid test scores
 * Created by jsadi on 9/1/2018
 * @author Jordan Sadi
 * @version 2018 0822 .3
 */
public class InvalidTestScore extends IllegalArgumentException {
    public InvalidTestScore(String message) {
        super(message);
    }
}
