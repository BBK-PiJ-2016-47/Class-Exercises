import java.util.List;

public class BinarySearch {
//add a helper method to find the length of the list before the full method
  public boolean search(int n, List list) {
	boolean found = false;
    if (list.size() == 0) {
	  return false;
	} 
	int middle = (list.size()/2);
	int midEle = list.get(middle);
	if (midEle == n) {
	  return true;
	} 
	List half;
	
	if (midEle > n) {
	  for (int i = 0; i < midEle; i++) {
		half.add(list.get(i));
	  }
	  search(n, half);
	} else {
	  for (int i = midEle; i < list.size(); i++) {
		half.add(list.get(i));
	  }
	  search(n, half);
	}
    return false;
  }
}