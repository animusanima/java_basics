import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PrimitiveTypeCastingTests
{
    byte b;
    short s;
    int i;
    long l;
    float f;
    double d;

    @BeforeEach
    public void prepare()
    {
        b = 0;
        s = 0;
        i = 0;
        l = 0;
        f = 0.0f;
        d = 0.0;
    }

    @Test
    public void wideningTypeCastTest()
    {
        b = 127;
        s = b;
        i = s;
        l = i;
        f = l;
        d = f;

        assert(b == 127);
        assert(s == 127);
        assert(i == 127);
        assert(l == 127);
        assert(f == 127.0f);
        assert(d == 127.0);
    }

    @Test
    public void narrowingTypeCastTest()
    {
        d = 400.00;
        f = (float) d;
        l = (long) f;
        i = (int) l;
        s = (short) i;

        assert(d == 400.00);
        assert(f == 400.00f);
        assert(l == (long) 400);
        assert(i == 400);
        assert(s == (short) 400);
    }
}
