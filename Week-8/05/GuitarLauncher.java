public class GuitarLauncher {
	public static void main (String[] args) {
		GuitarLauncher launcher = new GuitarLauncher();
		launcher.launch();
	
	}
	
	public void launch() {
		Guitar lesPaul = new Guitar();
		lesPaul.Guitarfunction trill = new lesPaul.GuitarFunction();
		lesPaul.burn();
		trill.play();
		
	
	}
	
}
