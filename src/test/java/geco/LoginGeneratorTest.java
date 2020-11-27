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
    public void CT() {
        String nom = "Du";
        String prenom = "Paul";
        assertFalse(loginService.findAllLogins().contains("PDU"));
        lg.generateLoginForNomAndPrenom(nom,prenom);
        assertTrue(loginService.findAllLogins().contains("PDU"));
    }

    @Test
    public void CT1() {
        String nom = "Durand";
        String prenom = "Paul";
        assertFalse(loginService.findAllLogins().contains("PDUR"));
        lg.generateLoginForNomAndPrenom(nom,prenom);
        assertTrue(loginService.findAllLogins().contains("PDUR"));
    }

    @Test
    public void CT2() {
        String nom = "Ralling";
        String prenom = "John";

        assertFalse(loginService.findAllLogins().contains("JRAL2"));
        lg.generateLoginForNomAndPrenom(nom,prenom);
        assertTrue(loginService.findAllLogins().contains("JRAL2"));
    }

    @Test
    public void CT3() {
        String nom = "Rolling";
        String prenom = "Jean";

        assertFalse(loginService.findAllLogins().contains("JROL1"));
        lg.generateLoginForNomAndPrenom(nom,prenom);
        assertTrue(loginService.findAllLogins().contains("JROL1"));
    }

    @Test
    public void CT4() {
        String nom = "Durand";
        String prenom = "Paul";

        assertFalse(loginService.findAllLogins().contains("PDUR"));
        lg.generateLoginForNomAndPrenom(nom,prenom);
        assertTrue(loginService.findAllLogins().contains("PDUR"));
    }
}