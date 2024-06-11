package test4;

import java.util.Scanner;

public class Quest1 {

	public static void main(String[] args) {

		User com = new User("Com");
		User person = new User("person");
		Program program = new Program();
		
		Scanner input = new Scanner(System.in);

		do {

			program.Start();
			String personHand = input.next();

			person.SetHand(personHand);
			com.SetHand("1");

			program.Battle(person.Hand, com.Hand);
			program.end();

		} while (!program.Finish);

	}

}
