package exception;

import java.io.IOException;

public class ThrowText {
	
	public void suspiciousMethod() throws IOException {
		throw new IOException();//강제로 예외발생
	}
	
	public void suspiciousMethod2(){
		throw new ArithmeticException();
	}
	
	public void suspiciousMethod3() throws DividedByZeroException {
		throw new DividedByZeroException("0으로 나누지마");
	}
}
