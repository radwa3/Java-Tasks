import java.util.Scanner;

public class Welcome {

	public static void main(String[] args){
		String [] names = new String [10];
		
		for (int i =0; i<10;i++){
			System.out.print( "Enter Your Name");
			Scanner input = new Scanner (System.in);
			names[i] = input.nextLine();
			
		}
		for (int i =0; i<10;i++){
			System.out.print( names[i]+"\n");
			
			
		}
	
	}
}
