import java.util.Scanner;

public class CLI extends AcidCalcInterface implements Communicable{
	Scanner scan;
	String textline;
	
	@Override
	public void run() {
		scan = new Scanner(System.in);
		System.out.println(SALUTATION);
		if(scan.hasNext()) textline = scan.nextLine();
		while(scan.hasNext()) {
			System.out.print("more");
		}
		stop();
	}

	@Override
	public void stop() {
		scan.close();
	}

	public String getExpression() {
		
		return null;
	}
	
}
