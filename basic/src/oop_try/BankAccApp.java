package oop_try;

public class BankAccApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		bankacc acc1 = new bankacc();


		bankacc acc2 = new bankacc();
		
		bankacc acc3 = new bankacc("Savings",1000);
		acc3.CheckBalance();
	}

}
