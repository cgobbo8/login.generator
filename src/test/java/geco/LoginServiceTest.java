package geco;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.*;

public class LoginServiceTest {

    String loginTest = "albert";
    LoginService ls;
    String[] logins = {"josette","mohamed","cyril","joe","johann","joshua"};
    List<String> prefixeJoTest = new ArrayList<>();

    @Before
    public void setUp() throws Exception {
        ls = new LoginService(logins);
        prefixeJoTest.add("josette");
        prefixeJoTest.add("joe");
        prefixeJoTest.add("johann");
        prefixeJoTest.add("joshua");
        Collections.sort(prefixeJoTest);
    }

    @Test
    public void loginExists() {
        assertTrue(ls.loginExists("josette"));
        assertFalse(ls.loginExists(loginTest));
    }

    @Test
    public void addLogin() {
        assertFalse(ls.loginExists(loginTest));
        ls.addLogin(loginTest);
        assertTrue(ls.loginExists(loginTest));
    }

    @Test
    public void findAllLoginsStartingWith() {
        List<String> prefixeJo = ls.findAllLoginsStartingWith("jo");
        Collections.sort(prefixeJo);
        assertTrue(prefixeJo.equals(prefixeJoTest));
    }

    @Test
    public void findAllLogins() {
        List<String> loginsList = Arrays.asList(logins);
        Collections.sort(loginsList);
        assertEquals(loginsList,ls.findAllLogins());
    }
}