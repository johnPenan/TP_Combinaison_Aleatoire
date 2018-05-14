import java.util.Random;
import java.util.Scanner;

public class Combinaison {

	public static void main(String[] args) {
		Random rand = new Random();
		int nbreSecret = rand.nextInt(100 + 1), maCombinaison, essai = 0;
		Scanner sc = new Scanner(System.in);
		char reponse = ' ';

		do {
			System.out.println(nbreSecret);
			System.out.println("Veillez trouver le nombre secret:");
			maCombinaison = sc.nextInt();
			sc.nextLine();

		} while (reponse == 'O');

	}

}
