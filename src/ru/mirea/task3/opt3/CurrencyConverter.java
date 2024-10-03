package ru.mirea.task3.opt3;

public class CurrencyConverter {
    private static final double USD_TO_RUB = 100.00;
    private static final double EUR_TO_RUB = 110.00;
    private static final double RUB_TO_USD = 1 / USD_TO_RUB;
    private static final double RUB_TO_EUR = 1 / EUR_TO_RUB;

    public static double convert(String fromCurrency, String toCurrency, double amount) {
        switch (fromCurrency.toUpperCase()) {
            case "USD":
                if (toCurrency.equalsIgnoreCase("RUB")) {
                    return amount * USD_TO_RUB;
                } else if (toCurrency.equalsIgnoreCase("EUR")) {
                    return amount * USD_TO_RUB / EUR_TO_RUB;
                }
                break;
            case "EUR":
                if (toCurrency.equalsIgnoreCase("RUB")) {
                    return amount * EUR_TO_RUB;
                } else if (toCurrency.equalsIgnoreCase("USD")) {
                    return amount * EUR_TO_RUB / USD_TO_RUB;
                }
                break;
            case "RUB":
                if (toCurrency.equalsIgnoreCase("USD")) {
                    return amount * RUB_TO_USD;
                } else if (toCurrency.equalsIgnoreCase("EUR")) {
                    return amount * RUB_TO_EUR;
                }
                break;
            default:
                throw new IllegalArgumentException("Неизвестная валюта: " + fromCurrency);
        }
        return amount;
    }
}
