package controller;

import src.controller.SimpleAuth;
import view.View;

public class Controller {
  
  private View view;
  private SimpleAuth auth = new SimpleAuth();

  public Controller(SimpleAuth auth, View view) {
    this.auth = auth;
    this.view = view;
  }

  public void menu() {
    view.menu();
    String userAnswer = view.getStringInput();

    if(userAnswer.contains(view.registerUserCmd())) {
      registerUser();
    } 

    if(userAnswer.contains(view.signInCmd())) {
      signIn();
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
      signOut();
    }

    if(userAnswer.contains(view.signOutCmd())) {
      viewCurrentUserInfo();
    }
  }

  public void viewCurrentUserInfo() {

    // return to
    userDashboard();
  }

  public void signOut() {
    auth.signOut();
    menu();
  }
}
