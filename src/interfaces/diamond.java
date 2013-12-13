package interfaces;

public class diamond {

	public static void main(String[] args){
		ClassWithNoImpl noImpl = new ClassWithNoImpl();		
		int count1 = noImpl.countChars(null);
		
		ClassWithImpl hasImpl = new ClassWithImpl();
		int count2 = hasImpl.countChars(null);
		
		Exp1 exp1 = new Exp1();
		int count3 = exp1.countChars(null);
		
		System.out.println("null gives a " + count1 + " value");
		System.out.println("null gives a " + count2 + " value");
		System.out.println("null gives a " + count3 + " value");
		
		exp1.printCount("abcdefghijk");
		exp1.printCount(null);
	}
}


interface A {
	default int countChars(String str){
		if(str==null)
			return -1;
		else
			return str.length();
	}	
}

interface B extends A{
	
}

interface C extends A{
	default int countChars(String str){
		if(str==null)
			return -10;
		else
			return str.length();
	}	
}

interface E extends B, C {
	default int countChars(String str){
		if(str==null)
			return -100;
		else
			return str.length();
	}	
}

interface F {
	default int countChars(String str){
		if(str==null)
			return -12;
		else
			return str.length();
	}	
	
	default void printCount(String str){
		if(str==null)
			System.out.println("Null has " + this.countChars(str) + " char(s).");
		else
			System.out.println(str.toString() + " has " + this.countChars(str) + " char(s).");
	}
}

class Exp1 implements A, F {
	public int countChars(String str){
		return A.super.countChars(str);
	}
}

class ClassWithImpl implements E {
	public int countChars(String str){
		if(str==null)
			return -2;
		else
			return str.length();
	}
}

class ClassWithNoImpl implements E {
}