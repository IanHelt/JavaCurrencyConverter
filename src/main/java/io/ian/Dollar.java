package io.ian;

public class Dollar extends Money{


    public static void convertToYen() {
        double amountDollars = getAmount();
        double rateYen = 110.88;
        double result = amountDollars* rateYen;
        System.out.println(result + " JPY");
    }

    public static void convertToEuro() {
        double amountDollars = getAmount();
        double rateEuro = 0.84;
        double result = amountDollars* rateEuro;
        System.out.println(result + " EUR");
    }

    public static void convertToBitcoin() {
        double amountDollars = getAmount();
        double rateBitcoin = 0.00028;
        double result = amountDollars* rateBitcoin;
        System.out.println(result + " BTC");
    }

    public static void convertToDollar() {
        System.out.println(getAmount() + " USD");
    }

}
