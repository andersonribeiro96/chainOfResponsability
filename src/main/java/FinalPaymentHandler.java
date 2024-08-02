public class FinalPaymentHandler extends PaymentHandler {
    @Override
    public void handle(PaymentRequest request) {
        System.out.println("Processing payment of " + request.getAmount());
        request.setBalance(request.getBalance() - request.getAmount());
        System.out.println("Payment processed. New balance: " + request.getBalance());
    }
}
