package controller;

import src.controller.SimpleAuth;
import view.View;
import src.view.ConsoleUi;

public class Controller {
  
  private View view;
  private ConsoleUi authView = new ConsoleUi();
  private SimpleAuth auth = new SimpleAuth();

  public Controller(SimpleAuth auth, View view) {
    this.auth = auth;
    this.view = view;
  }

  /**
   * This is the menu that the end user sees in the console when the application starts. 
   * What they see will depend on their input.
   */
  public void menu() {
    try {
      view.menu();
      String userAnswer = view.getStringInput();
  
      if(userAnswer.contains(view.registerUserCmd())) {
        registerUser();
      } 
  
      if(userAnswer.contains(view.signInCmd())) {
        signIn();
      }
    } catch (Exception e) {
      view.printError(e);
      menu();
    }
  }

  private  void registerUser() throws Exception {
    view.askUsername();
    String username = view.getStringInput();

    view.askPassword();
    String password = view.getStringInput();

    auth.registerUser(username, password);

    menu();
  }

  private void signIn() throws Exception {
    view.askUsername();
    String username = view.getStringInput();

    view.askPassword();
    String password = view.getStringInput();

    auth.signIn(username, password);
    pickDashboard(username);
  } 

  /**
   * Picks a dashboard for the employee role and the admin role, since they dont have the same privileges.
   * @param username
   */
  private void pickDashboard(String username) {
    if(username.equals("admin")) {
      adminDashboard();
    } else {
      userDashboard();
    }
  }

  private void adminDashboard() {
    view.adminDashboard();
    String userAnswer = view.getStringInput();

    if(userAnswer.contains(view.signOutCmd())) {
      signOut();
    }

    if(userAnswer.contains(view.printCurrentUserInfoCmd())) {
      viewCurrentUserInfo();
    }

    if(userAnswer.contains(view.printDatabaseCmd())) {
      printDatabase();
    }
  }


  private void userDashboard() {
    view.userDashboard();
    String userAnswer = view.getStringInput();

    if(userAnswer.contains(view.signOutCmd())) {
      signOut();;
    }

    if(userAnswer.contains(view.printCurrentUserInfoCmd())) {
      viewCurrentUserInfo();
    }
  }

  private void viewCurrentUserInfo() {
    authView.printOneUser(auth.getCurrentUser());
    pickDashboard(auth.getCurrentUser().getUsername());
  }

  private void printDatabase() {
    authView.printUserDatabase(auth.getAllUsers());
    pickDashboard(auth.getCurrentUser().getUsername());
  }

  private void signOut() {
    auth.signOut();
    menu();
  }
}
