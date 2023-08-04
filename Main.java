package Atmmachine;

import java.util.Scanner;

public class Main {
public static void main(String[] args) {
	atminterface ai=new Atm_implementation();
	int ATMID=12345678;
	int password=1234;
	Scanner sc=new Scanner(System.in);
	System.out.println("Welcome to XYZ ATM");
	System.out.println("Enter ATM Card ID");
	int id=sc.nextInt();
	System.out.println("Enter ATM Card Password");
	int pass=sc.nextInt();
	
	if(ATMID==id && password==pass) {
		while(true) {
			
		System.out.println("Menu");
		System.out.println("=============================");
		System.out.println("1.Check balance");
		System.out.println("2.Veiw mini statement");
		System.out.println("3.Withdraw Amount");
		System.out.println("4.Deposit Amount");
		System.out.println("5.Exit");
		System.out.println("-----------------------------");
		System.out.println("Enter your choice");
		int c=sc.nextInt();
		
		if(c==1) {
			ai.viewBalance();
		}
		else if(c==2){
			System.out.println();
			ai.viewMiniStatement();
			
		
		}
		else if(c==3) {
			System.out.println("Enter amount to withdraw ");
            double withdrawAmount=sc.nextDouble();
            ai.withdrawAmount(withdrawAmount);
		
		}
		else if(c==4) {
			
			System.out.println("Enter Amount to Deposit :");
            double depositAmount=sc.nextDouble();//5000
            ai.depositAmount(depositAmount);

		}
		else if(c==5) {
			System.out.println("Please collect your card");
			System.exit(0);
		}
		else {
			System.out.println("Entered wrong choice");
			System.exit(0);
		}
	}
	}
	else {
		System.out.println("ATM Card ID or Password is incorrect");
		System.out.println("Please collect your card");
		System.exit(0);
	}
}
}
