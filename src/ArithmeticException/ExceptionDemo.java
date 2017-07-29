package ArithmeticException;

/**
 *In here i've created a class named ExceptionDemo as mentioned in question
 */
public class ExceptionDemo {
	// main method
	public static void main(String[] args) {	
		/**
		 * in here crating object of ExceptionDemo class
		 */
		ExceptionDemo expOb= new ExceptionDemo();
		//and in here calling method doSomething
		expOb.doSomething();
	}
	/**
	 * In here i've created a method named doSomething as mentioned 
	 * in question
	 **/
	public void doSomething(){
		// now in here calling doMore();
		doMore();
		System.out.println("-----------");
		
			
		}
	/**
	 * In here i've created a another method void doMore() 
	 * as mentioned in question
	 */
	public void doMore(){
	/**
	 * ArithmeticExceptiont this exception occurs when an integer is 
	 * divided by zero.
	 * 
	 * */	
		int number=500/0;
		
	}	
}


