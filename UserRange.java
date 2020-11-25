import java.util.Scanner;

public class UserRange {

public static void main(String[] args){
		
		System.out.print( "Enter Your Grade");
		Scanner input = new Scanner (System.in);
		String  value = input.next();
		
		if(value.equals("A"))
			System.out.print( " This grade start from 85 till 100 ");
			
		else if(value.equals("B"))
			System.out.print( " This grade start from 75 till 85 ");
		
		else if(value.equals("C"))
			System.out.print( " This grade start from 50 till 65 ");
		
		else if(value .equals("D"))
			System.out.print( " This grade start from 0 till 50 ");
		
		
	}
}
