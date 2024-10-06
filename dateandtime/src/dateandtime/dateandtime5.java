package dateandtime;

import java.util.Date;

public class dateandtime5 {

	public static void main(String[] args) {
		
		Date date = new Date();
		
		System.out.printf("%s %tB %<te, %<tY" ,"Due date:",date);
		
	}

}
