package Loan;

public class SecondTierBank {
    private static final double FIXEDBANKREWARD = 1.02; // 2% дохода
    private Calculator calculator;

    public SecondTierBank() {
        this.calculator = new Calculator();
    }

    public double calculateDeposit(double amount, int duration, String clientType) {
        return calculator.depositReward(amount, duration, clientType) * FIXEDBANKREWARD;
    }
}
