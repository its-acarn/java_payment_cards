import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CreditTest {

    private Credit visa;

    @Before
    public void before() {
        visa = new Credit("VISA", "0123456789123456", 1.25, 2000);
    }

    @Test
    public void hasCardType() {
        assertEquals("VISA", visa.getCardType());
    }

    @Test
    public void hasCardNumber() {
        assertEquals("0123456789123456", visa.getCardNumber());
    }

    @Test
    public void hasRiskMultiplier() {
        assertEquals(1.25, visa.getRiskMultiplier(), 1);
    }

    @Test
    public void hasCreditLimit() {
        assertEquals(2000, visa.getCreditLimit(), 1);
    }

}
