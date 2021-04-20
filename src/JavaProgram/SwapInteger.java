package JavaProgram;

public class SwapInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//  Method 1 (Using Arithmetic Operators):
			int x = 10, y = 5;
			 
			  // Code to swap 'x' and 'y'
			  x = x + y;  // x now becomes 15
			  y = x - y;  // y becomes 10
			  x = x - y;  // x becomes 5

			// Multiplication and division can also be used for swapping:
			x = x * y;  // x now becomes 50
			  y = x / y;  // y becomes 10
			  x = x / y;  // x becomes 5

			// Method 2 (Using Bitwise XOR):
			 x = x ^ y;  // x now becomes 15 (1111)
			  y = x ^ y;  // y becomes 10 (1010)
			  x = x ^ y;  // x becomes 5 (0101)
	}

}
