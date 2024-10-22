package testuser;

import org.junit.jupiter.api.Test;
import user.User;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestUser {

    @Test
    public void testUsername() {
        //Skapa ett objekt av klassen User
        User myUser = new User("henryviii", "password");

        String myUsername = myUser.getUsername();

        assertEquals("henryviii", myUsername);

    }

    @Test
    public void testPassword() {
        //Skapa ett objekt av klassen User
        User myUser = new User("henryviii", "password");

        String myUsername = myUser.getPassword();

        assertEquals("password", myUsername);

        assertEquals("821111-1111", myUsername);

    }


}
