package basic;

public class Summation {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(summation(5));
	}
	
	public static int summation(int n){
		int sum =0;
		int i =0;
		for (i = 0; i <= n; i++){
			sum =sum + i;
		}
		
		return sum;
		
	}

}
