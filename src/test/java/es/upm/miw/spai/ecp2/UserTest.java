package es.upm.miw.spai.ecp2;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class UserTest {
    
    private User user;
    
    @Before
    public void prepare() {
        user = new User(1, "Pepe", "Domingo");
    }
    
    @Test
    public void testData() {
        assertEquals("Pepe", user.getName());
        assertEquals("Domingo", user.getFamilyName());
        assertEquals(1, user.getNumber());
    }
    
    @Test
    public void testFullName() {
        assertEquals("Pepe Domingo", user.fullName());
    }
    
    @Test
    public void testInitials() {
        assertEquals("P.", user.initials());
    }

}
