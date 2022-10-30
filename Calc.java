
import java.util.Scanner;

public class Calc{
	
	public static void main(String [] args) {
		System.out.println(" Give in the Celcius value:");
		
		Scanner sc = new Scanner(System.in);
		double celcius = sc.nextDouble();
		double fahrenheit = 9.0/5.0 * celcius + 32.0;
		System.out.println("The Fahrenheit is:" +fahrenheit);
	}
}