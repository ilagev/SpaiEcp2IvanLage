package es.upm.miw.spai.ecp2;

import static org.junit.Assert.assertEquals;

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
        assertEquals(true, fraction.isEquivalent(new Fraction(6, 4)));
    }

    @Test
    public void testIsLowerThanWithLowerFraction() {
        assertEquals(false, fraction.isLowerThan(new Fraction(16, 23)));
    }

    @Test
    public void testIsLowerThanWithHigherFraction() {
        assertEquals(true, fraction.isLowerThan(new Fraction(16, 3)));
    }

    @Test
    public void testIsLowerThanWithSameFraction() {
        assertEquals(false, fraction.isLowerThan(fraction));
    }
    
    @Test
    public void testFraction(){
    	fraction.multiply(new Fraction(5,2));
    	assertEquals(15, fraction.getNumerator());
        assertEquals(4, fraction.getDenominator());
    }
}
