
public final class Computer {
	public static final String DIGITS = "0123456789";
	public static final String OPERATIONS = "+-/*\\^\\!";
	
	public static int computeString(String s) {
		System.out.println(s);
		try {
			Integer.parseInt(s);
		} catch (Exception e) {
			return 0;
		}
		return (s!=null)?Integer.parseInt(s)+1:
			0;
	}
	
}
