
public class ExceptionHandlingDemo {

public static void main(String[] args) {
demo();
}

public static void demo() {
try {
		
		
		System.out.println("Hello World");
		int i=1/0;
		System.out.println("Completed");
			
	}
	catch(Exception exp) {
		System.out.println("Entered Catch block");
		System.out.println("Message is "+exp.getMessage());
		System.out.println("Message is "+exp.getCause());
		exp.printStackTrace();
	}
	
	finally {
		System.out.println("Entered Finally block");
		
	}
	
	
}
}
	
	
	
	
	

