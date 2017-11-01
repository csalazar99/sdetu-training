/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trainingtry;

/**
 *
 * @author csalaza2
 */
public class stats {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numbers = {1,2,1,2,34,5,3,-12};
		int MinVal = 100000;
		int MaxVal =  0;
		int AverageVal = 0;
		int i = 0;
		
		for (i = 0; i < numbers.length; i++){
			if (numbers[i] < MinVal){
				MinVal = numbers[i];
			}
		}
		
		
		
		System.out.println("minimum value is :" + MinVal);
		
		
		
	}

}
