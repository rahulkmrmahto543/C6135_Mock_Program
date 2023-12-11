package assignmentclass;

import java.util.Scanner;

public class Trianglestars {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j,rows;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number of rows");
		rows = sc.nextInt();
		for(i=1;i<=rows;i++)
		{
		for(j=1;j<=i;j++)
		{
		System.out.print("* ");
		}
		System.out.println("");
		}
		


	
	}

}
