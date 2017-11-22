package cs;

import java.util.Scanner;

public class Summation {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Number 1 is : ");
		int Num1 = sc.nextInt();
		System.out.print("Number 2 is : ");
		int Num2 = sc.nextInt();
		System.out.print("Number 3 is : ");
		int Num3 = sc.nextInt();
		
		int TotalNum = Num1 + Num2 + Num3;
		double Average = TotalNum/3.0;
		
		System.out.println();
		System.out.println("Total Number is : " + TotalNum);
		System.out.println("Average is : " + Average);
		
		
		sc.close();
	}

}
