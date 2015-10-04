package es.upm.miw.spai.ecp2;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class FractionTest {
    
    private Fraction fraction;
    
    @Before
    public void prepare() {
        fraction = new Fraction(3, 2);
    }
    
    @Test
    public void testData() {
        assertEquals(2, fraction.getDenominator());
        assertEquals(3, fraction.getNumerator());
    }
    
    @Test
    public void testDecimal() {
        assertEquals(1.5, fraction.decimal(), 10e-5);
    }
    
     @Test
    public void testEquivalent() {
        assertTrue(fraction.isEquivalent(new Fraction(6,4)));
    }

}
