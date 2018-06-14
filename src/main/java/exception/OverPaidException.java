package exception;

/**
 * This exception is thrown when a salary limit
 * has been exceeded.
 */
public class OverPaidException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5976902539297793108L;

	public OverPaidException(String arg0, Throwable arg1) {
		super(arg0, arg1);
	}

	public OverPaidException(String arg0) {
		super(arg0);
	}

	public OverPaidException(Throwable arg0) {
		super(arg0);
	}
	
	
}
