package de.sgro.fizzbuzz;

/***
 * Solution for the task given at https://ccd-school.de/coding-dojo/function-katas/fizzbuzz/
 * Using an interface for the two different variations of solving the task
 * First task: Simple solution for FizzBuzz for equally dividable numbers of 3 and 5
 * Second task: Advanced solution for dividable and contained numbers of 3 and 5
 */
public class FizzBuzzPrinter implements FizzBuzzPrintable
{
    @Override
    public String print(short number)
    {
        String result;
        if ((number % 3 == 0) && (number % 5 == 0))
            return "FizzBuzz";
        else if (number % 5 == 0)
            result = "Buzz";
        else if (number % 3 == 0)
            result = "Fizz";
        else
            result = String.valueOf(number);
        return result;
    }
}
