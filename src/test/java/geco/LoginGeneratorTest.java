package geco;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class LoginGeneratorTest {

    LoginService loginService;
    LoginGenerator loginGenerator;
    @Before
    public void setUp() throws Exception {
        loginService =new LoginService(new String[]{"JROL", "BPER", "CGUR", "JDU", "JRAL", "JRAL1"});
        loginGenerator = new LoginGenerator(loginService);
    }

    /*
    @Test
    public void generateLoginForNomAndPrenom() {
    }
    */
    /**
     * quand on génère le login de"Paul Durand",
     * on vérifie que le login généré et ajouté à
     * la liste des logins existants est "PDUR".
     */
    @Test
    public void CT1(){
        String res=loginGenerator.generateLoginForNomAndPrenom("Durand","Paul");
        assertEquals("PDUR",res);
    }

    @Test
    public void CT2(){
        String res=loginGenerator.generateLoginForNomAndPrenom("Rolling","Jean");
        assertEquals("JROL1",res);

    }

    @Test
    public void CT3(){
        String res=loginGenerator.generateLoginForNomAndPrenom("Dùrand","Paul");
        assertEquals("PDUR",res);

    }
    @Test
    public void testBug3(){
        String res=loginGenerator.generateLoginForNomAndPrenom("Ralling","John");
        assertEquals("JRAL2",res);
    }
}