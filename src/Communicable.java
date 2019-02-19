public interface Communicable {
	public static final String SALUTATION = "****************AcidCalc**************";
	public static final String FAREWELL = "Bye";
	public static final String none = "";
	
	public static final String CLI_LOGO = "";
	
	public static final String CLI_HELP = "this simple AcidCalc calculator\r\n"
										+ "has following control commands:\r\n\r\n"
										+ "help - to call this prompt\r\n"
										+ "end - to close input stream(turn off AcidCalc)\r\n"
										+ "avops - get available operations\r\n";
	public static final String CLI_AVAILABLE_OPERATIONS = "'+' - addition\r\n"
														+ "'-' - subtraction\r\n"
														+ "'/' - dividing\r\n"
														+ "'*' - multiplying\r\n"
														+ "'^' - bring to a power\r\n"
														+ "'!' - get factorial\r\n";
	public static final String CLI_ENDED = "AcidCalc was stopped by command 'end'\r\n";
}
