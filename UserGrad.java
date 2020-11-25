import java.util.Scanner;

public class UserGrad {
	public static void main(String[] args){
		
		System.out.print( "Enter Your Grade");
		Scanner input = new Scanner (System.in);
		int  value = input.nextInt();
		
		if(value <=100 && value>85)
			System.out.print( " Your Grade is A");
			
		else if(value <=85 && value>75)
			System.out.print( " Your Grade is B");
		
		else if(value<=65 && value>50)
			System.out.print( " Your Grade is C");
		
		else if(value<=50 && value>=0)
			System.out.print( " Your Grade is D");
		
		
	}

}
