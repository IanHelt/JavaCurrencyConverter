
package io.ian;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Premium Limited Special Edition Currency Converter Turbo");
        System.out.println("Please input the amount of the currency you wish to convert");

        Double amountInput = Double.parseDouble(scanner.nextLine());
        Money.setAmount(amountInput);

        System.out.println("Please input initial currency type: USD, BTC, EUR, JPY");

            String typeInput = scanner.nextLine();

            if (typeInput.equals("USD")) {

                System.out.println("Please input the currency you would like to convert to: USD, BTC, EUR, JPY");

                String convertInput = scanner.nextLine();

                if (convertInput.equals("USD")) {
                    Dollar.convertToDollar();

                } else if (convertInput.equals("BTC")) {
                    Dollar.convertToBitcoin();

                } else if (convertInput.equals("EUR")) {
                    Dollar.convertToEuro();

                } else if (convertInput.equals("JPY")) {
                    Dollar.convertToYen();
                }

            } else if (typeInput.equals("BTC")) {

                System.out.println("Please input the currency you would like to convert to: USD, BTC, EUR, JPY");

                String convertInput = scanner.nextLine();

                if (convertInput.equals("USD")) {
                    Bitcoin.convertToDollar();

                } else if (convertInput.equals("BTC")) {
                    Bitcoin.convertToBitcoin();

                } else if (convertInput.equals("EUR")) {
                    Bitcoin.convertToEuro();

                } else if (convertInput.equals("JPY")) {
                    Bitcoin.convertToYen();

                }

            } else if (typeInput.equals("EUR")) {

                System.out.println("Please input the currency you would like to convert to: USD, BTC, EUR, JPY");

                String convertInput = scanner.nextLine();

                if (convertInput.equals("USD")) {
                    Euro.convertToDollar();

                } else if (convertInput.equals("BTC")) {
                    Euro.convertToBitcoin();

                } else if (convertInput.equals("EUR")) {
                    Euro.convertToEuro();

                } else if (convertInput.equals("JPY")) {
                    Euro.convertToYen();

                }

            } else if (typeInput.equals("JPY")) {

                System.out.println("Please input the currency you would like to convert to: USD, BTC, EUR, JPY");

                String convertInput = scanner.nextLine();

                if (convertInput.equals("USD")) {
                    Yen.convertToDollar();

                } else if (convertInput.equals("BTC")) {
                    Yen.convertToBitcoin();

                } else if (convertInput.equals("EUR")) {
                    Yen.convertToEuro();

                } else if (convertInput.equals("JPY")) {
                    Yen.convertToYen();

                }

            } else {
                System.out.println("Please input a valid currency type");
            }
        }
    }
