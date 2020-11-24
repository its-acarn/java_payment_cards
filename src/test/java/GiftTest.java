import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GiftTest {

    Gift next;

    @Before
    public void before() {
        next = new Gift("Next", 100);
    }

    @Test
    public void hasStore() {
        assertEquals("Next", next.getStore());
    }

    @Test
    public void hasBalance() {
        assertEquals(100, next.getBalance(), 1);
    }
}
