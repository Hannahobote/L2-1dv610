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
      view.printError(e);
      menu();
    }
  }

  public void registerUser() {
    view.askUsername();
    String username = view.getStringInput();

    view.askPassword();
    String password = view.getStringInput();

    auth.registerUser(username, password);

    menu();
  }

  public void signIn() {
    //TODO: sign in on the second round, signs in even if password is incorrect
    view.askUsername();
    String username = view.getStringInput();

    view.askPassword();
    String password = view.getStringInput();

    auth.signIn(username, password);
    userDashboard();
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
    authView.printUserDatabase(auth.getAllUsers());
    userDashboard();
  }

  public void signOut() {
    auth.signOut();
    authView.printUserDatabase(auth.getAllUsers());
    menu();
  }
}
