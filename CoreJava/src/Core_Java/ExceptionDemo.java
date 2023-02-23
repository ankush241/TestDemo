package Core_Java;

public class ExceptionDemo {

	public static void main(String[] args) {
		
		int a=10,b=20,x=0;
		
		try
		{
			int c=(a+b)/0;
		}
		catch(ArithmeticException e)
		{
			System.out.println(e);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		finally 
		{
			System.out.println("Exception Caught Successfully");
		}
		
	}

}
