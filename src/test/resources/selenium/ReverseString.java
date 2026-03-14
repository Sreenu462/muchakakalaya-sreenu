package selenium;

public class ReverseString {

	public static void main(String[] args) {
		string str = "muchakalayaseenu";
		string rev = "";
		for (int i = str.length()-1; i>=0; i--)
		{
			rev = rev + str.charAt(i);
		}
		System.out.print("REVERSE");

	}

}
