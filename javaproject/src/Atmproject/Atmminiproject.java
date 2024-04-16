package Atmproject;

import java.util.Scanner;

public class Atmminiproject {


		
		public static void main(String[] args) {
			
			Scanner sc=new Scanner(System.in);	//Scanner Object
			
			System.out.println("Welcome To ATM.....! ");
			
			System.out.println("Insert Your Card No");
			
			long a=sc.nextLong();
			
			int balance1=10000;
			
			String cum;
			while(true)
			{
			System.out.println("\nSelect The Transction\n");
			System.out.println("1.Withdraw Money \n2.Check Balance \n3.Deposite Money \n4.Exit ");
			
			int op=sc.nextInt();
			
			switch(op)
			{
				case 1:
				{
					
					
						System.out.println("Plz Enter your Amount");	
						int amount=sc.nextInt();
						
						System.out.println("Enter your Account Type");
						String actype=sc.next();
						
						System.out.println("Please Enter Your Pin...!");
						int pin=sc.nextInt();
						
						if(pin==4007)
						{
							System.out.println("");
							if(balance1>=amount)
							{
								System.out.println("Please Collect Your Cash & Check Carefully");
								int curentbal=balance1-amount;
								System.out.println("Curent Balance Is "+curentbal);
							}
							else 
							{
								System.out.println("Sorry Insufficient Balance...!");
								System.err.println("Your Balance  "+balance1);
							}
						}
						
						else 
						{
							System.out.println("Sorry You have Entered Wrog Pin plz Check");
						}
					
					 break;
				} 
				case 2:
				{
					System.out.println("Enter Account Type");
					String actype=sc.next();
					
					System.out.println("Please Enter Your Pin...!");
					int pin=sc.nextInt();
					
					if(pin==4007)
					{
						System.out.println("Your balance show Below");
						
						
						System.out.println("\nCurent Balance Is "+balance1);
					}
					
					else 
					{
						System.out.println("Sorry You have Entered Wrog Pin plz Check");
					}
					
					System.out.println("Do you Have Continue Transaction y/n");
					//String cum=sc.next();
					break;
				}
				case 3:
				{
					
					System.out.println("Enter Account Type");
					String actype=sc.next();
					
					System.out.println("Enter Note Type Details");
					
					System.out.println("How Many 100 Rs Notes");
					int note1= sc.nextInt();
					
					System.out.println("How Many 200 Rs Notes");
					int note2=sc.nextInt();
					
					System.out.println("How Many 500 Rs Notes");
					int note3=sc.nextInt();
					
					System.out.println("How Many 2000 Rs Notes");
					int note4=sc.nextInt();
					
					
					int tnote=note1+note2+note3+note4;
					
					System.out.println("Total Note is "+tnote);
					
					int damount= note1*100 + note2*200 + note3*500 + note4*2000;
					System.out.println("Deposite Amount is "+damount);
					
					balance1=damount+balance1;
					System.out.println("Curent Balance is " +balance1);
					break;
						
				}
				case 4:
				{	System.out.println("Thank you Visit Again");
					System.exit(0);
					
					
				}
			}
			
			
			
		}
		}
		
	}


