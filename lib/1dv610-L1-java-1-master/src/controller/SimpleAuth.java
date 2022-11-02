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
    view.printUserDatabase(getAllUsers());
  }

  public void signIn(String username, String password) {
    checkIfUserExist(username);
    checkCorrectCredentials(username, password);
  }

  // TODO: does not work when several users are registered.
  private void checkIfUserExist(String username) {
    if (!usernameDatabase.getAllNames().contains(username)) {
      throw new Error("user Does not exist");
    } 
  }

  public void checkCorrectCredentials(String username, String password) {
    for (User user : userDatabase.getAllUsers()) {

      if (user.getUsername().equals(username)) {
        // id username is correct, select that user object
        int index = userDatabase.getAllUsers().indexOf(user);
        User selectedUser = userDatabase.getOneUser(index);

        // compare password of that user object
        if (selectedUser.getPassword().equals(password)) {
          System.out.println("password correct");
          user.setAuthenticated(true);
          setCurrentUser(user);
          view.signInSuccessMsg(username);
        } else {
          throw new Error("username or password is incorrect. Try again.");
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
