package src.model;
import java.util.ArrayList;

public class UsernameDatabase {

  private ArrayList<String> nameList = new ArrayList<>();

  public void addUsername(String name) throws Exception {
    checkDuplicateName(name);
    nameList.add(name);
  }

  public ArrayList<String> getAllNames() {
    ArrayList<String> copy = new ArrayList<>();
    copy.addAll(nameList);
    return copy;
  }

  public void checkDuplicateName(String nameToCheck) throws Exception {
    // if list is not empty, check for duplicates
    if(nameList.size() != 0) {
      // loop through list
      for (String name : nameList) {
        // check if name exist
        if(name.contains(nameToCheck)) {
          throw new Exception("The username is already being used. Try another name.");
        }
      }
    } 
  }
}
