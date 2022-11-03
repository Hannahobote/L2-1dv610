package src.model;

public class Password {
  
  private String password;

  public Password(String password) throws Exception {
   this.password = password;
   checkpasswordLength();
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public void checkpasswordLength() throws Exception {
    if(this.password.length() < 6) {
      throw new Exception("password must ast least be 6 characters");
    }

    if(this.password.length() > 20) {
      throw new Exception("password cannot be more than 20 characters");
    }
  }
}
