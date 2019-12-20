import de.sgro.primitives.PrimitiveByte;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

public class PrimitiveByteTests
{
    private PrimitiveByte primitiveByte;

    @BeforeEach
    public void prepare()
    {
        byte b = 0;
        this.primitiveByte = new PrimitiveByte(b);
    }

    @Test
    public void unassignedValueEqualsZero()
    {
        byte b = 0;
        assertThat(b, equalTo(primitiveByte.getValue()));
    }

}
