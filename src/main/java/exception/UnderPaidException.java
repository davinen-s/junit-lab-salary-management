package exception;

/**
 * This exception is thrown when a salary limit
 * has is under paid.
 */
public class UnderPaidException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6491120822631735765L;

	public UnderPaidException(String arg0, Throwable arg1) {
		super(arg0, arg1);
	}

	public UnderPaidException(String arg0) {
		super(arg0);
	}

	public UnderPaidException(Throwable arg0) {
		super(arg0);
	}
	
	
}
