package geco;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class LoginGeneratorTest {

    LoginService loginService = new LoginService(new String[]{"JROL","BPER", "CGUR", "JDU", "JRAL", "JRAL1"});
    LoginGenerator lg = new LoginGenerator(loginService);
    @Before
    public void setUp() throws Exception {
    }

    @Test
    public void CT1() {
        assertFalse(loginService.findAllLogins().contains("PDUR"));
        lg.generateLoginForNomAndPrenom("Durand","Paul");
        assertTrue(loginService.findAllLogins().contains("PDUR"));
    }
}