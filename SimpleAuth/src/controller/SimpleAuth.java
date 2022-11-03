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

  public void registerUser(String newUsername, String newPassword) throws Exception {
    Username username = new Username(newUsername);
    Password password = new Password(newPassword);
    usernameDatabase.addUsername(newUsername);

    User user = new User(username, password);

    userDatabase.addUsers(user);
    view.registerSuccessMsg(user);
  }

  public void signIn(String username, String password) throws Exception {
    checkIfUserExist(username);
    checkCorrectCredentials(username, password);
  }

  private void checkIfUserExist(String username) throws Exception {
    if (!usernameDatabase.getAllNames().contains(username)) {
      throw new Exception("user Does not exist");
    } 
  }

  public void checkCorrectCredentials(String username, String password) throws Exception {
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
            throw new Exception("username or password is incorrect. Try again.");
          }
      }
    }
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