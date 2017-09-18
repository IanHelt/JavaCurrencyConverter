package io.ian;

public class Money {

    private static double amount;

    public Money() {
    }

    public static double getAmount() {
        return Money.amount;
    }

    public static void setAmount(double input) {
        amount = input;
    }
}
