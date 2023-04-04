package Core_Java;

public class StringDemo1 {

	public static void main(String[] args) {
		
		String s1= "Ankush";
		String s2= "";
		
		for (int i=0;i<s1.length();i++)
		{
			s2= s1.charAt(i) + s2;
		}
		System.out.println("Original String : " + s1);
		System.out.println("Reverse String : " + s2);

	}

}
