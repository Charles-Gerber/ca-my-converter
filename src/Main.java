public class Main {

    public static void main(String[] args) {

        // 1 - Créer notre objet convertisseur pour les dollars
        MyConverter usdConverter = new MyConverter(0.876251, "USD");
        usdConverter.convertFromEuros(1);
        usdConverter.convertToEuros(10);

        // exo 2 : instancier un convertisseur bitcoin 3487.23
        MyConverter bitcoinConverter = new MyConverter(0.12, "Bitcoin");
        bitcoinConverter.convertFromEuros(100);
        bitcoinConverter.convertToEuros(100);
    }
}
