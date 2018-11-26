public class MyConverter {

    private double taux;
    // Exo 4 : ajouter la currency à la classe et l'afficher au moment de la conversion
    private String currency;

    public MyConverter(double taux, String currency) {
        this.taux = taux;
        this.currency = currency;
    }

    public void convertFromEuros(double amount) {
        // 1 - Calculer le nouveau montant
        double result = taux * amount;
        System.out.print(result);
        System.out.print(" ");
        System.out.println(this.currency);
    }

    // Exo 3 : écrire la méthode qui convertie en euros
    public void convertToEuros(double amount) {
        // 1 - Calculer le nouveau montant
        double result = amount / taux;
        System.out.print(result);
        System.out.print(" ");
        System.out.println("Euros");
    }
}
