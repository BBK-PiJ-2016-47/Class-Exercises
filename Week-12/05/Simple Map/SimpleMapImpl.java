
package simplemapproject;

/**
 *
 * @author spencerh
 */
public class SimpleMapImpl implements SimpleMap {
  private String[] map = new String[100];
  //avoid magic number. where are keys coming from?

  public void put(int key, String name) {
    if (map[key] == null) {
      map[key] = name;
      System.out.println("The element has been added");
    } else {
      System.out.println("That key has been used, please select another");
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
	  System.out.println("The element has been deleted.");
	}
  }


  public boolean isEmpty() {
    int size = map.length;
    boolean empty = true;
	for (int i = 0; i < size; i++) {
	  if (map[i] != null) {
               empty = false;
               break;
            }
          }
    return empty;
  }

}

