
public final class StringComputer {
	public static final String DIGITS = "0123456789";
	public static final String OPERATIONS = "+-/*";
	
	public static String computeString(String s) {
		try {
			/*  
			 *	
			 */
			if(s.indexOf("(")>=0&&s.indexOf(")")>=0) {
				int parO = s.indexOf("(");
				int parC = s.indexOf(")");
				s = s.substring(0,parO)+computeString(s.substring(parO+1,parC))+s.substring(parC+1);
				System.out.println(s+"=");
			}
			/*
			 * 
			 */
			while(s.indexOf("!")>=0) {
				int f = s.indexOf("!");
				String l = s.substring(0,f);
				String r = s.substring(f+1);
				double d0 = Double.parseDouble(l.replaceAll("^.*[\\+-[\\*]/]", ""));
				if(d0>16) return "factorial can be only computed for n<=16 not for n="+d0;
				d0 = factorial((int)d0);
				s = l.replaceAll("\\d+\\.*\\d*$", "")+d0+r;
				System.out.println(s+"=");
			}
			/*
			 * 
			 */
			while(s.indexOf("*")>=0) {
				int ast = s.indexOf("*");
				String l = s.substring(0,ast);
				String r = s.substring(ast+1);
				double d0 = Double.parseDouble(l.replaceAll("^.*[\\+-[\\*]/]", ""));
				double d1 = Double.parseDouble(r.replaceAll("[\\+-[\\*]/].+", ""));
				d0*=d1;
				s = l.replaceAll("\\d+\\.*\\d*$", "")+d0+r.replaceAll("^(\\d+\\.*\\d*)", "");
				System.out.println(s+"=");
			}
			/*
			 * 
			 */
			while(s.indexOf("/")>=0) {
				int div = s.indexOf("/");
				String l = s.substring(0,div);
				String r = s.substring(div+1);
				double d0 = Double.parseDouble(l.replaceAll("^.*[\\+-[\\*]/]", ""));
				double d1 = Double.parseDouble(r.replaceAll("[\\+-[\\*]/].+", ""));
				d0/=d1;
				s = l.replaceAll("\\d+\\.*\\d*$", "")+d0+r.replaceAll("^(\\d+\\.*\\d*)", "");
				System.out.println(s+"=");
			}
			/*
			 * 
			 */
			while(s.indexOf("+")>=0) {
				int plus = s.indexOf("+");
				String l = s.substring(0,plus);
				String r = s.substring(plus+1);
				double d0 = Double.parseDouble(l.replaceAll("^.*[\\+-[\\*]/]", ""));
				double d1 = Double.parseDouble(r.replaceAll("[\\+-[\\*]/].+", ""));
				d0+=d1;
				s = l.replaceAll("\\d+\\.*\\d*$", "")+d0+r.replaceAll("^(\\d+\\.*\\d*)", "");
				System.out.println(s+"=");
			}
			/*
			 * 
			 */
			if(s.indexOf("-")>=0) {
				int minus = s.indexOf("-");
				if(minus==0) return "-"+computeString(s.substring(1).replaceAll("-", "+"));
				String l = s.substring(0,minus);
				String r = s.substring(minus+1);
				double d0 = Double.parseDouble(l.replaceAll("^.*[\\+-[\\*]/]", ""));
				double d1 = Double.parseDouble(r.replaceAll("[\\+-[\\*]/].+", ""));
				d0-=d1;
				s = l.replaceAll("\\d+\\.*\\d*$", "")+d0+r.replaceAll("^(\\d+\\.*\\d*)", "");
				System.out.println(s+"=");
				s = computeString(s);
			}
		} catch (NumberFormatException e) {
			return "#invalid_format:"+s;
		}
		return s;
	}
	public static String validateString(String s) {
		
		return s;
	}
	public static int factorial(int n) {
		return (n<=1)?1:n*factorial(n-1);
	}
	
}
