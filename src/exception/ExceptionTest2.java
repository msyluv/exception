package exception;

public class ExceptionTest2 {
	public static void main(String[] args) {
		
		ThrowText tt=new ThrowText();
		
		try{
			tt.suspiciousMethod3();
		} catch(Exception ex){
			System.out.println("예외발생"+ex);
		}
	}
}
