package controller;

import src.controller.SimpleAuth;
import view.View;

public class App {
  public static void main(String[] args) {
    SimpleAuth auth  = new SimpleAuth();
    View view = new View();
    Controller controller = new Controller(auth, view);
    controller.menu();
  }
}
