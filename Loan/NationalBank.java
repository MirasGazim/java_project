package Loan;

public class NationalBank {
    private static final double FIXEDBANKREWARD = 1.01; // 1% дохода
    private Calculator calculator;

    public NationalBank() {
        this.calculator = new Calculator();
    }

    public double calculateDeposit(double amount, int duration, String clientType) {
        return calculator.depositReward(amount, duration, clientType) * FIXEDBANKREWARD;
    }
}
