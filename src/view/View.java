package view;
import java.util.Scanner;

public class View {

  Scanner scanner = new Scanner(System.in);

  public void menu() {
    System.out.println("===Welcome to Simple Auth===");
    System.out.println("===1. sign in===");
  }

  public void menuSignedIn() {
    System.out.println("===1. sign out===");
  }

  public String getStringInput() {
    return scanner.next();
  }

  public int getIntegerInput() {
    return scanner.nextInt();
  }

  public void askUsername() {
    System.out.println("write your username");
  }

  public void askPassword() {
    System.out.println("write your password");
  }

  public void currentUserMessage() {
    System.out.println("Welcome, you are signed in");
    //TODO: greet user and give them an option to sign out
  }
}