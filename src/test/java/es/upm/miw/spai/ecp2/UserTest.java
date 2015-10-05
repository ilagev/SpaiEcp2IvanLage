package es.upm.miw.spai.ecp2;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class UserTest {
    
    private User user;
    
    @Before
    public void prepare() {
        user = new User(1, "Pepe", "Domingo", 35);
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

    @Test
    public void testTocayo() {
        assertTrue(user.isTocayo("Pepe"));
    }
    
    @Test
    public void testGetAge(){
    	assertEquals(35, user.getAge());
    }
    
    @Test
    public void testSetAge(){
    	user.setAge(20);
    	assertEquals(20, user.getAge());
    }
}
