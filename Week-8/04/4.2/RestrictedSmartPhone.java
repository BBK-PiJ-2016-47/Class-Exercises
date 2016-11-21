public class RestrictedSmartPhone extends SmartPhone {
	public RestrictedSmartPhone(String brand) {
		super(brand);
	}
	
	@Override
	private void playGame(String game) {
		super.playGame(game);
	}

}
