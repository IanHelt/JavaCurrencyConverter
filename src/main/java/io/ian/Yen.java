package io.ian;

public class Yen extends Money{

    public static void convertToDollar() {
        double yenAmount = getAmount();
        double rateDollar = 0.009;
        double result = yenAmount* rateDollar;
        System.out.println(result + " USD");
    }

    public static void convertToEuro() {
        double yenAmount = getAmount();
        double rateEuro = 0.0075;
        double result = yenAmount* rateEuro;
        System.out.println(result + " EUR");
    }

    public static void convertToBitcoin() {
        double yenAmount = getAmount();
        double rateBitcoin = 0.0000024;
        double result = yenAmount* rateBitcoin;
        System.out.println(result + " BTC");
    }

    public static void convertToYen() {
        System.out.println(getAmount() + " JPY");
    }

}
