import Loan.NationalBank;
import Loan.SecondTierBank;
import java.util.Scanner;

public class lab4 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) { // Автоматическое закрытие Scanner
            System.out.println("Выберите банк: \n1 - Национальный банк \n2 - Банк второго уровня");
            int choice = scanner.nextInt();

            System.out.print("Введите сумму депозита: ");
            double amount = scanner.nextDouble();

            System.out.print("Введите срок депозита (в месяцах): ");
            int duration = scanner.nextInt();

            System.out.print("Введите тип клиента (individual/legalEntity): ");
            String clientType = scanner.next();

            double result = 0;

            switch (choice) {
                case 1:
                    NationalBank nationalBank = new NationalBank();
                    result = nationalBank.calculateDeposit(amount, duration, clientType);
                    break;
                case 2:
                    SecondTierBank secondTierBank = new SecondTierBank();
                    result = secondTierBank.calculateDeposit(amount, duration, clientType);
                    break;
                default:
                    System.out.println("Ошибка выбора банка.");
                    return;
            }

            System.out.printf("Ожидаемый доход: %.2f%n", result);
        }
    }
}
