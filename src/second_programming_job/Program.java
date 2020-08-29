package second_programming_job;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int division = division(60,15);
		System.out.println("The result of division is: " + division);
		
		int pow = pow(2,3);
		System.out.println("The result of power is: " + pow);
		
		int factorial = factorial(5);
		System.out.println("The result of factorial is: " + factorial);
		
		int array[] = {1,3,4};
		int total = sumValues(array, 0);
		System.out.println("The result of sum of values in array is: " + total);
		
		
		
		
	}
	
	public static  int division(int n1, int n2) {
		if(n1-n2 < 0) {
			
			return 0;
		}
		
		return 1 + division(n1-n2, n2);
	}
	
	public static  int pow(int n1, int n2) {
		if(n2 == 1) {
			
			return n1;
		}
		
		return n1 * pow(n1, n2-1);
	}
	
	public static  int factorial(int number) {
		if(number == 0) {
			
			return 1;
		}
		
		return number * factorial(number -1);
	}
	
	public static int sumValues(int array[], int position) {
		if(position<array.length) {
			
			return array[position]+sumValues(array,position+1);
		}
		
		return 0;
	}
	
	

}
