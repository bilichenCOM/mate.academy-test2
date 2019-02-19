import java.util.Scanner;

public class CLI extends AcidCalcInterface implements Communicable{
	Scanner scan;
	
	@Override
	public void run() {
		String line = "";
		System.out.println(SALUTATION);
		System.out.println(CLI_LOGO);
		
		scan = new Scanner(System.in);
		line = scan.nextLine();
		
		if(line.toLowerCase().equals("end")) {
			stop();
			System.out.println(CLI_ENDED);
		} else if(line.toLowerCase().equals("help")) { 
			System.out.println(CLI_HELP);
			run();
		} else if(line.toLowerCase().equals("avops")) {
			System.out.println(CLI_AVAILABLE_OPERATIONS);
			run();
		} else {
			System.out.println(Computer.computeString(line));
			run();
		}
	}

	@Override
	public void stop() {
		scan.close();
	}
	
}
