package src.model;

public class Username {

  private String name;

  public Username(String name) throws Exception {
    this.name = name;
    nameLengthValidation(name);
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void nameLengthValidation(String name) throws Exception {
    if (name.isEmpty() || name.length() < 2) {
      throw new Exception("Name must atleast consist of 2 characters");
    }
  }

}
