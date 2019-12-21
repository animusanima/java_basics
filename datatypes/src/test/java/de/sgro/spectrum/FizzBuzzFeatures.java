package de.sgro.spectrum;

import com.greghaskins.spectrum.Spectrum;
import com.greghaskins.spectrum.Variable;
import de.sgro.fizzbuzz.FizzBuzzPrintable;
import de.sgro.fizzbuzz.FizzBuzzPrinter;
import org.junit.runner.RunWith;

import static com.greghaskins.spectrum.dsl.gherkin.Gherkin.*;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

@RunWith(Spectrum.class)
public class FizzBuzzFeatures
{
    {
        final FizzBuzzPrintable printable = new FizzBuzzPrinter();
        final Variable<Short> value = new Variable<>();
        final Variable<String> result = new Variable<>();

        feature("FizzBuzzPrinter", () ->
        {
            scenario("Simple print", () ->
            {
                given("a number not dividable by 3 or 5", () -> {
                    value.set((short) 1);
                });

                when("the print method is called", () -> {
                    result.set(printable.print(value.get()));
                });

                then("it returns the given number", () -> {
                    assertThat(result.get(), equalTo(String.valueOf(value.get())));
                });

            });

            scenario("Fizz", () ->
            {
                given("a number dividable by 3", () -> {
                    value.set((short) 3);
                });
                when("the print method is called", () -> {
                    result.set(printable.print(value.get()));
                });
                then("it should say Fizz", () -> {
                    assertThat(result.get(), equalTo("Fizz"));
                });
            });

            scenario("Buzz", () -> {
                given("a number dividable by 5", () -> {
                    value.set((short) 5);
                });
                when("the print method is called", () -> {
                    result.set(printable.print(value.get()));
                });
                then("it should say Buzz", () -> {
                    assertThat(result.get(), equalTo("Buzz"));
                });
            });

            scenario("FizzBuzz", () -> {
                given("a number dividable by 3 and 5", () -> {
                    value.set((short) 15);
                });
                when("the print method is called", () -> {
                    result.set(printable.print(value.get()));
                });
                then("it should say FizzBuzz", () -> {
                    assertThat(result.get(), equalTo("FizzBuzz"));
                });
            });
        });
    }
}