import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
@Tag("byte")
public class PrimitiveByteTests
{
    byte b;
    byte c;

    @BeforeEach
    public void prepare()
    {
        b = 0;
    }

    @Test
    @DisplayName("Default value of member variable is 0")
    @Order(1)
    public void defaultValueOfByteIsZero()
    {
        assertThat(b, equalTo(c));
    }

    @ParameterizedTest
    @DisplayName("Testing boundaries")
    @ValueSource(bytes={0, 1, 2, 4, 8, 16, 32, 64, (byte) 127, (byte) -128, (byte) 128, (byte) -129})
    @Order(4)
    public void assigningValueToByteReturnsValue(byte value)
    {
        b = value;
        assertThat(b, equalTo(value));
    }

    @Test
    @DisplayName("Overflow test: Byte.MAX_VALUE + 1")
    @Order(2)
    public void ByteOverflow()
    {
        b = (byte) (Byte.MAX_VALUE + 1);
        assertThat(b, equalTo((byte) -128));
    }

    @Test
    @DisplayName("Underflow test: Byte.MIN_VALUE - 1")
    @Order(3)
    public void ByteUnderflow()
    {
        b = (byte) (Byte.MIN_VALUE - 1);
        assertThat(b, equalTo((byte) 127));
    }

}