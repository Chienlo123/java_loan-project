package dateandtime;

import java.util.Date;

public class dateandtime3 {

	public static void main(String[] args) {
		Date date = new Date();
		
		
		String str = String.format("Current Date/Time: %tc",date);
		
		System.out.printf(str);

	}

}
