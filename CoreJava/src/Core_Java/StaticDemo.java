package Core_Java;


public class StaticDemo {

	int rollno;
	String name;
	static String college= "MAKAUT";
	
	StaticDemo(int rollno, String name)
	{
		this.rollno= rollno;
		this.name= name;
	}
	public void show()
	{
		System.out.println(rollno + "\t" +name+ "\t" +college);
	}
	public static void main(String[] args) {
		
		StaticDemo sd = new StaticDemo(10, "Sayan");
		StaticDemo sd1 = new StaticDemo(15, "Ayan");
		StaticDemo sd2 = new StaticDemo(30, "Proloy");
		sd.show();
		sd1.show();
		sd2.show();
	}

}
