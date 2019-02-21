
public final class StringComputer {
	
	public static String computeString(String s) {
		try {
			/*  
			 *	if expression contains Roman numerical
			 *	we will check it and replace with decimal
			 *	using replaceRomanNumerials();
			 */
			s=replaceRomanNumerials(s);
			/*
			 *  then we should compute
			 *  expressions which are enclosed
			 *  with parentheses. If input string contains
			 *  parentheses we take the expression inside ()
			 *  and use recursion to invoke computeString() again
			 */
			while(s.indexOf("(")>=0&&s.indexOf(")")>=0) {
				int parO = s.indexOf("(");
				int parC = s.indexOf(")");
				s = s.substring(0,parO)+computeString(s.substring(parO+1,parC))+s.substring(parC+1);
				System.out.println(s+"=");
			}
			
			/*
			 * we should correct consequences of
			 * replacing roman numerals with decimal
			 * using validateString()
			 * 
			 */
			s=validateString(s);
			
			/*
			 * in the next block factorials
			 * will be computed
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
			 *next block execute multiplying and dividing
			 * 
			 */
			
			while(s.indexOf("*")>=0||s.indexOf("/")>=0) {
				int ast = s.indexOf("*");
				int slash = s.indexOf("/");
				if((ast<slash&&ast!=-1)||slash==-1) {
					String l = s.substring(0,ast);
					String r = s.substring(ast+1);
					double d0 = Double.parseDouble(l.replaceAll("^.*[\\+-[\\*]/]", ""));
					double d1 = Double.parseDouble(r.replaceAll("[\\+-[\\*]/].+", ""));
					d0*=d1;
					s = l.replaceAll("\\d+\\.*\\d*$", "")+d0+r.replaceAll("^(\\d+\\.*\\d*)", "");
					System.out.println(s+"=");
					continue;
				} else {
					String l = s.substring(0,slash);
					String r = s.substring(slash+1);
					double d0 = Double.parseDouble(l.replaceAll("^.*[\\+-[\\*]/]", ""));
					double d1 = Double.parseDouble(r.replaceAll("[\\+-[\\*]/].+", ""));
					d0/=d1;
					s = l.replaceAll("\\d+\\.*\\d*$", "")+d0+r.replaceAll("^(\\d+\\.*\\d*)", "");
					System.out.println(s+"=");
					continue;
				}
			}
			/*
			 * next block execute addition and subtraction
			 * 
			 */
			while((s.substring(1).indexOf("+")>=0||s.substring(1).indexOf("-")>=0)&&s.length()>=1) {
				int plus = s.indexOf("+");
				int minus = s.substring(1).indexOf("-")+1;
				if((plus<minus&&plus!=-1)||minus<=0) {
					String l = s.substring(0,plus);
					String r = s.substring(plus+1);
					double d0 = Double.parseDouble(l);
					double d1 = Double.parseDouble(r.replaceAll("[\\+-[\\*]/].+", ""));
					d0+=d1;
					s = l.replaceAll("^(\\-)*\\d+\\.*\\d*$", "")+d0+r.replaceAll("^(\\d+\\.*\\d*)", "");
					System.out.println(s+"=");
					continue;
				} else {
					String l = s.substring(0,minus);
					String r = s.substring(minus+1);
					double d0 = Double.parseDouble(l);
					double d1 = Double.parseDouble(r.replaceAll("[\\+-[\\*]/].+", ""));
					d0-=d1;
					s = l.replaceAll("^(\\-)*\\d+\\.*\\d*$", "")+d0+r.replaceAll("^(\\d+\\.*\\d*)", "");
					System.out.println(s+"=");
					continue;
				}
			}
		} catch (NumberFormatException e) {
			e.printStackTrace();
			return "#invalid_format:"+s;
		} catch (Exception e) {
			return "UnexpectedException: please check format";
		}
		return s;
	} //end of computeString()
	/*
	 * 
	 * 
	 * 
	 */
	private static String replaceRomanNumerials(String s) {
		if(s.toUpperCase().replaceAll("[IVX]", "").length()==s.length()) return s;
		if(s.toUpperCase().replaceAll("[IVX]", "").length()!=s.toUpperCase().replaceAll("[IVX]", "").replaceAll("[0-9]", "").length()) {
			return "expression must contain either roman or arabic numerals";
		}
		s=s.toUpperCase();
		s=s.replaceAll("IX", "+9+");
		s=s.replaceAll("X", "+10+");
		s=s.replaceAll("IV", "+4+");
		s=s.replaceAll("V", "+5+");
		s=s.replaceAll("I", "+1+");
		return s;
	}//end of replaceRomanNumerials()
	/*
	 * 
	 */
	private static String validateString(String s) {
		s=s.replaceAll("\\+-", "-");
		s=s.replaceAll("^(\\+)", "");
		s=s.replaceAll("\\-$", "");
		s=s.replaceAll("\\+$", "");
		s=s.replaceAll("[\\+]+", "+");
		s=s.replaceAll("-\\+", "-");
		s=s.replaceAll("\\+\\*", "*");
		s=s.replaceAll("\\+/", "/");
		s=s.replaceAll("\\+!", "!");
		
		return s;
	}//end of validateString()
	/*
	 * 
	 * next method computes factorials
	 */
	public static int factorial(int n) {
		return (n<=1)?1:n*factorial(n-1);
	}//end of factorial()
	/*
	 * 
	 */
	
}//end of StringComputer
