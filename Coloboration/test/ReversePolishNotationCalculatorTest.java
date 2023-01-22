
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ReversePolishNotationCalculatorTest {

    private final ReversePolishNotationCalculator reversePolishNotationCalculator =
            new ReversePolishNotationCalculator();

    @Test
    public void shouldCalculateAddition() {
        int actual = reversePolishNotationCalculator.calculatePolishNotation("1 2  +");
        assertEquals(3, actual);
    }

    @Test
    public void shouldCalculateSubtraction() {
        int actual = reversePolishNotationCalculator.calculatePolishNotation("3 1  -");
        assertEquals(2, actual);
    }

    @Test
    public void shouldCalculateIncrease() {
        int actual = reversePolishNotationCalculator.calculatePolishNotation("3 2  *");
        assertEquals(6, actual);
    }

    @Test
    public void shouldCalculateNegativeNumbers() {
        int actual = reversePolishNotationCalculator.calculatePolishNotation("3 -2  -");
        assertEquals(5, actual);
    }

    @Test
    public void shouldCalculateWithALotOfSpaces () {
        int actual = reversePolishNotationCalculator.calculatePolishNotation("-3      -2        - ");
        assertEquals(-1, actual);
    }
}