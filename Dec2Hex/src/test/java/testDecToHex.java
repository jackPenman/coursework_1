import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class testDecToHex {

    private DecToHex testClass ;
    private String[] args = {"10"};

    @Before
    public void setUp() {
        testClass = new DecToHex();
    }

    @Test
    public void testMain () {
	System.out.println("TESTING STARTED");
        Assert.assertEquals("A", testClass.main(args));
    }
}
