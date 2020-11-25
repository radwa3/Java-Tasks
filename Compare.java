import java.util.Scanner;

public class Compare {

	public static void main(String[] args){
		System.out.print( "Enter Size of list "+"\n");
		
		Scanner input = new Scanner (System.in);
		int size = input.nextInt();
		
		System.out.print( "please Enter "+size +" Numbers");
		
		int [] numbers = new int [size];
		
		for(int i=0; i< size;i++){
			Scanner input1 = new Scanner (System.in);
			numbers[i] = input1.nextInt();
		}
		
		System.out.print( "please Enter number need to search "+"\n");
		Scanner num = new Scanner (System.in);
		int number = num.nextInt();
	
		for(int i=0; i< size ;i++){
			if(numbers[i] == number){
				System.out.print( "Found");
		
			break;
			}
			if(i==size-1){
				System.out.print( "Not Found");
				break;
			}			
	}		
		
}
}
