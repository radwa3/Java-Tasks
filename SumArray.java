import java.util.Scanner;

public class SumArray {
	public static void main(String[] args){
		 int [] inputArray = new int[5];
		 int Sum = 0;
		 for(int i= 0;i<5;i++){
			 int y=i+1;
			 System.out.print("please Enter Number "+ y +": ");
			 Scanner  input = new Scanner (System.in);
			 inputArray[i]= input.nextInt();
			 Sum+= inputArray[i];
			 }
		
	      System.out.print(Sum);
	     }
}
