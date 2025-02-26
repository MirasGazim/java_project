package Loan;

class Calculator {
    private static final double RATEFORLEGALENTITIES = 0.08; // 8% годовых
    private static final double RATEFORINDIVIDUALS = 0.10;   // 10% годовых

    double depositReward(double amount, int duration, String clientType) {
        if (clientType.equals("individual")) {
            return amount + amount * RATEFORINDIVIDUALS * duration / 12.0;
        } else if (clientType.equals("legalEntity")) {
            return amount + amount * RATEFORLEGALENTITIES * duration / 12.0;
        } else {
            System.out.println("Ошибка! Неверный тип клиента.");
            return 0;
        }
    }
}
