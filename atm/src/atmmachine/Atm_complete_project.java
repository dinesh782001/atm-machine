package atmmachine;
import java.util.*;
//this a basic level mini atm ideas?
public class Atm_complete_project {

	public static void main(String[] args) {
		int pin=1234;
		int balance=10000;
		int add_amount=0;
		int take_amount=0;
		String name;
		Scanner sc=new Scanner(System.in);
		//user pin number
		System.out.println("enter your pin no sir =");
		int password=sc.nextInt();
		if(password==pin) {
			System.out.println("enter your name sir = ");
			name=sc.next();
			System.out.println("welcome "+ name);
			while(true) {
				System.out.println("press 1 to check your balance");
				System.out.println("press 2 add amount ");
				System.out.println("press 3 to take amount");
				System.out.println("press 4 to resipt");
				System.out.println("press 5 to exit ");
				int option=sc.nextInt();
				switch(option) {
				case 1:
					System.out.println("your current balance is " +balance);
					break;
				case 2:
					System.out.println("how much did you wanna a add sir ");
					add_amount=sc.nextInt();
					System.out.println("amount added successfully");
					balance+=add_amount;
					break;
				case 3:
					System.out.println("how much amount do you wanna take over");
					take_amount=sc.nextInt();
					if(take_amount>balance) {
						System.out.println("too amount you asking ");
						System.out.println("try less than your current available ");
						
					}
					else {
						System.out.println("successfully done");
						balance-=take_amount;
						
					}
					break;
				case 4:
					System.out.println("welcome to atm dinesh ");
					System.out.println("available balance is  "+ balance);
					System.out.println("amount deposited is "+ add_amount);
					System.out.println("amount taken  " + take_amount);
					System.out.println("thank you sir ");
					break;
				default:
					System.out.println("enter 5 to exit sir ");
					break;
					
				}
				if(option==5) {
					System.out.println("thank you");
				}
				
			
			else
			{
				System.out.println("enetr the register pin no");
			}
		}
		
		
		
		
		
		
		
		}
		
		
		
		
		
		
		
		
		
		
		
	
	
	
}
}
