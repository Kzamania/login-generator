package geco;

import org.junit.Before;
import org.junit.Test;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

import static org.junit.Assert.*;

public class LoginServiceTest {

    LoginService ls;
    String[] login = new String[2];


    @Before
    public void setUp(){
        login[0]="test";
        login[1]="pasTest";
        ls = new LoginService(login);
    }

    @Test
    public void loginExists() {
        assertTrue(ls.loginExists("test"));
        assertTrue(ls.loginExists("pasTest"));
        assertFalse(ls.loginExists("nope"));
    }

    @Test
    public void addLogin() {
        ls.addLogin("nope");
        assertTrue(ls.loginExists("nope"));
    }

    @Test
    public void findAllLoginsStartingWith() {
        ArrayList<String> liste = new ArrayList<String>();
        liste.add("test");
        assertEquals(liste,ls.findAllLoginsStartingWith("t"));


    }

    @Test
    public void findAllLogins() {
        ArrayList<String> liste = new ArrayList<String>(Arrays.asList(login));
        Collections.sort(liste);

        assertEquals(liste,ls.findAllLogins());
    }
}