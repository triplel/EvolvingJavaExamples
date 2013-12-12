package closure;

public class LambdaExpressions {
	
	interface StringService {
		Boolean checkIfEmpty(String s);	
	}
	
	public StringService stringServ = s -> s.isEmpty();

		
	public Runnable r1 = () -> {System.out.println("Runner 1 speaks English: \"Hello! Good day!\"");};
	public Runnable r2 = () -> {System.out.println("Runner 2 speaks German: \"Hallo! Guten tag!\"");};
	
	public static void main(String[] args){
		LambdaExpressions lambda = new LambdaExpressions();
		
		String str = "I am not empty";
		
		boolean isEmpty = lambda.stringServ.checkIfEmpty(str);
		System.out.println("the string \"" + str + "\" is empty:" + isEmpty);
		
		lambda.r1.run();
		lambda.r2.run();			
	}
}
