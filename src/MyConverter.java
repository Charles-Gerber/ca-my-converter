public class MyConverter {

    private double rate;
    // Exo 4 : ajouter la currency à la classe et l'afficher au moment de la 
    // onversion
    private String currency;

    public MyConverter(double rate, String currency) {
        this.rate = rate;
        this.currency = currency;
    }

    public void convertFromEuros(double amount) {
        // 1 - Calculer le nouveau montant
        double result = rate * amount;
        System.out.print(result);
        System.out.print(" ");
        System.out.println(this.currency);
    }

    // Exo 3 : écrire la méthode qui convertie en euros
    public void convertToEuros(double amount) {
        // 1 - Calculer le nouveau montant
        double result = amount / rate;
        System.out.print(result);
        System.out.print(" ");
        System.out.println("Euros");
    }
}
