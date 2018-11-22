package geco;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PasswordGenerationTest {

    PasswordGeneration pwd ;

    @Before
    public void setUp() throws Exception {
        pwd = new PasswordGeneration();
    }

    @Test
    public void getRandomPassword() {
        String password = pwd.getRandomPassword();
        System.out.println(password);
        assertEquals(8,password.length());
    }
}