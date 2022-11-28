import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Bank bank = new Bank();
        bank.aboutBank();
        System.out.println();
        Bank.exchPrice();
        System.out.println();
        Scanner input = new Scanner(System.in);
        System.out.println("Enter amount many ");
        double value = input.nextDouble();
        System.out.println("Enter type money: 1 UAH, 2 USD, 3 EUR");
        int choice = input.nextInt();
        System.out.println("Enter what currency: 1 UAH, 2 USD, 3 EUR");
        int currency = input.nextInt();
        System.out.println("Your money = " + bank.exchMoney(value, choice, currency) + " " + bank.typeMoney(currency));

    }
}