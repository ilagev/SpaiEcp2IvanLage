package es.upm.miw.spai.ecp2;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class DecimalCollectionTest {

    private DecimalCollection dc;

    @Before
    public void prepare() {
        dc = new DecimalCollection();
        dc.add(2.0);
        dc.add(3.5);
        dc.add(1.5);
        dc.add(4.0);
    }

    @Test
    public void testSize() {
        assertEquals(4, dc.size());
    }

    @Test
    public void testSum() {
        assertEquals(11.0, dc.sum(), 10e-5);
    }

    @Test
    public void testHigher() {
        assertEquals(4.0, dc.higher(), 10e-5);
    }

    @Test
    public void testExistsWithExistentValue() {
        assertEquals(true, dc.exists(4.0));
    }
    
    @Test
    public void testExistsWithNonExistentValue() {
        assertEquals(false, dc.exists(2.3));
    }
}
