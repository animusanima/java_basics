package de.sgro.fizzbuzz;

import org.junit.jupiter.api.Test;

public class FizzBuzzTests
{
    @Test
    public void valueOneWillReturnOne()
    {
        FizzBuzzPrinter fbp = new FizzBuzzPrinter();
        assert(fbp.print((short)1) == "1");
    }
}
