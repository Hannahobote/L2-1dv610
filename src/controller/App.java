package controller;

import src.controller.SimpleAuth;
import view.View;

public class App {
  public static void main(String[] args) throws Exception {
    SimpleAuth auth = new SimpleAuth();
    View view = new View();
    Controller controller = new Controller(auth, view);

    // create admin by default
    auth.registerUser("admin", "admin123");

    // run program
    controller.menu();
  }
}
