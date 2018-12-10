import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // Trucs qu'on vous "donne" pour votre exercice
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        // Début de la ZONE d'exercice 🤓
        int numberToFind = random.nextInt(100);

        // Exercice 2 :
        // 1 - Saisie clavier du joueur pour lui faire deviner
        // 2 - Si il est en dessous lui dire "plus grand"
        // Sinon Si il est au dessus lui dire "plus petit"
        // Sinon le félicité ==> il a trouvé le résultat!

        // Exerice 3 : mettre autour du code de l'exercice 2 une boucle while. Pour cela
        // il va vous falloir:
        // 1 - un "while"
        // 2 - une variable qui vous dit si la partie est finie (de type boo... 😉)
        // 3 - probablement un peu d'aide

        // Exercice 1 :
        // afficher le numéro que le joueur devait trouver

        // Exercice 4 :
        // Ajouter à l'affichage final: le nombre de tentatives du joueur (exemple :
        // Vous avez mis 5 essais")


        // Rien à voir avec les exercices:
        scanner.close();
    }
}
