/*Write a program with which you can simulate one round of a fight between you and a monster.
First we read in the attributes of each of you.
Then we play one round of fight.

Fighting Rules
            Attributes:
			
1. Attack Points(AP): Determine how strong you are in attacking the other party.
2. Defense Points(DP): How good you are in defending yourself.
3. Damage(D): How many damages you can cause to the other party.
4. Life Points(LP): How healthy you are. If it goes to zero then youre dead.

           Fight(One round):
		   
1. Attacker is chosen randomly(coin toss).
2. We then roll to dice, Attack Points + 2Dice? We compare with to Enemy's Defense points.
   If the Attack Points is greater than the Defense points, then the attack is successful and
   the enemy's Life Points is reduced by the Damage. Otherwise, the attack is not succcessful!!
*/
import java.util.Scanner;
import java.util.Random;

public class FightingGame{
	
	public static void main(String [] args){
		//Reading all the attributes.
		Scanner sc = new Scanner(System.in);
		System.out.println("Attack Points of Monster:");
		int monsterAttack = sc.nextInt();
		System.out.println("Defense Points of Monster:");
		int monsterDefense = sc.nextInt();
		System.out.println("Damage of Monster:");
		int monsterDamage = sc.nextInt();
		System.out.println("Life Points of Monster:");
		int monsterLife = sc.nextInt();
		
		System.out.println("Your Attack Points:");
		int yourAttack = sc.nextInt();
		System.out.println("Your Defense Points:");
		int yourDefense = sc.nextInt();
		System.out.println("Your Damage:");
		int yourDamage = sc.nextInt();
		System.out.println("Your Life Points:");
		int yourLife = sc.nextInt();
		
		//After reading all the attributes, we now start fighting round.
		
		//Let's generate the random number to determine who will attack.
		
		Random generator = new Random();
		boolean attacker = generator.nextBoolean();
		if (attacker){
			System.out.println("You Attack");
			//Roll to Dice. We need to generate another random value, in this case the number(0 to 5) then add two dice.
			int dice = generator.nextInt(6)+1 + generator.nextInt(6)+1; 
			int attackValue = yourAttack + dice;
			System.out.println("The Rolled value:"+dice);
			System.out.println("Your Attack Value is :"+attackValue);
			if (attackValue > monsterDefense){
				System.out.println("Your Attack was Successfull.");
				monsterLife = monsterLife - yourDamage;
				 System.out.println("Monster's remaining Life Points:"+monsterLife);
			}
			else {
				System.out.println("Your Attack was not Successfull");
			}
			
		}
		else {
			System.out.println("Monster Attacks");
			int dice = generator.nextInt(6)+1 + generator.nextInt(6)+1; 
			int attackValue = monsterAttack + dice;
			System.out.println("The Rolled value:"+dice);
			System.out.println("Monster's Attack Value is :"+attackValue);
			if (attackValue > yourDefense){
				System.out.println("Monster's Attack was Successfull.");
				yourLife = yourLife - monsterDamage;
				 System.out.println("Your remaining Life Points:"+yourLife);
			}
			else {
				System.out.println("Monster's Attack was not Successfull");
			}
			
		}
	}
}