import java.util.Scanner;

import javax.swing.JOptionPane;

public class UserData {
	public static void main(String[] args){
		
		String [] userdata = new String[6];
		
		userdata[0] = JOptionPane.showInputDialog("please Enter your name");
		userdata[1] = JOptionPane.showInputDialog("please Enter your mobile");
		userdata[2] = JOptionPane.showInputDialog("please Enter your email");
		userdata[3] = JOptionPane.showInputDialog("please Enter your age");
		userdata[4] = JOptionPane.showInputDialog("please Enter your faculty");
		userdata[5] = JOptionPane.showInputDialog("please Enter your department");
	printdata(userdata);
			
	}
	
	public static void printdata (String [] data ){
		System.out.print( "your Data : "+ "\n");
		 for(int i= 0;i<6;i++){
			 System.out.print( data[i] + "\n");
		 }
		
	}
}
