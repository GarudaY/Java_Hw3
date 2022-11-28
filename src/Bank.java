public class Bank {
    private String title = "Normal Bank";
    private int year = 2022;
    private String address = "Example street 25";
    private static double UAH_USD = 0.025;
    private static double USD_UAH = 40.20;
    private static double UAH_EUR = 0.025;
    private static double EUR_UAH = 37.10;
    private static double USD_EUR = 0.95;
    private static double EUR_USD = 1.01;

    public void aboutBank() {
        System.out.println("Title = " + title + "\n" + "Year of creation = " + year + "\n" + "Address = " + address);
    }

    public static void exchPrice() {
        System.out.println(
                "100 UAH = " + (100 * UAH_USD) + " USD" + "\n" +
                        "100 UAH = " + (100 * UAH_EUR) + " EUR" + "\n" +
                        "1 USD = " + (1 * USD_UAH) + " UAH" + "\n" +
                        "1 EUR = " + (1 * EUR_UAH) + " UAH" + "\n" +
                        "1 USD = " + (1 * USD_EUR) + " EUR" + "\n" +
                        "1 EUR = " + (1 * EUR_USD) + " USD");
    }

    public double exchMoney(double value, int choice, int currency) {
        double clientMoney = 0;
        switch (choice) {
            case 1:
                switch (currency) {
                    case 1:
                        clientMoney = value * 1;
                        break;
                    case 2:
                        clientMoney = value * UAH_USD;
                        break;
                    case 3:
                        clientMoney = value * UAH_EUR;
                        break;
                }
                break;
            case 2:
                switch (currency) {
                    case 1:
                        clientMoney = value * USD_UAH;
                        break;
                    case 2:
                        clientMoney = value * 1;
                        break;
                    case 3:
                        clientMoney = value * USD_EUR;
                        break;
                }
                break;
            case 3:
                switch (currency) {
                    case 1:
                        clientMoney = value * EUR_UAH;
                        break;
                    case 2:
                        clientMoney = value * EUR_USD;
                        break;
                    case 3:
                        clientMoney = value * 1;
                        break;
                }
                break;
        }
        return clientMoney;
    }

    public String typeMoney(int currency) {
        String value = "";
        switch (currency) {
            case 1:
                value = " UAH";
                break;
            case 2:
                value = " USD";
                break;
            case 3:
                value = " EUR";
                break;
        }
        return value;
    }
}
