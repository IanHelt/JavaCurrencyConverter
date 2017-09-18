package io.ian;

public class Bitcoin extends Money{

    public static void convertToYen() {
        double bitcoinAmount = getAmount();
        double rateYen = 409502.44;
        double result = bitcoinAmount* rateYen;
        System.out.println(result + " JPY");
    }

    public static void convertToEuro() {
        double bitcoinAmount = getAmount();
        double rateEuro = 3100;
        double result = bitcoinAmount* rateEuro;
        System.out.println(result + " EUR");
    }

    public static void convertToDollar() {
        double bitcoinAmount = getAmount();
        double rateDollar = 3694.27;
        double result = bitcoinAmount* rateDollar;
        System.out.println(result + " USD");
    }

    public static void convertToBitcoin() {
        System.out.println(getAmount() + " BTC");
    }


}
