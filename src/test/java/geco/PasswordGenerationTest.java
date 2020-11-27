package geco;

import org.junit.Test;

import static org.junit.Assert.*;

public class PasswordGenerationTest {
    PasswordGeneration pg = new PasswordGeneration();

    @Test
    public void generatePassword() {
        String test ;
        for (int i = 0; i < 10; i++) {
            test = pg.generatePassword();
            assertEquals(test.length(),8);
        }
    }
}