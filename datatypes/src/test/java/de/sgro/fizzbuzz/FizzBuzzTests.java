package de.sgro.fizzbuzz;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.HashMap;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class FizzBuzzTests
{
    static final FizzBuzzPrinter fbp = new FizzBuzzPrinter();
    static final HashMap<Short, String> testExpectationsAndResults = new HashMap<>();

    @BeforeEach
    public void prepare()
    {
        testExpectationsAndResults.put((short) 1, "1");
        testExpectationsAndResults.put((short) 2, "2");
        testExpectationsAndResults.put((short) 3, "Fizz");
        testExpectationsAndResults.put((short) 5, "Buzz");

        testExpectationsAndResults.put((short) 15, "FizzBuzz");

        testExpectationsAndResults.put((short) 6, "Fizz");
        testExpectationsAndResults.put((short) 9, "Fizz");
        testExpectationsAndResults.put((short) 12, "Fizz");
        testExpectationsAndResults.put((short) 18, "Fizz");

        testExpectationsAndResults.put((short) 10, "Buzz");
        testExpectationsAndResults.put((short) 20, "Buzz");
        testExpectationsAndResults.put((short) 25, "Buzz");
        testExpectationsAndResults.put((short) 35, "Buzz");
    }

    @Test
    @Order(1)
    public void valueOneWillReturnOne()
    {
        String printResult = fbp.print((short) 1);
        String expected = testExpectationsAndResults.get((short) 1);
        assertThat(printResult, equalTo(expected));
    }

    @Test
    @Order(2)
    public void valueOfTwoWillReturnTwo()
    {
        String printResult = fbp.print((short) 2);
        String expected = testExpectationsAndResults.get((short) 2);
        assertThat(printResult, equalTo(expected));
    }

    @Test
    @Order(3)
    public void valueDividableByThreeWillReturnFizz()
    {
        String printResult = fbp.print((short) 3);
        String expected = testExpectationsAndResults.get((short) 3);
        assertThat(printResult, equalTo(expected));
    }

    @Test
    @Order(4)
    public void valueDividableByFiveWillReturnBuzz()
    {
        String printResult = fbp.print((short) 5);
        String expected = testExpectationsAndResults.get((short) 5);
        assertThat(printResult, equalTo(expected));
    }

    @Test
    @Order(5)
    public void valueDividableByThreeAndFiveWillReturnFizzBuzz()
    {
        String printResult = fbp.print((short) 15);
        String expected = testExpectationsAndResults.get((short) 15);
        assertThat(printResult, equalTo(expected));
    }

    @ParameterizedTest
    @ValueSource(shorts = {6, 9, 12, 18})
    @Order(6)
    public void multiTestEquallyDividableByThreeWillReturnFizz(short argument)
    {
        String printResult = fbp.print(argument);
        String expected = testExpectationsAndResults.get(argument);
        assertThat(printResult, equalTo(expected));
    }

    @ParameterizedTest
    @ValueSource(shorts = {10, 20, 25, 35})
    @Order(7)
    public void multiTestEquallyDividableByFiveWillReturnFizz(short argument)
    {
        String printResult = fbp.print(argument);
        String expected = testExpectationsAndResults.get(argument);
        assertThat(printResult, equalTo(expected));
    }
}
