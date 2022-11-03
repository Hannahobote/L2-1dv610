package src.model;

import java.util.ArrayList;

public class UsernameDatabase {

  private ArrayList<String> nameList = new ArrayList<>();

  public void addUsername(String name) throws Exception {
    checkForDuplicates(name);
    nameList.add(name);
  }

  public ArrayList<String> getAllNames() {
    ArrayList<String> copy = new ArrayList<>();
    copy.addAll(nameList);
    return copy;
  }

  public void checkForDuplicates(String nameToCheck) throws Exception {
    // if list is not empty, check for dupes
    if (!isListEmpty()) {
      FindDuplicateNames(nameToCheck);
    }
  }

  public Boolean isListEmpty() {
    if (nameList.size() == 0) {
      return true;
    }
    return false;
  }

  public void FindDuplicateNames(String nameToCheck) throws Exception {
    for (String name : nameList) {
      // if name exist already
      if (name.equals(nameToCheck)) {
        throw new Exception("The username is already being used. Try another name.");
      }
    }
  }

}
