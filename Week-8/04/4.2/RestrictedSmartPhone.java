public class RestrictedSmartPhone extends SmartPhone {
	
	@Override
	private void playGame(String game) {
		super.playGame(game);
	}

}

/** can't assign weaker access privileges as access 
  * been given in the super class.
**/  