package exception;

public class ExceptionTest {

	public static void main(String[] args) {

		try {
			int a = 0;
			double b;

			b = 100 / a; // java.lang.ArithmeticException 발생

		} catch (ArithmeticException ex) {
			// 예외처리
			System.out.println("!!!!!!!!!!");
			return;
		} finally {
			System.out.println("자원정리");
		}

		System.out.println("Some more codes"); // 예외 발생으로 수행되지 않음

	}
}
