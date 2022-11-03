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
      // System.out.println(e.getMessage());
      view.printError(e);
      menu();
    }
  }

  public void registerUser() throws Exception {
    view.askUsername();
    String username = view.getStringInput();

    view.askPassword();
    String password = view.getStringInput();

    auth.registerUser(username, password);

    menu();
  }

  public void signIn() throws Exception {
    view.askUsername();
    String username = view.getStringInput();

    view.askPassword();
    String password = view.getStringInput();

    auth.signIn(username, password);
    pickDashboard(username);
  } 

  public void pickDashboard(String username) {
    if(username.equals("admin")) {
      adminDashboard();
    } else {
      userDashboard();
    }
  }

  public void adminDashboard() {
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


  public void userDashboard() {
    view.userDashboard();
    String userAnswer = view.getStringInput();

    if(userAnswer.contains(view.signOutCmd())) {
      signOut();;
    }

    if(userAnswer.contains(view.printCurrentUserInfoCmd())) {
      viewCurrentUserInfo();
    }
  }

  public void viewCurrentUserInfo() {
    authView.printOneUser(auth.getCurrentUser());
    pickDashboard(auth.getCurrentUser().getUsername());
  }

  public void printDatabase() {
    authView.printUserDatabase(auth.getAllUsers());
    pickDashboard(auth.getCurrentUser().getUsername());
  }

  public void signOut() {
    auth.signOut();
    // TODO: code below for testing purpopses
    // authView.printUserDatabase(auth.getAllUsers());
    menu();
  }
}
