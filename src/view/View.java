package view;

import java.util.Scanner;

public class View {

  Scanner scanner = new Scanner(System.in);

  public void menu() {
    System.out.println("\n");
    System.out.println("===Welcome to the Employee workspace===");
    System.out.println("=== 1.register user===");
    System.out.println("=== 2.sign in===");
    System.out.println("\n");

  }

  public void userDashboard() {
    System.out.println("\n");
    System.out.println("=== Welcome to the user dashboard===");
    System.out.println("=== 3. sign out===");
    System.out.println("=== 4. view your user information===");
    System.out.println("\n");
  }

  public void adminDashboard() {
    System.out.println("\n");
    System.out.println("=== Welcome to the Admin dashboard===");
    System.out.println("=== 3. sign out===");
    System.out.println("=== 4. view your user information===");
    System.out.println("=== 5. view all employees===");
    System.out.println("\n");
  }

  public String registerUserCmd() {
    return "1";
  }

  public String signInCmd() {
    return "2";
  }

  public String signOutCmd() {
    return "3";
  }

  public String printCurrentUserInfoCmd() {
    return "4";
  }

  public String printDatabaseCmd() {
    return "5";
  }

  public String getStringInput() {
    return scanner.nextLine();
  }

  public void askUsername() {
    System.out.println("write your username");
  }

  public void askPassword() {
    System.out.println("write your password");
  }

  public void printError(Exception error) {
    System.out.println("\n");
    System.out.println(error);
  }
}