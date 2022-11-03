package src.controller;

import java.util.ArrayList;

import src.model.Password;
import src.model.User;
import src.model.UserDatabase;
import src.model.Username;
import src.model.UsernameDatabase;
import src.view.ConsoleUi;

public class SimpleAuth {

  private UserDatabase userDatabase = new UserDatabase();
  private UsernameDatabase usernameDatabase = new UsernameDatabase();
  private ConsoleUi view = new ConsoleUi();
  private User currentUser;

  public void registerUser(String newUsername, String newPassword) {
    Username username = new Username(newUsername);
    Password password = new Password(newPassword);
    usernameDatabase.addUsername(newUsername);

    User user = new User(username, password);

    userDatabase.addUsers(user);
    view.registerSuccessMsg(user);
  }

  public void signIn(String username, String password) {
    checkCorrectCredentials2(username, password);
  }

  public void checkCorrectCredentials(String username, String password) {
    for (User user : userDatabase.getAllUsers()) {

      if (user.getUsername().equals(username)) {
        // if username is correct, select that user object
        int index = userDatabase.getAllUsers().indexOf(user);
        User selectedUser = userDatabase.getOneUser(index);

          // compare password of that user object
          if (selectedUser.getPassword().equals(password)) {
            user.setAuthenticated(true);
            setCurrentUser(user);
            view.signInSuccessMsg(username);
          } else {
            throw new Error("username or password is incorrect. Try again.");
          }
      } else {
         throw new Error("user Does not exist");
      }
    }
  }

  public void checkCorrectCredentials2(String username, String password) {
    // loop all users in db
    for (User user : userDatabase.getAllUsers()) {
      
      // check if user exist
      if(userExist(username)) {
       
        // check if password is correct for selected user
        User selectedUser = matchedUser(user);
        if(passwordIsCorrect(selectedUser, password)) {
          authenticateUser(selectedUser);
        } else {
          throw new Error("username or password is incorrect. Try again.");
        }

      } else {
        throw new Error("user Does not exist");
      }
    }

  }

  public boolean userExist(String username) {
    if (usernameDatabase.getAllNames().contains(username)) {
      return true;
    } 
    return false;
  }

  public User matchedUser(User user) {
    // if username is correct, select that user object
    int index = userDatabase.getAllUsers().indexOf(user);
    User selectedUser = userDatabase.getOneUser(index);
    return selectedUser;
  }

  public boolean passwordIsCorrect(User user, String password) {
    if(user.getPassword().equals(password)) {
      return true;
    }
    return false;
  }

  public void authenticateUser(User user) {
    user.setAuthenticated(true);
    setCurrentUser(user);
    view.signInSuccessMsg(user.getUsername());
  }

  public void signOut() {
    view.signOutSuccessMsg(currentUser.getUsername());
    currentUser.setAuthenticated(false);
    setCurrentUser(null);
  }

  private void setCurrentUser(User currentUser) {
    this.currentUser = currentUser;
  }

  public User getCurrentUser() {
    return currentUser;
  }

  public ArrayList<User> getAllUsers() {
    return userDatabase.getAllUsers();
  }
}
