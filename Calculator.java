package Game;
import java.util.*;

public class Calculator {
	public ArrayList<String> inputValues = new ArrayList<String>();
	public int sum = 0;
	public int temp = 0;
	
	public void readLine(String inputOper){
		if (!inputOper.equals("=")){
		inputValues.add(inputOper);
		}
	}
	
	public int sumValues(int inputVal){
		return sum += inputVal;
	}
	
	public int minusValues(int inputVal){
		return sum -= inputVal;
	}
	
	public int multiplyValues(int inputVal){
		 return sum *= inputVal;
	}
	
	public int divisionValues(int inputVal){
	     return sum /= inputVal;
	}
	
	public void calcSum(){
		for(String element : inputValues){
			if (element.equals("+") || element.equals("-") ||
				element.equals("*") || element.equals("/")){
				switch(element){
				case "+" :
					sum = sumValues(temp);
					break;
				case "-" :
					sum = minusValues(temp);
					break;
				case "*" :
					sum = multiplyValues(temp);
					break;
				case "/" :
					sum =divisionValues(temp);
					break;
				default :
					System.out.println("Unknown convert operator" + element);
					System.exit(1);
				}	
			}else{
				temp = Integer.parseInt(element);
				System.out.println(temp);
			};
		};
	}
	
	public void viewSum(){
		System.out.println("Suma este: "+ this.sum);
	}
}
