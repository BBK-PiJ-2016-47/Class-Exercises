public class HashUtilities {

  public static int shortHash(int x) {
  	int newhash = Math.abs(x) % 1000;
  	return newhash;
  }

}
