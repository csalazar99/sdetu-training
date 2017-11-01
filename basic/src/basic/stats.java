package basic;

public class stats {

	public static void main(String[] args) {
		int[] numbers = {1,2,1,2,34,5,3,-12};
		float MinVal = 100000;
		float MaxVal =  -100000;
		float AverageVal = 0;
		
		MinVal = MinValue(numbers);
		System.out.println("minimum value is :" + MinVal);
		
		
		MaxVal = MaxValue(numbers);
		System.out.println("maximum value is :" + MaxVal);
		

		AverageVal = AverageValue(numbers);
		System.out.println("Average value is :" + AverageVal);
		
		
	}
//**********************************************************************************************	
	
	
	public static float MinValue (int[] numbers){
		float MinVal=100000;
		int i =0;
		for (i = 0; i < numbers.length; i++){
			if (numbers[i] < MinVal){
				MinVal = numbers[i];
			}
		
		}
		return(MinVal);
	}
//**********************************************************************************************	
	public static float MaxValue(int[] numbers){
		float MaxVal = -100000;
		int i =0;
		for (i = 0; i < numbers.length; i++){
			if (numbers[i] > MaxVal){
				MaxVal = numbers[i];
			}
			
		}
		return (MaxVal);
		
	}
	
//**********************************************************************************************	
	public static float AverageValue(int[] numbers){
		int i =0;
		float AverageVal = 0;
		
		for (i =0; i < numbers.length; i++){
			AverageVal =AverageVal  + numbers[i];
		}
		AverageVal=AverageVal/numbers.length;
	
	
		return (AverageVal);
	}
	
	
	
}
