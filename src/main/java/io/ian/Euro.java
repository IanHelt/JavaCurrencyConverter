package io.ian;

public class Euro extends Money{


    public static void convertToYen() {
        double euroAmount = getAmount();
        double rateYen = 132.5;
        double result = euroAmount* rateYen;
        System.out.println(result + " JPY");
    }

    public static void convertToDollar() {
        double euroAmount = getAmount();
        double rateDollar = 1.2;
        double result = euroAmount* rateDollar;
        System.out.println(result + " USD");
    }

    public static void convertToBitcoin() {
        double euroAmount = getAmount();
        double rateBitcoin = 0.00032;
        double result = euroAmount* rateBitcoin;
        System.out.println(result + " BTC");
    }

    public static void convertToEuro() {
        System.out.println(getAmount() + " EUR");
    }

}
