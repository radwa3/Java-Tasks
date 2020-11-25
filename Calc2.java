import java.util.Scanner;

public class Calc2 {

public static void main(String[] args){
		
		System.out.print( "Enter Number1"+"\n");
		Scanner input1 = new Scanner (System.in);
		int num1 = input1.nextInt();
		
		System.out.print( "Enter Number1"+"\n");
		Scanner input2 = new Scanner (System.in);
		int num2 = input2.nextInt();
		
		System.out.print( "Enter operation (+,-,*,/,%)"+"\n");
		Scanner operation = new Scanner (System.in);
		String ope = operation.nextLine();
		
		if(ope.equals("+"))
			System.out.print(num1+num2);
		
		else if (ope.equals("*"))
			System.out.print(num1*num2);
		
		else if (ope.equals("-"))
			System.out.print(num1-num2);
		
		else if (ope.equals("%"))
			System.out.print(num1%num2);
		
		else if (ope.equals("/"))
			System.out.print(num1/num2);
}
}
