import java.util.Scanner;
public class Fibonacci2 {
    public static void main(String[] args) 
	{
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();

		int previousNumber = 0;
		int nextNumber = 1;
		 
	    System.out.print("Fibonacci series of "+number+" numbers is: ");
 
	    for (int i = 1; i <= number; ++i){
	        System.out.print(previousNumber+" ");
	        int sum = previousNumber + nextNumber;
	        previousNumber = nextNumber;
	        nextNumber = sum;
	    }
	}
}
