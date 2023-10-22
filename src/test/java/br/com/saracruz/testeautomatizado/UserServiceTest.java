package br.com.saracruz.testeautomatizado;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.util.List;

import org.junit.jupiter.api.Test;

public class UserServiceTest {
    private UserService userService = new UserService();
   
    @Test
    public void createUser_ReturnUsers() {
        //AAA
        //Arrange
        User user = new User("saracruz", "987654");
        
        //Act
        List<User> users = userService.create(user);

     
        //Assert
       assertEquals(1, users.size());
       assertEquals(user, users.get(0));
    }

    @Test
    public void createUser_ThrowsException() {
        
        User user = new User("saracruz", "987654");
        userService.create(user);
        
        
        assertThrows(RuntimeException.class,
         () -> userService.create(user));


       

    }
}
