package com.managepass.PasswordManager.service;

import com.managepass.PasswordManager.model.User;
import com.managepass.PasswordManager.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class RegisterServiceImpl implements RegisterService {

    @Autowired
    private UserRepository userRepository;

    /**
     * Creates a new record in the database.
     * @param : entity - must not be null.
     * @return : the entity which is written to the database.
     */
    public User createNewUser(User user) {
        String newEnteredUsername = user.getUsername();
        Optional<User> optionalUserUsername = userRepository.findById(newEnteredUsername);
        // Validation of the username.
        if (optionalUserUsername.get().equals(newEnteredUsername)){
            return optionalUserUsername.get();
        } else {
            return userRepository.save(user);
        }
    }

    /**
     * Find for the record in the database using unique username.
     * @param : username - unique username saved with every record.
     *          username must not be null.
     * @return : the entity which is written to the database.
     */
    public Optional<User> getUser(String username) {
        return userRepository.findById(username);
    }

    /**
     * Gets all the records stored into the database.
     * @return : List of users. (returns empty list if no records exist).
     */
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    /**
     * Deletes the record saved with the username provided.
     * @param username - must not be null.
     * @return : String message whether the record is deleted or not.
     */
    public String deleteUser(String username){
        if (userRepository.existsById(username)){
            userRepository.deleteById(username);
            return "Record Deleted";
        } else {
            return "Record does not exist!";
        }
    }

    /**
     * Checks and updates the requested record with the new record.
     * @param user - should not be null and must contain an username which already exist.
     * @return : String message whether the record is updated or not.
     */
    public String updateUser(User user) {
        Optional<User> optionalUserToBeUpdated = userRepository.findById(user.getUsername());
        if (optionalUserToBeUpdated.isPresent()){
            User finalUser = optionalUserToBeUpdated.get();
            userRepository.save(user);
            return "Record Updated!";
        } else {
            return "Record does not exist!";
        }
    }
}
