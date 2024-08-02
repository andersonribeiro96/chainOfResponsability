public class PaymentRequest {
    private double amount;
    private double balance;
    private boolean authorized;

    public PaymentRequest(double amount, double balance, boolean authorized) {
        this.amount = amount;
        this.balance = balance;
        this.authorized = authorized;
    }

    public double getAmount() {
        return amount;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public boolean isAuthorized() {
        return authorized;
    }
}
