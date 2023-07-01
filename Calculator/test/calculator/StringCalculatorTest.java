package calculator;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class StringCalculatorTest {

    private StringCalculator stringCalculator;

    @Before
    public void setUp() {
        stringCalculator = new StringCalculator();
    }

    @Test
    // 성공
    public void stringCommaSemiSuccess() {
        assertEquals(0, stringCalculator.commaSemi(" "));
        assertEquals(3, stringCalculator.commaSemi("1,2"));
        assertEquals(6, stringCalculator.commaSemi("1,2:3"));
    }

    @Test
    // 성공
    public void stringCommaSemiException() {

        assertEquals(1, stringCalculator.commaSemi("1"));
//        assertEquals(6, stringCalculator.commaSemi("1,2:3"));


    }

    @Test
    public void stringCustom() {
        assertEquals(6, stringCalculator.customPattern("//;\n1;2;3"));
    }
}