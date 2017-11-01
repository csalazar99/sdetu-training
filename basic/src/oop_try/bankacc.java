package oop_try;

public class bankacc {
	
	String AccountNumber;
	String RoutingNumber;
	String Name;
	String SSN;
	String AccountType;
	double balance = 0;
	
	//constructor defenition: unique methods
	// 1.) They are used to define / setup / initialize propersties of an object
	// 2.) Constructors are IMPLICITLY called upon Instantation
	// 3.) The same name as the class itself
	// 4.) Constructors have no return value
	bankacc(){
		System.out.println(" new account created");
	}
	
	// Overloading: call same method name with different arguments
	bankacc(String AccountType){
		System.out.println("New account created :" + AccountType);
	}
	bankacc(String AccountType, double InitDeposit){
		System.out.println("New account created :" + AccountType);
		System.out.println("Initial Deposit of : $" + InitDeposit);
		if (InitDeposit < 1000) {
			System.out.println("Your deposit is too low");
		}else {
			System.out.println("Thanks for your initial deposit of : $" + InitDeposit);
		}
		balance= balance + InitDeposit;
	}
	
	void deposit() {
		System.out.println();
		
	}
	
	void withdraw() {
		
	}
	
	void CheckBalance() {
		System.out.println("Balance is :$" + balance);
		
	}
	
	void GetStatus() {
		
	}

}
