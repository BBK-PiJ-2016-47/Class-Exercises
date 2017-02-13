public class SimpleMapImpl implements SimpleMap {
  private String[] map = new String[100];
  //avoid magic number. where are keys coming from?

  public void put(int key, String name) {
    if (map[key] == null) {
      map[key] = name;
    } 
  }
 
  public String get(int key) {
    if (map[key] == null) {
	  return null;
	} else {
	  return map[key];
	}
  }
  
  public void remove(int key){
    if (map[key] == null) {
	  System.out.println("There's no element here!");
	} else {
	  map[key] = null;
	  System.out.println("The element has been deleted.")
	}
  }
  

  boolean isEmpty() {
    int size = map.length();
	for (int i = 0; i < size; i++) {
	  if (map[i] != null) {
	    return false;
	  } else {
	    return true;
	  }
	  
	}
  }
}