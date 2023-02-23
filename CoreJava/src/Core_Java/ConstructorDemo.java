package Core_Java;

public class ConstructorDemo {
	
	int x=10;
	public ConstructorDemo()
	{
		System.out.println("Hello,I am the Constructor");
	}
	public ConstructorDemo(int a, int b)
	{
		int x=20;
		int c=a+b+x+this.x;
		System.out.println(c);
	}
	public void show()
	{
		System.out.println("Hello, I am the method");
	}
	
	
	public static void main(String[] args) {
		
		ConstructorDemo cd = new ConstructorDemo();
		ConstructorDemo cd1 = new ConstructorDemo(10,20);
		cd.show();
		
	}

}
