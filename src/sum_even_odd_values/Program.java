package sum_even_odd_values;

public class Program {
	static int even = 0;
	static int odd  = 0;
	public static void main(String[] args) {
		
		int secondArray[] = {2, 7, 9, 13, 8};
		int count = sumEvenAndOdd(secondArray,0);
		
		System.out.println("even numbers count : " + even);
		
		System.out.println("odd numbers count : " + odd);

	}
	
	public static int sumEvenAndOdd(int array[], int position) {
		
		if(position<array.length) { 		
			if (array[position]%2==0) {
				even++;
			}else {
				odd++;
			}
			return sumEvenAndOdd(array,position+1);
		}
		return 0;
	}

}
