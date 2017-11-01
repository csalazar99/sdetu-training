package basic;

public class NumberCalc {
	public static void main(String[] args) {
		System.out.println("Program is starting");
		int a = 10;
		int b = 20;
		PrintName();
		AddNumbers(a,b);
		int product = MultiplyNumbers(a,b);
		System.out.println("The product of number" + a + " and " + b + " is " + product);
		System.out.println("The product of number" + b + " and " + b + " is " + MultiplyNumbers(b,b));
		
		
	}
	
	static void PrintName() {
		System.out.println("My Name is Chris");
	}
	
	static void AddNumbers(int A, int B) {
		int sum = A + B;
		System.out.println("The sum of number" + A + " and " + B + " is " + sum);
	}
	
	static int MultiplyNumbers(int A, int B) {
		// function with return type
		int product = A * B;
		return product;
		
	}
}
