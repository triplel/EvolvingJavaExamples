package closure;

public class LambdaExpressions {
	
	interface StringService {
		Boolean checkIfEmpty(String s);
		
	}
	
	public Runnable r1 = () -> {System.out.println("Runner 1 speaks English: \"Hello! Good day!\"");};
	public Runnable r2 = () -> {System.out.println("Runner 2 speaks German: \"Hallo! Guten tag!\"");};
	
	public StringService stringServ = String::isEmpty;
	
	public static void main(String[] args){
		LambdaExpressions lambda = new LambdaExpressions();
		lambda.r1.run();
		lambda.r2.run();
		
	}
}
