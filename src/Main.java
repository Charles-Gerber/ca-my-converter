import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // Convertisseur 1 : USD <=> EUR
        MyConverter usdConverter = new MyConverter(0.876251, "USD");

        // Convertisseur 2 : Bitcoin <=> EUR
        MyConverter bitcoinConverter = new MyConverter(0.12, "Bitcoin");

        // Exercice 1 : Faire un saisie clavier du montant en Euros puis la convertir en
        // USD et Bitcoin

        /*
         * Pour rappel, voici comment nous convertissions la semaine dernière
         * usdConverter.convertFromEuros(1); usdConverter.convertToEuros(10);
         * bitcoinConverter.convertFromEuros(100); bitcoinConverter.convertToEuros(100);
         */

        /*
         * Exercice 2 : proposer à l'utilisateur quel convertisseur il veut utiliser.
         * tapes à suivre: 1 - Afficher la question à l'utilisateur (1) USD ou (2)
         * Bitcoin?" 2 - Faire une saisie clavier 3 - Faire un test "if" sur la valeur
         * saisie pour appeler converFromEuros du BON convertisseur
         */

    }
}
