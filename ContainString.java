import java.util.Scanner;

public class ContainString {
	public static void main(String[] args){
		Scanner  input1 = new Scanner (System.in);
		String  value1 = input1.nextLine();
		Scanner input2 = new Scanner (System.in);
		
		String value2 = input2.nextLine();
		
		if (value1.contains(value2))
			System.out.print( "Contain");
		
			else
				System.out.print( "Not contain");
	}

}
