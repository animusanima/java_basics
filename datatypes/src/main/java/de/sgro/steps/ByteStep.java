package de.sgro.steps;

import org.jbehave.core.annotations.*;

public class ByteStep
{
    byte b;

    @Given("a variable of type byte")
    public void GivenAVariableOfTypeByte()
    {
        b = 0;
    }

    @When("there is no value assigned to it")
    @Alias("When no value is assigned to b")
    public void WhenThereIsNoValueAssigneToIt(byte value)
    {
        b = 0;
    }

    @Then("it should return the default value of $defaultVal")
    @Alias("then it should return the default value of byte")
    public void ThenItShouldReturnTheDefaultValueOf(@Named("defaultVal") byte defaultVal)
    {
        if (b != defaultVal)
            throw new RuntimeException("b is " + b + " but expected was " + defaultVal);
    }

    @When("the value $value1 is assigned to it")
    public void WhenTheValueIsAssignedToIt(@Named("value1") byte value1)
    {
        this.b = value1;
    }

    @Then("the $returnValue should be equal to $value1")
    public void ThenTheReturnValueShouldBeEqualTo(@Named("returnValue") byte returnValue, @Named("value1") byte value1)
    {
        if (returnValue != value1)
            throw new RuntimeException("returnValue is " + returnValue + " but expected was " + value1);

        if (b != value1)
            throw new RuntimeException("b is " + b + " but expected was " + value1);

        if (b != returnValue)
            throw new RuntimeException("b is " + b + " but expected was " + returnValue);
    }
}