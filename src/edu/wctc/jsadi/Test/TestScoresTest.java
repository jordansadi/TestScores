package edu.wctc.jsadi.Test;
import edu.wctc.jsadi.InvalidTestScore;
import edu.wctc.jsadi.TestScores;
import org.junit.*;

public class TestScoresTest extends junit.framework.TestCase {
    public TestScoresTest() {}
    double[] validArray, invalidArray;
    TestScores valid, invalid;

    @Before
    public void setUp() throws Exception {
        validArray = new double[] {50, 100, 75};
        invalidArray = new double[] {-1};
        valid = new TestScores(validArray);
    }

    @After
    public void tearDown() throws Exception {}

    @Test
    public void testInvalidTestScores() {
        try {
            invalid = new TestScores(invalidArray);
            fail("Expected exception did not occur");
        } catch (InvalidTestScore e) {
            // nothing needs to be done because the exception is expected
        }
    }

    @Test
    public void testTestScores() {
        assertEquals(valid.avgScore(), 75.0);
    }
}
