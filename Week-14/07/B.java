package Other;

public class B extends A {
	@Override
	public void throwException() {
		throw new RuntimeException("Level two");
	}

}
