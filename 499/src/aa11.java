import java.util.Scanner;

public class aa11 {

	public static void main(String args[]) {
		
		
		try {
		Scanner abc= new Scanner(System.in);
		System.out.print("Enter a positive integer: ");
		int x = abc.nextInt();
		
		if(!(x>0)) {
			System.out.print("Try a positive integer");
		}else if(x%2==0) {
			x*=x;
			System.out.print("even number " + "\n");
			System.out.print("Square of x: "+ x);
		}else {
			x*=x;
			System.out.print("odd number "+ "\n");
			System.out.print("Square of x: "+ x);
		}
		
		
		
		//system allows users entering inputs and giving the results for the positive integer.
		
		   
		// system knows the number is even or odd and the square of that number.
		
		
		abc.close();
		}catch(Exception e){
			System.out.print("Invalid input");
		}
	}
}
