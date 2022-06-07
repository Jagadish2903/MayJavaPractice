package JavaSessions;

import java.util.Scanner;

public class Loops {

	public static void main(String[] args) {

		//1.while loop:
		
		int i=1;
		while(i<=10) {
			System.out.println(i);
			i++;
		}
	
		
		//print even numbers from 1-100
		
		int j=2;
		
		while(j<=100) {
			
			System.out.println(j);
			j=j+2;
		}
		
	System.out.println("-------------------------------------"); 
		
		//2.for loop:
		
		for(int l=1;l<=10;l++) {
			System.out.println(l);
		}
		
		System.out.println("---------------------------------------------");
		
		
		
		
		//eg.
		
		for(char c='0';c<='z';c++) {
			System.out.println((int)c);
		}
		
		System.out.println("---------------------------------------------");
		
		
		//3.do-While loop
		int r=1;
		do {
			System.out.println(r);
			r++;
		}while(r>=10);
		
		
		System.out.println("---------------------------------");
		
		//enter number and output should say whether its positive or negative
		
		Scanner sc =new Scanner(System.in);
		System.out.print("Please enter a number...");
		int input=sc.nextInt();
		if(input<0) {
			System.out.println("Entered number is Negative");
		}else if (input>0) {
			System.out.println("Entered number is Posiitve");
		}else {
			System.out.println("Number is zero");
		}
	
		
		
		
	}

}
