import java.util.Random;
import java.util.Scanner;

public class Combinaison {

	public static void main(String[] args) {
		Random rand = new Random();
		int nbreSecret = rand.nextInt(100 + 1), maCombinaison = 0, essai = 0;
		Scanner sc = new Scanner(System.in);
		char reponse = ' ';

		do {
			essai = 0;
			do {
				essai++;
				System.out.println(nbreSecret);
				System.out.println("Veillez trouver le nombre secret entre 1 et 100 :");
				maCombinaison = sc.nextInt();
				sc.nextLine();
				if (maCombinaison < nbreSecret)
					System.out.println("Le nombre " + maCombinaison + " est inférieur au nombre secret !");
				else if (maCombinaison > nbreSecret)
					System.out.println("Le nombre " + maCombinaison + " est supérieur au nombre secret !");
				else
					System.out.println("Bravo ! Le nombre " + maCombinaison + " est bien le nombre secret.");
				if (essai == 4)
					System.out.println("\n\tDésolé, vous avez dépassé le nombre d'essai possible...!");
			} while (essai != 4 && maCombinaison != nbreSecret);
			do {
				// Génération d'une nouvelle valeur aléatoire à chaque nouveau lancement de
				// l'application
				nbreSecret = rand.nextInt(100 + 1);
				System.out.println("Voulez-vous rejouer ? (O/N)");
				reponse = sc.nextLine().charAt(0);
			} while (reponse != 'O' && reponse != 'N');
		} while (reponse == 'O');
		System.out.println("Au revoir...!");

	}

}
