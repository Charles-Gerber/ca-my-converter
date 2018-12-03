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

    }
}
