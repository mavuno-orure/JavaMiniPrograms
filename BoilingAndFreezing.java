
import java.util.Scanner;


public class BoilingAndFreezing{
	
	public static void main(String [] args){
		
		System.out.println("Give in Temparature Values:");
		
		Scanner sc = new Scanner(System.in);
		int temp = sc.nextInt();
		if (temp >= 100){
			System.out.println("The Water is Boiling");
		} 
		else if (temp <=0){
			System.out.println("The Water is Freezing");
			
		}
		else {
			System.out.println("The Water is in Normal State");
		}
	}
}