import de.sgro.fizzbuzz.FizzBuzzTests;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.platform.suite.api.SelectClasses;
import org.junit.runner.RunWith;

@RunWith(JUnitPlatform.class)
@SelectClasses({PrimitiveByteTests.class, PrimitiveTypeCastingTests.class, FizzBuzzTests.class
})
public class PrimitiveTestSuite
{

}