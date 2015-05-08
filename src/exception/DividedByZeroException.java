package exception;

public class DividedByZeroException extends Exception {
	
	public DividedByZeroException() {
		super("Dividing by 0");
	}

	public DividedByZeroException(String msg) {
		super(msg);
	}
}
