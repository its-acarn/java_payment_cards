import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DebitTest {

    Debit maestro;

    @Before
    public void before() {
        maestro = new Debit("MAESTRO", "0123456789123456", "01234567", "01-23-45");
    }

    @Test
    public void hasCardType() {
        assertEquals("MAESTRO", maestro.getCardType());
    }

    @Test
    public void hasCardNumber() {
        assertEquals("0123456789123456", maestro.getCardNumber());
    }

    @Test
    public void hasAccountNum() {
        assertEquals("01234567", maestro.getAccountNum());
    }

    @Test
    public void hasSortCode() {
        assertEquals("01-23-45", maestro.getSortCode());
    }
}
