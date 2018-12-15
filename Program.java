package Game;
import java.util.*;

public class Program {
	
	public static void main(String[] args) {
		String inputvalue = " ";
		Calculator calc = new Calculator();
		Scanner sc = new Scanner(System.in);
		while(!inputvalue.equals("=")){
			inputvalue = sc.nextLine();
			calc.readLine(inputvalue);
		};
		calc.calcSum();
		calc.viewSum();
		
	}

}
