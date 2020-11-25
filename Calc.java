import java.util.Scanner;

public class Calc {
public static void main(String[] args){
		
		System.out.print( "Enter Numbers"+"\n");
		int [] numbers = new int [5];
		int sum =0 ;
		int ava =0;
		for(int i=0;i<5;i++){
			
			Scanner input = new Scanner (System.in);
			numbers[i] = input.nextInt();
			sum=sum+numbers[i];
			
			}
		ava=sum/2;
		System.out.print( "Sum="+ sum+ "\n");
		System.out.print( "ava="+ ava);
		
}

}
