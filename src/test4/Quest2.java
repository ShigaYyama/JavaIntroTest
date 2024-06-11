package test4;

import java.util.Random;
import java.util.Scanner;

public class Quest2 {

	public static void main(String[] args) {
		
		User com = new User("Com");
		User person = new User("person");	
		Program program = new Program();

		Scanner input = new Scanner(System.in);

		do {

			program.Start();
			String personHand = input.next();
			
	        Random ram = new Random();		        
	        String ramIndex = String.valueOf(ram.nextInt(3));

	        person.SetHand(personHand);
			com.SetHand(ramIndex);

			program.Battle(person.Hand, com.Hand);
			program.end();

		} while (!program.Finish);

	}

}
